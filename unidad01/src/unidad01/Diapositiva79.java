package unidad01;

import java.util.Scanner;

public class Diapositiva79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad ");
		int edad = sc.nextInt();
		Boolean resultado = edad >= 16 && edad <= 67;
		System.out.printf("%s", resultado?"Tines edad para trabajar":"no tines edad para trabajar");
	}

}
