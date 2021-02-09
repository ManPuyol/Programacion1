import java.util.Scanner;

public class examenFinal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int dia = 0, miFila = 0, miColumna = 0, contagiados = 0, enfermos = 5, sanos = 0, mascarillas = 0;
        int contagio = (int) (Math.random() * 100);

        int[][] covid = { { 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, },
                { 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, }, };

                //He seleccionado esta configuracion de contagiados y mascarillas para asi reducir lo mas posible en numero de casos
                //aun asi he dejado aperturas en ciertos contagiados y asi ver claramente la esparcion, si cerrara esos huecos los casos serian muchos menos

        do {
            System.out.println("Dia: " + dia
                    + " --------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (miFila = 0; miFila < covid.length; miFila++) {
                for (miColumna = 0; miColumna < covid[miFila].length; miColumna++) {

                    if (covid[miFila][miColumna] == 0) {// Sanos
                        System.out.print("  '.'  ");
                    } else if (covid[miFila][miColumna] == 1) {// con mascarilla
                        System.out.print("  '='  ");

                    } else if (covid[miFila][miColumna] == 2) {// recien contagiados
                        System.out.print(" ['.'] ");

                    } else if (covid[miFila][miColumna] == 3) {// contagiados
                        System.out.print(" [*.*] ");

                        contagio = (int) (Math.random() * 100);
                        if (miFila > 0) {
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (miColumna > 0) {
                                    if (covid[miFila - 1][miColumna - 1] == 1) {// calcular fallo de mascarilla
                                        contagio = (int) (Math.random() * 100);
                                        if (contagio <= 2) {
                                            covid[miFila - 1][miColumna - 1] = 2;
                                            enfermos = enfermos + 1;
                                            
                                        }
                                    } else if (covid[miFila - 1][miColumna - 1] == 0) {// si esta sano se contagia
                                        covid[miFila - 1][miColumna - 1] = 2;
                                        enfermos = enfermos + 1;
                                       
                                        
                                    }
                                }
                            }
                            contagio = (int) (Math.random() * 100);
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (covid[miFila - 1][miColumna] == 1) {// calcular fallo de mascarilla
                                    contagio = (int) (Math.random() * 100);
                                    if (contagio <= 2) {
                                        covid[miFila - 1][miColumna] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                } else if (covid[miFila - 1][miColumna] == 0) {// si esta sano se contagia
                                    covid[miFila - 1][miColumna] = 2;
                                    enfermos = enfermos + 1;
                                    
                                }
                            }
                            contagio = (int) (Math.random() * 100);
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (miColumna < covid[miFila].length - 1) {
                                    if (covid[miFila - 1][miColumna + 1] == 1) {// calcular fallo de mascarilla
                                        contagio = (int) (Math.random() * 100);
                                        if (contagio <= 2) {
                                            covid[miFila - 1][miColumna + 1] = 2;
                                            enfermos = enfermos + 1;
                                            
                                        }
                                    } else if (covid[miFila - 1][miColumna + 1] == 0) {// si esta sano se contagia
                                        covid[miFila - 1][miColumna + 1] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                }
                            }
                        }
                        contagio = (int) (Math.random() * 100);
                        if (contagio <= 15) { // calculo la probabilidad de contagio
                            if (miColumna > 0) {
                                if (covid[miFila][miColumna - 1] == 1) {// calcular fallo de mascarilla
                                    contagio = (int) (Math.random() * 100);
                                    if (contagio <= 2) {
                                        covid[miFila][miColumna - 1] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                } else if (covid[miFila][miColumna - 1] == 0) {// si esta sano se contagia
                                    covid[miFila][miColumna - 1] = 2;
                                    enfermos = enfermos + 1;
                                    
                                }
                            }
                        }
                        contagio = (int) (Math.random() * 100);
                        if (contagio <= 15) { // calculo la probabilidad de contagio
                            if (miColumna < covid[miFila].length - 1) {
                                if (covid[miFila][miColumna + 1] == 1) {// calcular fallo de mascarilla
                                    contagio = (int) (Math.random() * 100);
                                    if (contagio <= 2) {
                                        covid[miFila][miColumna + 1] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                } else if (covid[miFila][miColumna + 1] == 0) {// si esta sano se contagia
                                    covid[miFila][miColumna + 1] = 2;
                                    enfermos = enfermos + 1;
                                    
                                }
                            }
                        }
                        contagio = (int) (Math.random() * 100);
                        if (miFila < covid.length - 1) {
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (miColumna > 0) {
                                    if (covid[miFila + 1][miColumna - 1] == 1) {// calcular fallo de mascarilla
                                        contagio = (int) (Math.random() * 100);
                                        if (contagio <= 2) {
                                            covid[miFila + 1][miColumna - 1] = 2;
                                            enfermos = enfermos + 1;
                                        
                                        }
                                    } else if (covid[miFila + 1][miColumna - 1] == 0) {// si esta sano se contagia
                                        covid[miFila + 1][miColumna - 1] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                }
                            }
                            contagio = (int) (Math.random() * 100);
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (miColumna > 0) {
                                    if (covid[miFila + 1][miColumna] == 1) {// calcular fallo de mascarilla
                                        contagio = (int) (Math.random() * 100);
                                        if (contagio <= 2) {
                                            covid[miFila + 1][miColumna] = 2;
                                            enfermos = enfermos + 1;
                                        
                                        }
                                    } else if (covid[miFila + 1][miColumna] == 0) {// si esta sano se contagia
                                        covid[miFila + 1][miColumna] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                }
                            }
                            contagio = (int) (Math.random() * 100);
                            if (contagio <= 15) { // calculo la probabilidad de contagio
                                if (miColumna < covid[miFila].length - 1) {
                                    if (covid[miFila + 1][miColumna + 1] == 1) {// calcular fallo de mascarilla
                                        contagio = (int) (Math.random() * 100);
                                        if (contagio <= 2) {
                                            covid[miFila + 1][miColumna + 1] = 2;
                                            enfermos = enfermos + 1;
                                            
                                        }
                                    } else if (covid[miFila + 1][miColumna + 1] == 0) {// si esta sano se contagia
                                        covid[miFila + 1][miColumna + 1] = 2;
                                        enfermos = enfermos + 1;
                                        
                                    }
                                }
                            }
                        } // fin del contagio

                    }
                }
                System.out.println("");
            }

            for (miFila = 0; miFila < covid.length - 1; miFila++) {
                for (miColumna = 0; miColumna < covid[miFila].length; miColumna++) {

                    if (covid[miFila][miColumna] == 2) {//parseo paraque los recien contagiados se conviertan en contagiados
                        contagiados = contagiados+1;
                        covid[miFila][miColumna] = 3;
                    }
                    if (covid[miFila][miColumna] == 1) {//parseo paraque los recien contagiados se conviertan en contagiados
                        mascarillas=mascarillas+1;
                    }
                    if (covid[miFila][miColumna] == 0) {//parseo paraque los recien contagiados se conviertan en contagiados
                        sanos= sanos+1;
                    }

                }

            }

            System.out.println("-------------------------------------");
            System.out.println("Total:" + covid.length * covid[0].length + " / Mascarillas:" + mascarillas + " / Sanos:"
                    + sanos + " / Enfermos:" + enfermos + " / Contagiados:" + contagiados + "");
            System.out.println("-------------------------------------");

            in.nextLine();
            dia = dia + 1;
            contagiados = 0;
            mascarillas= 0;
            sanos =0;

        } while (dia <= 7);

    }
}


