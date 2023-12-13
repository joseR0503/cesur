package practicas;
import java.util.Scanner;

public class diasSemana {
	
	
	public static void main (String[] args) {
		
		int semana =0;
	    int diaSemana=0; 
	    int filas=0;
	    Scanner teclado = new Scanner(System.in);
	    int dias;

	    int totalMeses;

	    
	    do { 
	    	System.out.print("Introduce un numero: ");
		    dias= teclado.nextInt();
		    
	    } while ( dias <1 || dias > 336);
	    
	    totalMeses= dias/28;	
	   
	   while (filas < totalMeses) {
		   
		   
		   switch(filas) {
		   case 0:
			   System.out.print("Enero" + " ");
			   break;
		   case 1:
			   System.out.print("Febrero" + " ");
			   break;
		   case 2:
			   System.out.print("Marzo" + " ");
			   break;
		   case 3:
			   System.out.print("Abril" + " ");
			   break;
		   case 4:
			   System.out.print("Mayo" + " ");
			   break;
		   case 5:
			   System.out.print("Junio" + " ");
			   break;
		   case 6:
			   System.out.print("Julio" + " ");
			   break;
		   case 7:
			   System.out.print("Agosto" + " ");
			   break;
		   case 8:
			   System.out.print("Septiembre" + " ");
			   break;
		   case 9:
			   System.out.print("Octubre" + " ");
			   break;
		   case 10:
			   System.out.print("Noviembre" + " ");
			   break;
		   case 11:
			   System.out.print("Diciembre" + " ");
			   break;
		   }
		   
			   
			   
	    
	    while (semana < 4) {
	    	 System.out.print("[");
	    	 
	    while (diaSemana < 7) {
	    	//System.out.print(" ");
	    	 
	    	switch(diaSemana) {
	    	case 0:
	    		System.out.print("L" + " ");
	    		break;
	    	case 1:
	    		System.out.print("M" + " ");
	    		break;
	    	case 2:
	    		System.out.print("X" + " ");
	    		break;
	    	case 3:
	    		System.out.print("J" + " ");
	    		break;
	    	case 4:
	    		System.out.print("V"+ " ");
	    		break;
	    	case 5:
	    		System.out.print("S" +" ");
	    		break;
	    	case 6:
	    		System.out.print("D");
	    		break;
	   
	    	}
	    	
	    	
	    	diaSemana = diaSemana +1;
	    	
	    }
	    
	    System.out.print("]");
	    
	    diaSemana = 0;
	    semana = semana +1;
	  
		}
		
	  semana = 0;
	  filas = filas +1;
	  System.out.println();
	 	}
	}
}
