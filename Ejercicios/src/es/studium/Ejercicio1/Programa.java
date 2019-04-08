package es.studium.Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {
        
    	public static void main(String[] args) throws Exception {
    		String numero = "";
    		numero = pedirNumero();
    		mostrarResultado(numero);
    	}

		private static void mostrarResultado(String numero) {
			System.out.println("El cuadrado del número " + numero + " es: " + calcularCuadrado(numero));
		}

		private static int calcularCuadrado(String numero) {
			return Integer.parseInt(numero) * Integer.parseInt(numero);
		}

		private static String pedirNumero() throws IOException {
			String numero;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Escribe un número entero");
    		numero = entrada.readLine();
			return numero;
		}
    
}
