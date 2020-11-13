public class formatoDecimal {


    public static void main(String[] args) {
        
        double numeroAleatorio = Math.random();
        System.out.println(numeroAleatorio);

        double randF = (double) ((int)( numeroAleatorio * 1000));//Saco 3 primeras cifras significativas
        double randFF= ((double)((int)(randF/10))/100);//tomo el numero formateado en 2 cifras significativas
       // System.out.println(randF);
        //System.out.println(randFF);
            //tercer digito
            int tercerDigito = (int)(randF-(((int)(randF/10))*10));
            //System.out.println(tercerDigito);
            if (tercerDigito >= 5){
                randFF = randFF + 0.01; 
            }
            System.out.println(randFF);



    }
    
    
    
}
