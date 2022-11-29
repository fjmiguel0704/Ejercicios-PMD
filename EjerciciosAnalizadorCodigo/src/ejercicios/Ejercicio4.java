package ejercicios;

import java.util.Scanner;

/**
 * Clase
 * @author fernando
 *
 */
public class Ejercicio4 {
	
	/**
	 * Método main
	 * @param args
	 */
	final public static void main(String[] args) {
		final Scanner read = new Scanner(System.in);
		int numero;

		System.out.println("Por favor, introduzca 10 n�meros enteros: ");

		int negativos = 0;
		int positivos = 0;

		for (int i = 0; i < 10; i++) {
			numero = read.nextInt();

			if (numero < 0) {
				negativos++;
			} else {
				positivos++;
			}
		}

		System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
		read.close();
	}
}
