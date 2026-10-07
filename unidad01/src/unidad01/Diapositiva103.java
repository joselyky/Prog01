package unidad01;

import java.util.Scanner;

public class Diapositiva103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y te digo de cuantas cifras es : ");
		int numero = sc.nextInt();
		if ((numero >= 0) && (numero <= 9)) {
			System.out.println("Es un numero de 1 cifra");
		}
		else if ((numero >= 10) && (numero <= 99)) {
			System.out.println("Es un numero de 2 cifras");
		}
		else if ((numero >= 100) && (numero <= 999)) {
			System.out.println("Es un numero de 3 cifras");
		}
		else if ((numero >= 1000) && (numero <= 9999)) {
			System.out.println("Es un numero de 4 cifras");
		}
		else if ((numero >= 10000) && (numero <= 99999)) {
			System.out.println("Es un numero de 5 cifras");
		}
		else {
			System.out.println("Es un numero de mas de 5 cifras");
		}
	}
	

}
