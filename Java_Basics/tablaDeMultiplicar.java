import java.util.Scanner;

public class tablaDeMultiplicar {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.println("Tablas de multiplicar");
        System.out.print("Ingrese la tabla: ");
        
        //Entrada del usuario
        int a = num.nextInt();

        System.out.println("--------------------");
        System.out.println("");


        //Impresion de la tabla
        for(int i = 1; i <=12 ;i= i+1){
           int r = a*i;
        System.out.println( a + " x " + i + " = " + r );
        }

    }
    
}
