package ejercicios;

import java.util.Scanner;

/**
 * Clase
 * @author fjmiguel
 *
 */
public class Ejercicio2 {
	
	/**
	 * Método Main
	 * @param args
	 */
	final public static void main(String[] args) {
		
		final Scanner read=new Scanner(System.in);
	    
	    int numeroDeDigitos = 1, auxiliar, numeroIntroducido;

	    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
	    numeroIntroducido = read.nextInt();
	    
	    read.close();
	    
	    auxiliar = numeroIntroducido;
	    
	    while (auxiliar > 10) {
	      auxiliar /= 10;
	      numeroDeDigitos++;
	    }
	    
	    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " d�gito/s.");
	    

	}
}
