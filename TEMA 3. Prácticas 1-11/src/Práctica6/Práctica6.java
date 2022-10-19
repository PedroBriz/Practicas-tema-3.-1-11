package Práctica6;

import java.util.Scanner;

public class Práctica6 {

	public static void main(String[] args) {
		int nota;
		String resultado="";

		boolean suspendido;
		
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine una nota");
		nota=imput.nextInt();
		imput.close();
		
		if (nota > 0 && nota <5) {
			suspendido= true;
		}
		else {
			suspendido= false;
		}
		if (suspendido == true){
			resultado = "Está suspendido";
		}
		else {
			resultado = "Está aprobado";
		}
		switch (nota) {
		case 0:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Insuficiente.");
			break;
		case 1:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Insuficiente.");
			break;
		case 2:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Insuficiente.");
			break;
		case 3:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Insuficiente.");
			break;
		case 4:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Insuficiente.");
			break;
		case 5:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Suficiente.");
			break;
		case 6:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Bien.");
			break;
		case 7:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Bien.");
			break;
		case 8:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Notable.");
			break;
		case 9:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Sobresaliente.");
			break;
		case 10:
			System.out.println("La nota de este alumno es un " + nota + ". " + resultado + " y es un Sobresaliente.");
			break;
		default: System.out.println("Este nota no tiene un valor valido");
			break;
		}
		}
		
	}


