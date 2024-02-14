package animales;
import java.util.Random;

public class UsoAnimales {

	public static void main(String[] args) {
    //  CREAR UN ARRAY DE 10 ENTEROS QUE SE LLAME ENTEROS
		Random aleatorio = new Random();
		int[] enteros;
		enteros = new int[10];
		for (int i=0; i<enteros.length; i++) {
			enteros[i]= aleatorio.nextInt(10);
		}
		
		int numero = aleatorio.nextInt(10);
		boolean encontrado = false;
		for (int i=0; i<enteros.length; i++) {
			if (enteros[i] == numero) {
				encontrado = true;
			}
		}
		
		System.out.println("Encontrado "+ numero+":" + encontrado);
		

	}

}
