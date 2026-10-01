package boletin1tema1;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la base del rectangulo : ");
		double baserec = sc.nextDouble();
		System.out.println("Dime la altura del rectangulo : ");
		double alturarec = sc.nextDouble();
		double perimetro = (baserec * 2)+(alturarec * 2);
		double area = baserec * alturarec ;
		System.out.printf("El perimetro de tu rectangulo es %.2f\n", perimetro);
		System.out.printf("El area de tu rectangulo es %.2f\n", area);
	
	}
}


