import java.util.Scanner;

public class ejemploDeArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Cuantas notas tienes? ");
        int numeroNotas = in.nextInt();
        double[] misNotas;
        double promedio = 0;
        misNotas = new double[numeroNotas];

        for (int i = 0; i < numeroNotas; i++) {
            System.out.print("Ingrese nota [" + (i + 1) + "]: ");
            misNotas[i] = in.nextDouble();
        }
        System.out.println("Notas ingresadas:");
        System.out.println("-----------------");
        for (int i = 0; i < numeroNotas; i++) {
            System.out.println("La nota [" + (i + 1) + "] es : " + misNotas[i]);
            promedio += misNotas[i];
        }
        System.out.println("Promedio: " + (promedio / misNotas.length));

    }

}
