package unidad01;

import java.util.Scanner;



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos KG de Manzanas has vendido? : ");
		double manzanas = sc.nextDouble();
		System.out.println("¿Cuantos KG de Peras has vendido? : ");
		double peras = sc.nextDouble();
		System.out.println("¿Cuantos KG de Peras has vendido en el 2 trimestre? : ");
		double peras2 = sc.nextDouble();
		System.out.println("¿Cuantos KG de Manzanas has vendido en el 2 trimstre? : ");
		double manzanas2 = sc.nextDouble();
		
		double totalman1 = manzanas * 2.35; 
		double totalman2 = manzanas2 * 2.35; 
		double totalper1 = peras * 1.95;
		double totalper2 = peras2 * 1.95;
		double total = totalman1 + totalper2 + totalman2 + totalper2 ;
		System.out.printf("Has ganando en total %.2f €\n", total);
	}

}
