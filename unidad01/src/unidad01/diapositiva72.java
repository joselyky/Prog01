package unidad01;

import java.util.Scanner;

public class diapositiva72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la nota 1 : ");
		int nota1 = sc.nextInt();
		System.out.println("Dime la nota 2 : ");
		int nota2 = sc.nextInt();
		double notamedia = (nota1 + nota2) / 2; 
		System.out.printf("La nota media es : %.3f \n", notamedia);
	}

}
