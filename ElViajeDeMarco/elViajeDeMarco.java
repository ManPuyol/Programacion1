public class elViajeDeMarco {
    //Lanzar probabilidad
    //int rand = (int) (Math.random()*100);
    public static void main(String[] args) {

        
        double velocidadMarco, tiempoMarco, velocidadMadre, tiempoMadre, alcanceMarco, alcanceMadre, distancia;;
        int climaMarco, climaMadre, randMono, emocion, dia ;
        boolean modoDebug = true;
        
        distancia = 350;
        dia = 1;
    
        //Movimiento De Marco
        
        System.out.println("----------------------------------------");
        System.out.println("Dia de Marco");
        System.out.println("----------------------------------------");
       
        velocidadMarco = (Math.random()*(15-10))+10;
        tiempoMarco = (Math.random()*(10-8))+8;

        if (modoDebug) {
            System.out.println("> Velocidad de Marco: "+velocidadMarco);
            System.out.println("> Tiempo de Marco: "+tiempoMarco);    
        }

        //Clima Del Dia
            climaMarco = (int) (Math.random()*100);
            //lluvia fuerte
            if(climaMarco <= 10){
                System.out.println("- Lluvia fuerte");
                velocidadMarco = velocidadMarco * 0.25;
            }//lluvia normal
            else if (climaMarco > 10 && climaMarco < 40){
                System.out.println("- Lluvia normal");
                velocidadMarco = velocidadMarco * 0.75;
            }//Buen Dia
            else{
                System.out.println("- Buen Dia");

            }

        //El Mono De Marco
    
                //Mono se cansa
                randMono = (int) (Math.random()*100);
                if (randMono < 15){
                    System.out.println("El Mono se cansa");
                velocidadMarco = velocidadMarco * 0.9;
                }else{ 
                    if (modoDebug) {
                        System.out.println("> Mono no se cansa");
                    }
                }
                //Mono se escapa
                randMono = (int) (Math.random()*100);
                if (randMono < 25){
                    System.out.println("El Mono se escapa");
                tiempoMarco = tiempoMarco - 2;
                } else{ 
                    if (modoDebug) {
                        System.out.println("> Mono no se escapa");
                    }
                 }

        //Calculo de distancia recorrida de Marco ese dia
        alcanceMarco = velocidadMarco * tiempoMarco;

        System.out.println("Velocidad de Marco: "+velocidadMarco);
        System.out.println("Tiempo de Marco: "+tiempoMarco);
            if (modoDebug) {
                System.out.println("> Probabilidad de clima Marco: "+climaMarco);
            }
        System.out.println("Alcance de Marco: "+alcanceMarco);

    //Movimiento de la Madre
        System.out.println("----------------------------------------");
        System.out.println("Dia de la Madre");
        System.out.println("----------------------------------------");

        velocidadMadre = (Math.random()*(9-6))+6;
        tiempoMadre = (Math.random()*(9-6))+6;

        if (modoDebug) {
                System.out.println("Velocidad de La Madre: "+velocidadMadre);
                System.out.println("Tiempo de La Madre: "+tiempoMadre);
            }

        //Clima Del Dia
            climaMadre = (int) (Math.random()*100);
            //lluvia fuerte
            if(climaMadre <= 10){
                System.out.println("- Lluvia fuerte");
                velocidadMadre = velocidadMadre * 0.5;
            }//lluvia normal
            else if (climaMadre > 10 && climaMadre < 40){
                System.out.println("- Lluvia normal");
                velocidadMadre = velocidadMadre * 0.75;
            }//Buen Dia
            else{
                System.out.println("- Buen Dia");

            }
        
        //Calculo de distancia recorrida de la madre de Marco ese dia
        alcanceMadre = velocidadMadre * tiempoMadre;
        
        System.out.println("Velocidad de la Madre: "+velocidadMadre);
        System.out.println("Tiempo de la Madre: "+tiempoMadre);
        if (modoDebug) {
            System.out.println("> Probabilidad de clima Madre: " + climaMadre);
        }
        System.out.println("Alcance de la Madre: "+alcanceMadre);
        System.out.println("");

    //Calculo de distancia restante
        
        distancia = (distancia + alcanceMadre) - alcanceMarco;
        System.out.println("Distancia Restante: "+ distancia);

        distancia = 48;
        System.out.println("Distancia MOCK: "+ distancia);

        if (distancia < 50) {
            emocion = (int) (Math.random()*100);
            if (modoDebug) {
                System.out.println("> Emocion: " +emocion);
            }
            if (emocion <= 50) { 
                System.out.println("Marco se emociona y sale corriendo");
                alcanceMarco = alcanceMarco + 25;
                distancia = (distancia + alcanceMadre) - alcanceMarco;
                if (modoDebug) {
                    System.out.println("> Alcance de Marco emocionado: " + alcanceMarco);
                }
                
                System.out.println("Distancia Restante: "+ distancia);

            }
        }

        if (distancia <= 0) {
            System.out.println("*****************************************************");
            System.out.println("Al final del Dia "+ dia +" Marco encontra a su madre!!!");
            System.out.println("*****************************************************");   
        }



    }
}
