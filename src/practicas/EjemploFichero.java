package practicas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero {

	public static void main(String[] args) throws IOException {
		// TRABAJAR CON CARACTERES
		// LECTURA DE FICHERO
		// ESCRITURA DE UN FICHERO
		// ESCRITURA DE UN FICHERO, AL FINAL DEL MISMO
		
		// FLUJO DE LECTURA
		FileReader entrada = null;
		boolean nofin = true;
		char caracter;
		try {
			entrada = new FileReader("pruebaFichero.txt");
			
			do {
			caracter=(char) entrada.read();
			if (caracter == (char) -1) {
				nofin = false;
			}else {
			System.out.print(caracter);
			}
			
			}while (nofin);
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} finally {
			if (entrada!=null) {
				entrada.close();
			}
		} // FIN TRY-CATCH
		
		System.out.println();
		
		String frase= "esto es una prueba de escritura de fichero";
		char[] fraseArray = new char[frase.length()];
		for (int i=0; i<frase.length(); i++) {
			fraseArray[i]=frase.charAt(i);
		}
		
		FileOutputStream salida = null;
		
		
		try {
			salida = new FileOutputStream("pruebaFichero.txt", true);
			for (int i=0; i<fraseArray.length; i++) {
				salida.write(fraseArray[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} finally {
			if (salida!= null) {
				salida.close();
			}
		}
		
		System.out.println("introduce una frase");
		Scanner teclado = new Scanner(System.in);
		String fraseTeclado= teclado.nextLine();
		char[] fraseA = new char[fraseTeclado.length()];
		for (int i=0; i<fraseTeclado.length(); i++) {
			fraseA[i]=fraseTeclado.charAt(i);
			
		}
		
		FileOutputStream exit = null;
		
		try {
			exit = new FileOutputStream("pruebaFichero.txt",true);
			for (int i=0; i<fraseA.length; i++) {
				exit.write(fraseA[i]);
			}
			exit.write('\n');
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}finally {
			if (exit != null) {
				exit.close();
			}
		}
		teclado.close();
		

	}

}
