package practicas;

import java.util.Scanner;

public class metodos2 {

	static final int TOTALNUM = 10;
	static int[] arrayEnteros = new int[TOTALNUM];

	public static void main(String[] arg) {

		pideNumeros();
		imprimeNumeros();
		cambiaApar();
		reseteaNumeros();
		

	}

	// cuatro metodos
	// 1. solicita 10 numeros y los almaceno en array de int.

	static void pideNumeros() {

		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < TOTALNUM; x++) {
			System.out.print("escribe un numero: ");
			arrayEnteros[x] = teclado.nextInt();
		}
		teclado.close();
	}

	// 2. imprime del array de int solo los pares.
	static void imprimeNumeros() {

		for (int x = 0; x < TOTALNUM; x++) {

			if (arrayEnteros[x] % 2 == 0) {
				System.out.println(arrayEnteros[x]);
			}
		}

	}
	// 3. modifica el array poniendo todos los numeros pares, es decir, si el numero
	// es par lo mantiene
	// si no es par guarda el numero par siguente en esa posicion.

	static void cambiaApar() {

		for (int x = 0; x < TOTALNUM; x++) {

			if (arrayEnteros[x] % 2 != 0) {
				arrayEnteros[x] = arrayEnteros[x] + 1;

			}
		}

	}

	// 4. pon a cero todos los numeros del array
	static void reseteaNumeros() {
		
		for (int x = 0; x < TOTALNUM; x++) {
		arrayEnteros[x]=0;
		
		}

	}
	//5. pon a x todos los numeros del array.
	static void reseteaNumeros(int x) {
		
		for (int i = 0; x < TOTALNUM; x++ ) {
			arrayEnteros[x]=i;
			
		}
		
	}

}
