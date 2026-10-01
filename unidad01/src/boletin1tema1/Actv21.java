package boletin1tema1;

import java.util.Scanner;

public class Actv21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la primera nota :");
		int nota1 = sc.nextInt();
		System.out.println("Dime la segunda nota :");
		int nota2 = sc.nextInt();
		System.out.println("Dime la tercera nota :");
		int nota3 = sc.nextInt();
		double promedio = (nota1 + nota2 + nota3) * 1.0 / 3;
		boolean resultado = promedio >= 5 && nota1 >= 3 && nota2 >= 3 && nota3 >= 3;
		String mensaje = resultado ? "Aprobado" : "Suspenso";
		System.out.println(mensaje);
	}

}
