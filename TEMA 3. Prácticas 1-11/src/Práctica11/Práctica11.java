package Práctica11;

import java.util.Scanner;

public class Práctica11 {

	public static void main(String[] args) {
		String dia;
		
		Scanner imput = new Scanner (System.in);
		System.out.println("Escriba un dia de la semana");
		dia=imput.nextLine();
		imput.close();
		
		switch (dia) {
		case "Lunes": 
			System.out.println("El día seleccionado es el 1");
			break;
		case "lunes": 
			System.out.println("El día seleccionado es el 1");
			break;
		case "LUNES": 
			System.out.println("El día seleccionado es el 1");
			break;
		case "Martes": 
			System.out.println("El día seleccionado es el 2");
			break;
		case "martes": 
			System.out.println("El día seleccionado es el 2");
			break; 
		case "MARTES": 
			System.out.println("El día seleccionado es el 2");
			break;
		case "Miercoles": 
			System.out.println("El día seleccionado es el 3");
			break;
		case "miercoles": 
			System.out.println("El día seleccionado es el 3");
			break;
		case "MIERCOLES": 
			System.out.println("El día seleccionado es el 3");
			break;
		case "Jueves": 
			System.out.println("El día seleccionado es el 4");
			break;
		case "jueves": 
			System.out.println("El día seleccionado es el 4");
			break;
		case "JUEVES": 
			System.out.println("El día seleccionado es el 4");
			break;
		case "Viernes": 
			System.out.println("El día seleccionado es el 5");
			break;
		case "viernes": 
			System.out.println("El día seleccionado es el 5");
			break;
		case "VIERNES":
			System.out.println("El día seleccionado es el 5");
			break;
		case "Sábado":
			System.out.println("El día seleccionado es el 6");
			break;
		case "sábado":
			System.out.println("El día seleccionado es el 6");
			break;
		case "SÁBADO":
			System.out.println("El día seleccionado es el 6");
			break;
		case "Domingo":
			System.out.println("El día seleccionado es el 7");
			break;
		case "domingo":
			System.out.println("El día seleccionado es el 7");
			break;
		case "DOMINGO":
			System.out.println("El día seleccionado es el 7");
			break;
		default:
			System.out.println("El día seleccionado no es válido");
			break;
		}
		
		
	}

}
