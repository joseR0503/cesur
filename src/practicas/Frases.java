package practicas;
import java.util.Scanner;

public class Frases {

	static final int CANTIDAD = 10;

	static String[] cadenas = new String[CANTIDAD];

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < CANTIDAD; x++) {
			System.out.print("Escribe una cadena de caracteres " + x + ": ");
			setValue(cadenas, x, teclado.nextLine());
		}
		for (int x = 0; x < CANTIDAD; x++) {
			System.out.println( getValue(cadenas, x));

		}
		teclado.close();

	}

	static String getValue(String[] cadenas, int posicion) {

		return cadenas[posicion];

	}

	String getValue(int posicion) {

		return cadenas[posicion];

	}

	static void setValue(String[] cadenas, int posicion, String newCadena) {
		cadenas[posicion] = newCadena;
		
	}

	void setvalue(String[] cadenas, int posicion, String newCadena) {

		cadenas[posicion] = newCadena;

	}

}
