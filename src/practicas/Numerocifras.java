package practicas;

import java.util.Scanner;

public class Numerocifras {

	public static void main(String[] arng) {

		Scanner teclado = new Scanner(System.in);
		int num;
		int contador=1;
		
		
		do {
			System.out.println("introduce numero positivo: ");
			num= teclado.nextInt();
		}while (num<0);
		
		System.out.println("el numero termina siempre en:" +(num%10));
		while ((num/10)!=0) {
			num=num/10;
			contador++;
		}
          System.out.println("el numero tiene"+ contador + "cifras");
          System.out.println("el numero empieza en:" + num);
          
          teclado.close();
	}

}
