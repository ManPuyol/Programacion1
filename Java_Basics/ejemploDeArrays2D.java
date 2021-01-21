package Java_Basics;

import java.util.Scanner;

public class ejemploDeArrays2D {

    public static void Endline(int viewport) {
        for (int i = 0; i < (viewport * 2) - 1; i++) {
            System.out.print("---");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salirDelJuego = false;
        String opcionDelUsuario;

        int x = 8, y = 8, antorcha = 3, viewport = 7, miFila = 0, miColumna = 0;
        int[][] unArray2D = { { 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 4, 5, 5 },
                { 0, 1, 2, 1, 1, 1, 1, 2, 0, 0, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2, 4, 4, 4, 5, 5 },
                { 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 4, 5, 5 },
                { 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
                { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2 },
                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 0, 0, 0, 0, 2 },
                { 0, 1, 0, 0, 0, 0, 2, 2, 2, 2, 2, 0, 3, 3, 3, 0, 0, 0, 2, 6, 2, 2, 6, 2, 2, 2 },
                { 0, 0, 0, 0, 0, 1, 1, 4, 2, 2, 2, 3, 3, 2, 2, 4, 0, 0, 2, 6, 2, 2, 6, 1, 0, 1 },
                { 1, 2, 1, 0, 0, 0, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 0, 0, 2, 6, 2, 2, 6, 1, 0, 2 },
                { 1, 0, 1, 0, 0, 0, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 0, 0, 0, 6, 2, 2, 6, 1, 0, 2 },
                { 1, 0, 1, 0, 0, 0, 2, 4, 3, 2, 2, 2, 2, 2, 2, 4, 0, 0, 0, 6, 2, 2, 6, 1, 0, 2 },
                { 1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 6, 2, 2, 6, 1, 0, 2 },
                { 3, 3, 3, 0, 0, 0, 1, 4, 3, 3, 3, 2, 2, 2, 2, 4, 0, 0, 0, 6, 2, 2, 6, 1, 1, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 3, 3, 3, 3, 3, 2, 2, 2, 2, 0, 0, 0, 6, 2, 2, 6, 2, 2, 2 },
                { 1, 0, 1, 0, 0, 0, 0, 3, 3, 3, 3, 3, 2, 2, 2, 2, 0, 0, 0, 6, 2, 2, 6, 2, 2, 2 },
                { 1, 3, 1, 0, 0, 0, 0, 4, 3, 3, 3, 2, 2, 2, 2, 4, 0, 0, 0, 6, 2, 2, 6, 2, 2, 2 },
                { 1, 1, 1, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 6, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 1, 4, 2, 2, 2, 2, 2, 2, 2, 4, 0, 0, 4, 6, 2, 2, 6, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 2, 4, 6, 2, 2, 6, 1, 0, 1 },
                { 1, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 4, 4, 4, 6, 2, 2, 6, 1, 0, 1 }, };
        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {
            System.out.print("\033[0;0H");
            System.out.flush();

            Endline(viewport);// Imprime linea punteada del inicio
            System.out.println("");
            for (miFila = 0; miFila < unArray2D.length; miFila++) {// RECORRER FILA

                if (Math.abs(miFila - y) < viewport) { // CONDICIONAL VIEWPORT FILA

                    for (miColumna = 0; miColumna < unArray2D[miFila].length; miColumna++) {// RECORRER COLUMNA

                        if (Math.abs(miColumna - x) < viewport) { // CONDICIONAL VIEWPORT COLUMNA

                            if (miFila == y && miColumna == x) {
                                System.out.print("<M>");
                                // } else if (Math.abs(miColumna - x) < antorcha && Math.abs(miFila - y) <
                                // antorcha) {// CONDICION PARA ANTORCHA CUADRADA
                            } else if (Math.pow(miColumna - x, 2) + Math.pow(miFila - y, 2) <= Math.pow(antorcha, 2)) { // CONDICION
                                                                                                                        // PARA
                                                                                                                        // ANTORCHA
                                                                                                                        // CIRCULAR
                                if (unArray2D[miFila][miColumna] == 0) {
                                    System.out.print(" . ");
                                } else if (unArray2D[miFila][miColumna] == 1) {
                                    System.out.print("[#]");
                                } else if (unArray2D[miFila][miColumna] == 2) {
                                    System.out.print(":..");
                                } else if (unArray2D[miFila][miColumna] == 3) {
                                    System.out.print("~~~");
                                } else if (unArray2D[miFila][miColumna] == 4) {
                                    System.out.print("*.*");
                                } else if (unArray2D[miFila][miColumna] == 5) {
                                    System.out.print("*O*");
                                } else if (unArray2D[miFila][miColumna] == 6) {
                                    System.out.print(":::");
                                }
                            } else {
                                System.out.print("   ");/// ??? espacios invicibles
                            }
                        }
                    }
                    System.out.println("");// FIN DE LA COLUMNA Y ENTRA A LA SIGUIENTE FILA

                }
            }
            if (antorcha == 10000) {
                antorcha = 3;
            }
            Endline(viewport);// Imprime linea punteada del final
            // System.out.println("---------------------------------------");
            System.out.println("\nIngrese opcion w/a/s/d (f:Salir)");

            opcionDelUsuario = in.nextLine();

            if (opcionDelUsuario.equals("f")) {
                salirDelJuego = true;
            } else if (opcionDelUsuario.equals("w")) {
                y--;
            } else if (opcionDelUsuario.equals("a")) {
                x--;
            } else if (opcionDelUsuario.equals("s")) {
                y++;
            } else if (opcionDelUsuario.equals("d")) {
                x++;
            } else if (opcionDelUsuario.equals("g")) {
                antorcha = 10000;
            }

        } while (!salirDelJuego);

    }

    
}
