import java.util.Random;

public class arrays {

	public static void main(String[] arg) {
		Random aleatorio;
		aleatorio = new Random();

		int[] listaIntegerImpares;

		int[] listaIntegerPares;

		int[] listaInteger = new int[10];

		int contadorP = 0;

		// int contador;

		int contadorPar;
		int contadorImpar;

		System.out.print("el array inicial es : [");
		for (int indice = 0; indice < listaInteger.length; indice++) {
			listaInteger[indice] = aleatorio.nextInt(1000);
			System.out.print(listaInteger[indice] + " ");
		}
		System.out.println("]");

		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) == 0) {
				contadorP = contadorP + 1;

			}
		}

		// System.out.println(contadorP);

		
		listaIntegerPares = new int[contadorP];
		contadorPar = 0;
		listaIntegerImpares = new int[listaInteger.length - contadorP];
		contadorImpar = 0;

		for (int indice = 0; indice < listaInteger.length; indice++) {
			if ((listaInteger[indice] % 2) == 0) {
				listaIntegerPares[contadorPar] = listaInteger[indice];
				contadorPar++;
			} else {

				listaIntegerImpares[contadorImpar] = listaInteger[indice];
				contadorImpar++;

			}
		}
		System.out.print("el array par es :[");
		for (int indice = 0; indice < listaIntegerPares.length; indice++) {
			System.out.print(listaIntegerPares[indice] + " ");
		}
		System.out.println("]");

		System.out.print("el array impar es :[ ");
		for (int indice = 0; indice < listaIntegerImpares.length; indice++) {
			System.out.print(listaIntegerImpares[indice] + " ");
		}

		System.out.println("]");

	}
}
