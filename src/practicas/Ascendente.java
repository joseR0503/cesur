package practicas;

import java.util.Scanner;

public class Ascendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.println("Escribe TRES numeros");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		num3 = teclado.nextInt();

		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println(num1);
				if (num2 >= num3) { // num1 num2 num3
					System.out.println(num2);
					System.out.println(num3);
				} else { // num1 num3 num2
					System.out.println(num3);
					System.out.println(num2);
				}
			} else {  // num3 num1 num2
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);
			}
		} else {    // num1 < num2
			
		}
		teclado.close();
	}

}
