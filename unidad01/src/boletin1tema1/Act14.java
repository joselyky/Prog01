package boletin1tema1;

import java.util.Scanner;

public class Act14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos minutos : ");
		double minutos = sc.nextDouble();
		double horas = minutos / 60;
		double minutosresto = minutos % 60 ;
		System.out.printf("Esos minutos equivalen a %.0f y %.0f minutos", horas , minutosresto);
	}

}
