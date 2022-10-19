package Práctica7;

import java.util.Scanner;

public class Práctica7 {

	public static void main(String[] args) {
		int dia;
		int mes;
		int año;
		
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine un día");
		dia=imput.nextInt();
		System.out.println("Dictamine un mes");
		mes=imput.nextInt();
		System.out.println("Dictamine un año");
		año=imput.nextInt();
		imput.close();

			
		if (dia >0 && dia <31 && mes >0 && mes <13 && año != 0) {
			System.out.println("La fecha es " + dia + "/" + mes + "/" + año);
	}
		else {
			System.out.println("La fecha no es correcta");
		}
	}
}
