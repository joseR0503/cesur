package practicas;

public class SimuladorLista {

	public static void main(String[] args) {

		MiArray antonio;
		MiArray anthony;
		antonio = new MiArray();
		anthony = new MiArray(40);

	}

}

class MiArray {

	// ATRIBUTOS

	int[] miArray;
	int numElem;
	static final int LONGITUD = 10;

	// CONSTRUCTORES

	MiArray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];

		for (int i = 0; i < longitud; i = i + 1) {
			miArray[i] = -1;

		}
	}

	MiArray() {
		numElem = 0;
		miArray = new int[LONGITUD];
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;

		}
	}

	// METODOS

	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {
		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];
		} else {
			return -1;
		}
	}

	public void resetear() {
		for (int i = 0; i < miArray.length; i = i + 1) {
			miArray[i] = -1;

		}

	}

	public void insertarValor(int valor) {

		if (numElem == miArray.length) {
			System.out.println("Array lleno");
		} else {
			miArray[numElem] = valor;
			numElem++;
		}

	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp = miArray[numElem - 1];
			numElem--;
			miArray[numElem] = -1;
			return temp;
		}

	}

	public int sacarValorPosicion() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			
			temp=miArray[0];
			for (int i = 0; i<numElem-1; i++) {
				miArray[i]=miArray[i+1];
			}
			miArray[numElem-1]=-1;
			numElem--;
			return temp;
		}

		

	}

}
