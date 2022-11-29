package ejercicios;

import java.util.Scanner;

/**
 * Clase
 * @author fernando
 *
 */
public class Ejercicio3 {
	
	/**
	 * Método main
	 * @param args
	 */
	final public static void main(String[] args) {

		final Scanner read = new Scanner(System.in);

		System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
		System.out.print("Por favor, introduzca n: ");
		int numero = read.nextInt();

		switch (numero) {
		case 1:
			System.out.print("0");
			break;
		case 2:
			System.out.print("0 1");
			break;
		default:
			System.out.print("0 1");
			int formula1 = 0;
			int formula2 = 1;
			int aux;
			while (numero > 2) {
				aux = formula1;
				formula1 = formula2;
				formula2 = aux + formula2;
				System.out.print(" " + formula2);
				numero--;
			}
		}
		System.out.println();
		read.close();
	}
}
