public class ejemploDeArrays2D {
    public static void main(String[] args) {

        int[][] unArray2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int miFila = 0; miFila < unArray2D.length; miFila++) {
            //
            for (int miColumna = 0; miColumna < unArray2D[miFila].length; miColumna++) {
                System.out.print(unArray2D[miFila][miColumna]);
            }
            System.out.println("");
        }
    }
}
