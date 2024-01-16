package practicas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		String palabra;
		char[] cadena;
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduce una palabra: ");
		palabra = teclado.nextLine();

		cadena = palabra.toCharArray();
		
		// LONGITUD PAR
		boolean esPalindromo = true;
		int j = cadena.length ;
		int i =0;
		while (esPalindromo && (i<cadena.length/2)) {
			j = j -1;
			if (cadena[i]!=cadena[j]) {
				esPalindromo = false;
			}
			i++;
			
			
			
		}
		
		
		System.out.println("la palabra es palindromo?:" +esPalindromo);
		
	}
	
	
	

}
