import java.util.Scanner;

public class Adiviname {
    public static void main(String[] args){

        Scanner get= new Scanner(System.in);
        int rand, userNum;


        //numero entre 0 y 100
        rand = (int) ((Math.random()*(100-1+1))+1);

        System.out.print("Adivina el numero que estoy pensando del 1 al 100 : ");
        userNum = get.nextInt();
        
        if (userNum == rand){
            System.out.println("Adivinaste");
        }else{
            System.out.println("Intentalo denuevo era : " + rand);
        }


    }
    
}
