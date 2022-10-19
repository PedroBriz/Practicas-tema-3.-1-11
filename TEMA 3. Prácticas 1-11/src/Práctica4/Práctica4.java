package Práctica4;

import java.util.Scanner;

public class Práctica4 {

	public static void main(String[] args) {
		
	Integer n1;
		
	Scanner imput = new Scanner (System.in);
	System.out.println("Dictamine un número entre el 0 y el 9999 ");
	n1=imput.nextInt();
	imput.close();
	
	if (n1>-1 && n1<10) {
		System.out.println("El número tiene una cifra");
	}
	if (n1>9 && n1<100) {
		System.out.println("El número tiene dos cifras");
	}
	if (n1>99 && n1<1000) {
		System.out.println("El número tiene tres cifras");
	}
	if (n1>999 && n1<10000) {
		System.out.println("El número tiene cuatro cifras");
	}
	
	}

}
