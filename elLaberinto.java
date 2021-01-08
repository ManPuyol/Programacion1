import java.util.Scanner;
public class elLaberinto{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int miFila=0		, miColumna=0;
		int personajeFila=0	, personajeColumna=0;
		int salir=0;
		int rangoAntorcha=3;
		int llave=0;
		
		String ordenUsuario;
		
		int[][] elMundo = {
			{0,5,5,5,5,5,5,5,5,5,5,5,5,5,3,3,3,3,3,5,5,5,5,5,5,3,3,3,3},
			{0,1,3,5,3,2,3,3,2,0,1,1,0,0,0,0,0,3,3,2,0,1,1,0,0,0,0,0,3},
			{0,0,1,0,1,1,1,3,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1},
			{0,0,1,0,1,0,0,3,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,4,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,1,1,0,1},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
			{1,1,0,0,1,1,1,0,1,0,0,0,0,1,1,1,0,1,0,1,0,0,0,0,1,1,1,0,1},
			{0,1,1,0,0,0,0,0,2,2,2,1,0,1,0,0,0,0,0,2,2,2,1,0,1,0,0,0,0},
			{0,0,0,0,1,0,1,0,2,2,2,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,0,0,0},
			{0,1,0,0,0,0,0,0,0,2,2,2,2,1,1,1,0,1,0,0,2,2,2,2,1,1,1,0,1},
			{0,0,0,0,1,1,1,0,1,0,0,0,2,1,1,1,0,1,0,1,0,0,0,2,1,1,1,0,1},
			{0,1,1,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1,0,1,0,1,1,0,0,0,0,0,1},
			{0,0,1,0,1,1,1,0,1,0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,1},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
			{0,0,1,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,1,1,0,1},
			{1,0,0,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
			{1,0,0,0,1,0,1,7,1,6,1,0,0,1,1,1,0,1,0,1,1,1,0,0,1,1,1,0,1},
			{0,0,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0}
		};
		do {
			// INICIO IMPRESION DE MAPA (INCLUYE AL PERSONAJE) 
				System.out.print("+==="); 
				for (miFila=0;miFila<elMundo[0].length-2; miFila=miFila+1){System.out.print("===");};
				System.out.println("===+");
				
					for (miFila=0; miFila<elMundo.length; miFila=miFila+1){
						System.out.print("|");
						for (miColumna=0; miColumna<elMundo[miFila].length; miColumna=miColumna+1){
							
							if ((miColumna>=personajeColumna-rangoAntorcha) && 
									(miColumna<=personajeColumna+rangoAntorcha) && 
									(miFila>=personajeFila-rangoAntorcha) && 
									(miFila<=personajeFila+rangoAntorcha)) {

								if ((miFila==personajeFila) && (miColumna==personajeColumna)) {
									System.out.print("\\O/");
								} else {
									// Terreno franqueable (PAR)
									if (elMundo[miFila][miColumna]==0) {System.out.print(" . ");}
									if (elMundo[miFila][miColumna]==2) {System.out.print("oO.");}	
									if (elMundo[miFila][miColumna]==4) {System.out.print(" K ");}
									if (elMundo[miFila][miColumna]==6) {System.out.print("[ ]");}								
									

									// Terreno infranqueable (IMPAR)
									if (elMundo[miFila][miColumna]==1) {System.out.print("[=]");}						
									if (elMundo[miFila][miColumna]==3) {System.out.print("vVv");}	
									if (elMundo[miFila][miColumna]==5) {System.out.print("VVV");}		
									if (elMundo[miFila][miColumna]==7) {System.out.print("[|]");}									
								}	
								
							} else {

								System.out.print("***");
								
							}
						
				
						}
						System.out.println("|");
					}
					
					
				System.out.print("+==="); 
				for (miFila=0;miFila<elMundo[0].length-2; miFila=miFila+1){System.out.print("===");};
				System.out.println("===+");
			// FIN DE IMPRESION DE MAPA (INCLUYE AL PERSONAJE) 
			if((personajeFila==4) && (personajeColumna==4)){
									System.out.print("\\O/");
									llave=llave + 1;
									System.out.println("tiene la llave"+llave);
			}
			// Gestión del movimiento
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Ingrese comando (w/a/s/d/Mirar/Salir)");
			ordenUsuario = entrada.nextLine();
			System.out.println("-------------------------------------------------------------------------");
			
			rangoAntorcha=3;
			
			
			if (ordenUsuario.equalsIgnoreCase("w") && personajeFila>0 )	{ 
				if (elMundo[personajeFila-1][personajeColumna]%2==0) {personajeFila = personajeFila-1;}				
			}
			
			if (ordenUsuario.equalsIgnoreCase("s")   && personajeFila<elMundo.length-1 )	{ 
				if (elMundo[personajeFila+1][personajeColumna]%2==0) {personajeFila = personajeFila+1;}				
			}
			
			if (ordenUsuario.equalsIgnoreCase("d")  && personajeColumna < elMundo[personajeFila].length-1 )	{ 
				if (elMundo[personajeFila][personajeColumna+1]%2==0) {personajeColumna = personajeColumna+1;}	
			}
			
			if (ordenUsuario.equalsIgnoreCase("a") && personajeColumna>0 )	{ 
				if (elMundo[personajeFila][personajeColumna-1]%2==0) {personajeColumna = personajeColumna-1;}	
			}
			
			if (ordenUsuario.equalsIgnoreCase("q") && personajeFila>0 && personajeColumna>0 )	{ 
				if (elMundo[personajeFila-1][personajeColumna-1]%2==0) {personajeFila = personajeFila-1; personajeColumna = personajeColumna-1;}				
			}			

			if (ordenUsuario.equalsIgnoreCase("e") && personajeFila>0 && personajeColumna < elMundo[personajeFila].length-1 )	{ 
				if (elMundo[personajeFila-1][personajeColumna+1]%2==0) {personajeFila = personajeFila-1; personajeColumna = personajeColumna+1;}				
			}						
			
			if (ordenUsuario.equalsIgnoreCase("g")){
				rangoAntorcha = 1000;
			}
			
			if (ordenUsuario.equalsIgnoreCase("salir")) 	{ salir=1;}
			// Fin de la gestión del movimiento
			
			// System.out.println("FILA="+personajeFila+" COLUMNA="+personajeColumna);
		} while (salir!=1);		
	}
}