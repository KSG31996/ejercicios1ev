package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args)throws IOException {
		/* En el m�todo main de una clase Java llamada Cronometro escribe un programa
		 * que pida al usuario que introduzca mediante el teclado su nombre y a
		 * continuaci�n muestre en la consola un mensaje que incluya un n�mero real que
		 * represente los segundos y milisegundos que ha tardado en contestar, con un
		 * formato de salida que emplee exactamente 3 d�gitos en la parte decimal.
		 * Realiza el ejercicio sin utilizar la clase Scanner.
		*/
		
		String nombre;
		
		//BufferedReader permite leer cosas del teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Dime tu nombre: ");
		long t0 = System.currentTimeMillis();
		nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		double segundos = (t1 - t0) / 1000d;
		System.out.printf("Hola %s, tardaste %.3f segundos en escribir tu nombre.\n", nombre, segundos);
		
		
	}

}

