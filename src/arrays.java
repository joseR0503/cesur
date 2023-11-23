import java.util.Random;

public class arrays {

	public static void main(String[] arg) {
		Random aleatorio;
		aleatorio = new Random();

		int[] listaIntegerImpares;

		int[] listaIntegerPares;

		int[] listaInteger = new int[10];

		int contadorP = 0;

		int contador;

		System.out.print("el array inicial es : [");
		for (int indice = 0; indice < listaInteger.length; indice++) {
			listaInteger[indice] = aleatorio.nextInt(1000);
			System.out.print(listaInteger[indice] + " ");
		}
		System.out.println( "]");

		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) == 0) {
				contadorP = contadorP + 1;

			}
		}

		//System.out.println(contadorP);

		System.out.print("el array de pares es : [");
		listaIntegerPares = new int[contadorP];
		contador = 0;
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) == 0) {
				listaIntegerPares[contador] = listaInteger[indice];
				System.out.print(listaIntegerPares[contador] + " ");
				contador++;
			}

		}
		System.out.println("]");
		
		System.out.print("el array de impares es : [");
		listaIntegerImpares = new int[listaInteger.length - contadorP];
		contador = 0;
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) != 0) {
				listaIntegerImpares[contador] = listaInteger[indice];
				System.out.print(listaIntegerImpares[contador] + " ");
				contador++;
			}
			
		}  
		System.out.print("]");
	}
}
