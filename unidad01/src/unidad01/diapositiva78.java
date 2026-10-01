package unidad01;

import java.util.Scanner;

public class diapositiva78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero : ");
		int numero = sc.nextInt();
		Boolean resultado = numero%2 == 0;
		System.out.printf("%s", resultado?"par":"impar");
	}

}
