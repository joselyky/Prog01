package boletin1tema1;

import java.util.Scanner;

public class Actividad19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dime tu edad: "); 
		int edad = scanner.nextInt();
		System.out.println("¿Eres vip? (true/fale)");
		boolean vip = scanner.nextBoolean();
		System.out.println("¿Eres vip? 0 (no) / 1 (si)");
		int vipe = scanner.nextInt();
		System.out.println("¿Eres vip? SI/NO");
		String vips = scanner.next();
		String mensaje = (edad >= 18 || vipe == 1)? "Acceso permitido": "Acceso denegado";
		System.out.println(mensaje);
		
	}

}
