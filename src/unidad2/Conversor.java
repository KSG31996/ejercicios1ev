package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) throws IOException {
		/* En el método main de una clase Java llamada Conversor escribe un programa
		 * en Java que convierta de euros a dólares. El dato de entrada será un número
         * decimal correspondiente a la cantidad en euros, y el dato de salida será un
         * número decimal que representará la cantidad correspondiente en dólares con
         * una precisión de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.
		 */
		
		float euros;
		float dolares;
		String linea;
		
		//BufferedReader permite leer cosas del teclado
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce un numero: ");
		linea = in.readLine(); //Leer una line a de texto.
		euros = Float.parseFloat(linea);
		dolares = euros * 1.17f;
		System.out.printf("%-15.2f", dolares);
		
	}

}
