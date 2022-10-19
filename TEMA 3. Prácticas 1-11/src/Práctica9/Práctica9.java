package Práctica9;

import java.util.Scanner;

public class Práctica9 {

	public static void main(String[] args) {
		int nota;
		
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine una nota");
		nota=imput.nextInt();
		imput.close();
		
		switch (nota) {
		case 0:
			System.out.println("La nota es CERO");
			break;
		case 1:
			System.out.println("La nota es UNO");
			break;
		case 2:
			System.out.println("La nota es DOS");
			break;
		case 3:
			System.out.println("La nota es TRES");
			break;
		case 4:
			System.out.println("La nota es CUATRO");
			break;
		case 5:
			System.out.println("La nota es CINCO");
			break;
		case 6:
			System.out.println("La nota es SEIS");
			break;
		case 7:
			System.out.println("La nota es SIETE");
			break;
		case 8:
			System.out.println("La nota es OCHO");
			break;
		case 9:
			System.out.println("La nota es NUEVE");
			break;
		case 10:
			System.out.println("La nota es DIEZ");
			break;
		default: 
			System.out.println("La nota no es valida.");
			break;
		}
		
	}

}
