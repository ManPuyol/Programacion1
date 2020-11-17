///import java.util.Scanner;

public class ejemploRandom {
    public static void main(String[] args) {
        // double rand;

        // //Scanner add = new Scanner(System.in);
        // rand = Math.random();

        // System.out.println(rand);

        int rand;

        // Scanner add = new Scanner(System.in);

        // numero entre 0 y 100
        rand = (int) (Math.random() * 100);
        // numero entre 1 y 6
        rand = (int) ((Math.random() * (6 - 1)) + 1);

        System.out.println(rand);

    }

}