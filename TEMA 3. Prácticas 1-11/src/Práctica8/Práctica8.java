package Práctica8;

import java.util.Scanner;

public class Práctica8 {

	public static void main(String[] args) {
		int n1;
		Scanner imput = new Scanner (System.in);
		System.out.println("Dictamine un día final de mes");
		n1=imput.nextInt();
		imput.close();
		
		switch (n1) {
		case 28:
			System.out.println("El mes es Febrero");
			break;
		case 29:
			System.out.println("El mes es Febrero");
			break;
		case 30:
			System.out.println("Los meses son Abril, Junio, Septiembre y Noviembre");
			break;
		case 31:
			System.out.println("Los meses son Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
			break;
		default:
			System.out.println("Ningún mes tiene esa cantidad de días");
			break;
		}
		}
	}


