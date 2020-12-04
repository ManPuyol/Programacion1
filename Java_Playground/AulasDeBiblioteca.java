import java.util.Scanner;

public class AulasDeBiblioteca {
    public static void main(String[] args) {

        int opcionDelUsuario;
        boolean programaActivo = true;
        String[] aulas = new String[6];
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("\n1 Listar aulas");
            System.out.println("2 Reservar aulas");
            System.out.println("3 liberar aulas");
            System.out.println("4 Salir del programa");
            System.out.println("-----------------------------");
            System.out.print("Ingrese su opcion: ");

            opcionDelUsuario = cin.nextInt();

            switch (opcionDelUsuario) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Listado de aulas");
                    for (int i = 0; i < 6; i++) {
                        if (aulas[i] == null) {
                            System.out.println("Aula [" + (i + 1) + "] - Libre");
                        } else {
                            System.out.println("Aula [" + (i + 1) + "] - Ocupada - " + aulas[i]);
                        }

                    }
                    System.out.println("-----------------------------");

                    break;
                case 2:
                    System.out.print("Elija el aula a reservar : ");
                    // Validar que el aula exista
                    do {

                        opcionDelUsuario = (cin.nextInt()) - 1;
                        if (opcionDelUsuario > 5 || opcionDelUsuario < 0) {
                            System.out.print("Aula inexistente porfavor selecione otra aula : ");
                        }
                    } while (opcionDelUsuario > 5 || opcionDelUsuario < 0);

                    if (aulas[opcionDelUsuario] == null) {

                        System.out.print("\nResponsable del aula : ");
                        aulas[opcionDelUsuario] = cin.next();
                        System.out.println("\nAula asignada");
                        System.out.println("-----------------------------");

                    } else {
                        System.out.println("Aula ocupada");
                        System.out.println("-----------------------------");

                    }

                    break;
                case 3:
                    System.out.print("\nElija el aula a liberar : ");
                    // Validar que el aula exista
                    do {

                        opcionDelUsuario = (cin.nextInt()) - 1;
                        if (opcionDelUsuario > 5 || opcionDelUsuario < 0) {
                            System.out.println("Aula inexistente porfavor selecione otra aula : ");
                        }
                    } while (opcionDelUsuario > 5 || opcionDelUsuario < 0);

                    aulas[opcionDelUsuario] = null;

                    System.out.println("\nAula Liberada");
                    System.out.println("-----------------------------");

                    break;
                case 4:
                    programaActivo = false;
                    System.out.println("\nAdios");

                    break;
                default:
                    System.out.println("\nEl usuario ha elegido Invalido");
                    break;
            }

        } while (programaActivo);

    }

}
