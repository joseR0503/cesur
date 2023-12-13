package practicas;

import java.util.Scanner;

public class metodos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor;
		int min;
		int max;

		do {
			System.out.println("Escribe el max");
			max = teclado.nextInt();
			System.out.println("Escribe el min");
			min = teclado.nextInt();
		} while (metodos.comprobarMaxMin(max, min ));
		do {
			System.out.println("Escribe el valor");
			valor = teclado.nextInt();
		} while (!metodos.comprobarValor(max, min, valor));

		System.out.println("Es cierto que el valor " + valor + " esta entre " + min + " y " + max + "?");
		System.out.println(metodos.comprobarValor(max, min, valor));

	}

	static boolean comprobarValor(int max, int min, int valor) {
		if (valor > max) {
			return false;
		} else if (valor < min) {
			return false;
		} else {
			return true;
		}

	}

	static boolean comprobarMaxMin(int max, int min, int valor) {
		if (min < max) {
			return true;
		} else {
			return false;
		}
	}
}