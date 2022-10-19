package Práctica5;

import java.util.Scanner;

public class Práctica5 {

	public static void main(String[] args) {
	Integer n1;
	
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine un número");
		n1=imput.nextInt();
		imput.close();

		if (n1 == 0) {
			System.out.println("El número 0 no es ni par ni impar.");
		}
		else {
		if (n1 % 2 == 0) {
		    System.out.println("El número " + n1 + " es par.");
		} else {
		    System.out.println("El número " + n1 + " es impar.");
		}
	}

	}
}
