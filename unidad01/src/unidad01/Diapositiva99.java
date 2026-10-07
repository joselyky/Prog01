
package unidad01;

import java.util.Scanner;

public class Diapositiva99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero : ");
		int numero = sc.nextInt();
		System.out.println("Dime otro numero : ");
		int numero2 = sc.nextInt();
		if (numero == numero2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos numeros");

		}
	}

}
