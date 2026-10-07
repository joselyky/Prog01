package unidad01;

import java.util.Scanner;

public class Diapositiva91 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un numero entero : ");
		int numero1 = sc.nextInt();
		System.out.println("Dime otro numero entero : ");
		int numero2 = sc.nextInt();
		boolean resultado1 = (numero1 != numero2) || numero1 == 0|| numero2 == 0 ;
		System.out.println(resultado1);

		
		

	}

}
