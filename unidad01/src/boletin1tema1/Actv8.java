package boletin1tema1;

import java.util.Scanner;

public class Actv8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el primer numero : ");
		int num1 = sc.nextInt();
		System.out.println("Dime el segundo numero : ");
		int num2 = sc.nextInt();
		int distancia = Math.abs(num2 - num1) ;
		System.out.printf("La distancia es de %d\n", distancia);
		
	}

}
