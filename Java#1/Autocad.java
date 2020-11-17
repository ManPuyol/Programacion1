public class Autocad {
    public static void main(String[] args) {
        int plantas, ventanas;
        plantas = (int) ((Math.random() * (10 - 5)) + 5);

        System.out.println(plantas + " Plantas");

        System.out.println("+------------+");
        // Imprimir plantas
        for (int i = 0; i < plantas; i++) {
            System.out.print("|");

            // Imprimir Ventanas
            ventanas = (int) (Math.random() * 5);
            for (int j = 1; j <= ventanas; j++) {
                // Ventana abierta o cerrada--------
                int abierta = (int) (Math.random() * 100);
                if (abierta > 50) {
                    // Luz encendida o apagada------
                    int encendida = (int) (Math.random() * 100);
                    if (encendida > 50) {
                        System.out.print("[*]");
                    } else {
                        System.out.print("[ ]");
                    } // ----------------------------
                } else {
                    System.out.print("[#]");
                } // --------------------------------
            }
            // Espacios----------------------------
            int espacios = 4 - ventanas;
            for (int j = 0; j < espacios; j++) {
                System.out.print("   ");
            }
            // ------------------------------------
            System.out.println("|");
        }
        System.out.println("==============");
    }
}
