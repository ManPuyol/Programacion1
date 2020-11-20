public class elClimaHoy {
    public static void main(String[] args) {
        int rand = (int) (Math.random()*100);

        if (rand < 10){
            System.out.println("Lluvia exprema");
        }else if (rand > 10 && rand < 30){
            System.out.println("Lluvia");
        }else{ 
            System.out.println("No habra lluvia");
        }
    }
}
