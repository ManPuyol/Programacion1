import java.util.Scanner;

public class ejemploDeMenu {
    public static void main(String[] args) {

        int opcionDelUsuario;
        boolean programaActivo = true;

        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("1 Ingresar Usuario");
            System.out.println("2 Editar usuario");
            System.out.println("3 Eliminar usuario");
            System.out.println("4 Listar todos los usuarios");
            System.out.println("5 Salir del programa");
            System.out.println("-----------------------------");
            System.out.print("Ingrese su opcion: ");

            opcionDelUsuario = cin.nextInt();

            switch (opcionDelUsuario) {
                case 1:
                    System.out.println("El usuario ha elegido 1");

                    break;
                case 2:
                    System.out.println("El usuario ha elegido 2");

                    break;
                case 3:
                    System.out.println("El usuario ha elegido 3");

                    break;
                case 4:
                    System.out.println("El usuario ha elegido 4");

                    break;
                case 5:
                    System.out.println("Adios");

                    break;
                default:
                    System.out.println("El usuario ha elegido Invalido");

                    break;
            }

        } while (programaActivo);
    }
}
