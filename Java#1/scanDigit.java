import java.util.Scanner;

public class scanDigit {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        
        int a ;
        int b ;
        int c ;

        System.out.println("Introduzca 3 numeros de 3 digitos");
        System.out.print("1 --> ");
        a = cin.nextInt();
        System.out.print("2 --> ");
        b = cin.nextInt();
        System.out.print("3 --> ");
        c = cin.nextInt();

        a = a/100;
        b = (b-((b/100)*100))/10;
        //c = (c-((c/100)*100));
        c = c-((c/10)*10);
        




        System.out.println("" + a + "" + b + "" + c);


        
    }

}