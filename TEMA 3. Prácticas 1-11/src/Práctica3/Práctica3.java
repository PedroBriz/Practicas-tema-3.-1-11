package Práctica3;

import java.util.Scanner;

public class Práctica3 {

	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Elige un primer número");
		n1= input.nextDouble();
		System.out.println("Elige un segundo número");
		n2= input.nextDouble();
		System.out.println("Elige un tercer número");
		n3= input.nextDouble();
		input.close();
		
		if (n1>n2 && n2>n3) {
			System.out.println("Los números ordenados de mayor a menor son "+n1+ " " + n2 + " " + n3);
		}
		if (n1>n2 && n3>n2 && n1>n3) {
			System.out.println("Los numeros ordenados de mayor a menor son "+n1+ " " + n3 + " " +n2);
		}
		if(n2>n1 && n1>n3) {
			System.out.println("Los numeros ordenados de mayor a menor son "+n2+ " " + n1 + " " +n3);
		}
		if(n2>n1 && n3>n1 && n2>n3) {
			System.out.println("Los numeros ordenados de mayor a menor son "+n2+ " " + n3 + " " +n1);
		}
		if(n3>n1 && n1>n2) {
			System.out.println("Los numeros ordenados de mayor a menor son "+n3+ " " + n1 + " " +n2);
		}
		if(n3>n1 && n2>n1 && n3>n2) {
			System.out.println("Los numeros ordenados de mayor a menor son "+n3+ " " + n2 + " " +n1);
		}
		if(n1==n2 && n3>n1) {
			System.out.println("El número mayor es "+ n3 + " y los numeros " + n1 + " y " + n2+ " son iguales");
		}
		if(n1==n2 && n3<n1) {
			System.out.println("los numeros " + n1 + " y " + n2+ " son iguales y el número " + n3 + " es menor");
		}
		if(n1==n3 && n1<n2) {
			System.out.println("El número mayor es "+ n2+ " y los numeros " + n1 + " y " + n3+ " son iguales");
		}
		if(n1==n3 && n1>n2) {
			System.out.println("los numeros " + n1 + " y " + n3+ " son iguales y el número " + n2 + " es menor");
		}
		if(n2==n3 && n2<n1) {
			System.out.println("El número mayor es "+ n1 + " y los numeros " + n2 + " y " + n3+ " son iguales");
		}
		if(n2==n3 && n1<n2) {
			System.out.println("los numeros " + n2 + " y " + n3+ " son iguales y el número " + n1 + " es menor");
		}
		}
}
