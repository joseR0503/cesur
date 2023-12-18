package practicas;

public class Fibonacci {
	
	public static void main (String[] args) {
		
		int maxNumFib = 100;
		int contador = 0;
		int numAnt = 1;
		int numActual = 1;
		int temp=0;
		System.out.print(numAnt + " ");
		System.out.print(numActual + " ");
		while (contador<maxNumFib) {
			
			temp=numAnt+numActual;
			System.out.print(temp + " ");
			numAnt=numActual;
			numActual=temp;
			contador++;
		}
				
	}
	


}
