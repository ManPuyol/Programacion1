public class formatoDecimal {


    public static void main(String[] args) {
        
        double numeroAleatorio = Math.random();
        System.out.println(numeroAleatorio);

        double numeroAFormatear = (double) ((int)( numeroAleatorio * 1000));//Saco 3 primeras cifras significativas
        double numeroFormateado= ((double)((int)(numeroAFormatear/10))/100);//tomo el numero formateado en 2 cifras significativas
            //tercer digito
            int tercerDigito = (int)(numeroAFormatear-(((int)(numeroAFormatear/10))*10));
            //System.out.println(tercerDigito);
            if (tercerDigito >= 5){
                numeroFormateado = numeroFormateado + 0.01; 
            }
            System.out.println(numeroFormateado);



    }
    
    
    
}
