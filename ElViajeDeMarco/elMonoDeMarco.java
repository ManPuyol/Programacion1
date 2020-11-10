package ElViajeDeMarco;

public class elMonoDeMarco {
    public static void main(String[] args) {
        //Lanzar probabilidad
        int rand = (int) (Math.random()*100);

        if (rand < 15){
            System.out.println("Mono se cansa");
        }else{ 
            System.out.println("Mono no se cansa");
        }
        //Lanzar probabilidad
        rand = (int) (Math.random()*100);
        if (rand < 20){
            System.out.println("Mono se escapa");
        }else{ 
            System.out.println("Mono no se escapa");
        }
    }
    
}
