import java.util.Scanner;
public class ejemploDeArrays2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean salirDelJuego = false;
        String opcionDelUsuario;

        int x = 0, y = 0;
        int[][] unArray2D = { { 0, 1, 3, 3, 0, 0, 0, 0, 0 }, { 0, 1, 2, 3, 0, 0, 0, 0, 0 },
                { 0, 1, 2, 2, 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 5, 5, 0, 0, 0, 0, 0, 0, 0 }, { 4, 4, 4, 5, 0, 0, 0, 0, 0 }, { 4, 4, 0, 0, 0, 0, 0, 0, 0 },
                { 4, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

        do {
            System.out.println("-------------------------");
        for (int miFila = 0; miFila < unArray2D.length; miFila++) {
            //
            for (int miColumna = 0; miColumna < unArray2D[miFila].length; miColumna++) {
                if (miFila == y && miColumna == x) {
                    System.out.print("<>");
                } else if (unArray2D[miFila][miColumna] == 0) {
                    System.out.print(" . ");
                } else if (unArray2D[miFila][miColumna] == 1) {
                    System.out.print("[#]");
                } else if (unArray2D[miFila][miColumna] == 2) {
                    System.out.print(":..");
                } else if (unArray2D[miFila][miColumna] == 3) {
                    System.out.print("~~~");
                } else if (unArray2D[miFila][miColumna] == 4) {
                    System.out.print(".oO");
                } else if (unArray2D[miFila][miColumna] == 5) {
                    System.out.print("0()");
                } else if (unArray2D[miFila][miColumna] == 6) {
                    System.out.print(":::");
                }
            }
            System.out.println("");
        }
        System.out.println("-------------------------");

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
        }

    } while (!salirDelJuego);

    }
}

