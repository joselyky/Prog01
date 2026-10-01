
package boletin1tema1;

import java.util.Scanner;

public class Act18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime las monedas de 2 euros que tienes :");
		int monedas2e = sc.nextInt();
		System.out.println("Dime las monedas de 1 euro que tienes :");
		int monedas1e = sc.nextInt();
		System.out.println("Dime las monedas de 50 centimos que tienes :");
		int monedas50cen = sc.nextInt();
		System.out.println("Dime las monedas de 20 centimos que tienes :");
		int monedas20cen = sc.nextInt();
		System.out.println("Dime las monedas de 10 centimos que tienes :");
		int monedas10cen = sc.nextInt();
		int totalcentimos = (monedas2e * 200) + (monedas1e * 100) + (monedas50cen * 50) + (monedas20cen * 20) + (monedas10cen * 10);
		System.out.printf("Tienes %d euros y %d centimos", totalcentimos/100, totalcentimos%100);
	}
}
