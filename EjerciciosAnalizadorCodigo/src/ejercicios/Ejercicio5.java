package ejercicios;

import java.util.Scanner;

/**
 * Clase
 * @author fernando
 *
 */
public class Ejercicio5 {
	
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {

		final Scanner read = new Scanner(System.in);
		System.out.println("Cálculo de una potencia");

		System.out.print("Introduzca la base: ");
		final int base = read.nextInt();

		System.out.print("Introduzca el exponente: ");
		final int exponente = read.nextInt();

		double potencia = 1;

		if (exponente == 0) {
			potencia = 1;
		}

		if (exponente > 0) {
			for (int i = 0; i < exponente; i++) {
				potencia *= base;
			}
		}

		if (exponente < 0) {
			for (int i = 0; i < -exponente; i++) {
				potencia *= base;
			}

			potencia = 1 / potencia;
		}

		System.out.println(base + "^" + exponente + " = " + potencia);
		read.close();
	}
}
