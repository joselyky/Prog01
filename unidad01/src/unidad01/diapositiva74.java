package unidad01;

import java.util.Scanner;

public class diapositiva74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad : ");
		int edad = sc.nextInt();
		Boolean mayoredad = edad >=18;
		System.out.printf("%s", mayoredad);
		
		
	}

}
