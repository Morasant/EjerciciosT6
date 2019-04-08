package es.studium.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa {
        
    	public static void main(String[] args) throws Exception {
    		String numero = "";
    		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Escribe un número entero");
    		numero = entrada.readLine();
    		System.out.println("El cuadrado del número " + numero + " es: " + (Integer.parseInt(numero) * Integer.parseInt(numero)));
    	}

}
