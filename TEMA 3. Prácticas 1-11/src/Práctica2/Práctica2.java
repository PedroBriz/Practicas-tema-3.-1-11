package Práctica2;

import java.util.Scanner;

public class Práctica2 {

	public static void main(String[] args) {
		double n1;
		double n2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elige un número");
		n1= input.nextDouble();
		System.out.println("Elige otro número");
		n2= input.nextDouble();
		input.close();
		
		
		if(n1==n2) {
			System.out.println("Los números son iguales");
		}
		else {
			if (n1>n2) {
				System.out.println("El primer número elegido "+n1+" es mayor que el segundo número elegido " + n2);
			}
			else {
				System.out.println("El segundo número elegido " +n2+" es mayor que el primer número elegido " +n1);
			}
		}
	}
	
}
