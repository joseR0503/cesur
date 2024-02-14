package practicas;

import java.util.Random;
import java.util.Scanner;

public class PracticasArray {
	//PEDIR POR TECLADO EL TAMAÑO DEL ARRAY.
	//CONSTRUIR ARRAY DE INT DE ESE TAMAÑO.
	//PEDIR RANGO DE VALORES QUE SE QUIEREN  INTRODUCIR:
	//MAXIMO Y MINIMO. [MAX..MIN].
	//INTRODUCIR ESOS VALORES EN EL ARRAY DE FORMA ALEATORIA HASTA LLENARLO.
	//VALORES POSITIVOS.
	
	// ALMACENAR EN UN ARRAY LOS NUMEROS PARES Y EN OTRO LOS IMPARES
	// PARA ELLO LO PRIMERO ES SABER CUANTOS HAY DE CADA 
	
	public static void main(String[] args) {
		
		
		
		int tamanho;
		Scanner teclado= new Scanner(System.in);
		Random aleatorio= new Random();
		System.out.println("introduce el tamaño del array");
		tamanho= teclado.nextInt();
		
		int[] miArray= new int[tamanho];
		
		int max;
		int min;
		
		System.out.println("introduce valor max");
		max= teclado.nextInt();
		
		System.out.println("introduce valor min");
		min=teclado.nextInt();
		
		for (int i=0; i<miArray.length; i++) {
			miArray[i]=aleatorio.nextInt(min,max);
		}
		
		for (int i=0; i<miArray.length; i++ ) {
			System.out.print(miArray[i]+" ");
		}
		
		
		int contadorPar = 0;
		int contadorImpar =0;
		
		for (int i=0; i<miArray.length; i++) {
			if (miArray[i] %2 == 0) {
				contadorPar++;
			}else {
				contadorImpar++;
			}
			
		}
		
		int[] arrayPar = new int[contadorPar];
		int[] arrayImpar = new int[contadorImpar];
		contadorPar=0;
		contadorImpar=0;
		for (int i=0; i<miArray.length; i++) {
			if (miArray[i] %2 == 0) {
				arrayPar[contadorPar] = miArray[i];
				contadorPar++;
				
			}else {
				arrayImpar[contadorImpar] = miArray[i];
				contadorImpar++;
			}
		}
		
		for (int i=0; i<arrayPar.length; i++) {
			System.out.print(arrayPar[i] + " ");
		}
		
		for (int i=0; i<arrayImpar.length; i++) {
			System.out.print(arrayImpar[i] + " ");
		}
		
		
		
		
		
		
		teclado.close();
		
	}

}
