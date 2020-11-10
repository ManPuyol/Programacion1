import java.util.Scanner;
public class juegoConDados {
    public static void main(String[] args) {
        //numero entre 1 y 6
        int dado, jugador1, jugador2, jugador3, jugador4, jugador5, limite;
        Scanner user = new Scanner(System.in);
        boolean win = false;
        String quienGano = "";

        //System.out.println("Dado: "+ dado );
        //System.out.println("Posicion del Jugador: "+ jugador1 );

        jugador1 = 1; 
        jugador2 = 1;
        jugador3 = 1;
        jugador4 = 1;
        jugador5 = 1;
        limite = 30;
        
        do{
            System.out.println("Pulse una tecla para lanzar el dado...");
            String pause = user.nextLine();
                
            dado = (int) ((Math.random()*(6-1))+1);
            jugador1 =  jugador1 + dado; 
            if (jugador1 >= limite){win = true; quienGano = "Jugador1";}
            for (int i=0; i <jugador1; i++) {System.out.print("::");}System.out.println("[J1]" + jugador1 );

            dado = (int) ((Math.random()*(6-1))+1);
            jugador2 =  jugador2 + dado; 
            if (jugador2 >= limite){win = true;quienGano = "Jugador2";}
            for (int i=0; i <jugador2; i++) {System.out.print("::");}System.out.println("[J2]"+ jugador2);

            dado = (int) ((Math.random()*(6-1))+1);
            jugador3 =  jugador3 + dado; 
            if (jugador3 >= limite){win = true;quienGano = "Jugador3";}
            for (int i=0; i <jugador3; i++) {System.out.print("::");}System.out.println("[J3]" + jugador3);

            dado = (int) ((Math.random()*(6-1))+1);
            jugador4 =  jugador4 + dado; 
            if (jugador4 >= limite){win = true;quienGano = "Jugador4";}
            for (int i=0; i <jugador4; i++) {System.out.print("::");}System.out.println("[J4]" + jugador4);

            dado = (int) ((Math.random()*(6-1))+1);
            jugador5 =  jugador5 + dado; 
            if (jugador5 >= limite){win = true;quienGano = "Jugador5";}
            for (int i=0; i <jugador5; i++) {System.out.print("::");}System.out.println("[J5]"+ jugador5);

        }while(win == false);

        System.out.println( quienGano + " Ha ganado.");
    }
    
}
