package Práctica10;

import java.util.Scanner;

public class Práctica10 {

	public static void main(String[] args) {
		int n1=0;
		double cuadrado;
		Scanner imput = new Scanner (System.in);
		
		
		while (n1>=0) {
			System.out.println("Dictamine un número");
			n1=imput.nextInt();
		
			if (n1>=0) {
				cuadrado= Math.pow(n1, 2);
				System.out.println(cuadrado);
			}
			else {
				System.out.println("FIN");
			}
		}
		imput.close();

	}
}
