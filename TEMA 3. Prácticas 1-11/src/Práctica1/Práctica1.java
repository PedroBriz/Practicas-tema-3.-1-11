package Práctica1;

import java.util.Scanner;

public class Práctica1 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double mayor;
		double menor;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elige un número");
		n1= input.nextDouble();
		System.out.println("Elige otro número");
		n2= input.nextDouble();
		input.close();
		
		
		double resto;
		
		if(n1==n2) {
			System.out.println("Los numeros son iguales");
		}
		else {
			if(n1>n2) {
				mayor =n1;
				menor =n2;
			}
			else {
				mayor=n2;
				menor=n1;
			}
			resto = mayor%menor;
			if(resto!=0) {
				System.out.println("El número " + mayor + " no es múltiplo de " + menor);
			}
			else {
				System.out.println("El número " + menor + " es múltiplo de " + mayor);
			}
		}
	}

}
