package ejercicios;

import java.util.Scanner;

/**
 * Clase
 * @author fjmiguel
 *
 */
public class Ejercicio1 {
	
	/**
	 * Método Main
	 * @param args
	 */
	
	final static int clave = 8888;
	final public static void main(String[] args) {

		final Scanner read = new Scanner(System.in);

		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;

		do {
			System.out.print("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = read.nextInt();

			if (numeroIntroducido == clave) {
				acertado = true;
			} else {
				System.out.println("Clave incorrecta");
			}

			intentos--;

		}while (intentos > 0 && !acertado); 
		read.close();
		
			if (acertado) {
				System.out.println("Ha abierto la caja fuerte.");
			} else {
				System.out.println("Lo siento, ha agotado las 4 oportunidades.");
			}	
	}
}
