package es.studium.Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Programa {
        
    	public static void main(String[] args) throws Exception {
    		String numero = "";
    		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    		System.out.println("Escribe un n�mero entero");
    		numero = entrada.readLine();
    		System.out.println("El cuadrado del n�mero " + numero + " es: " + (Integer.parseInt(numero) * Integer.parseInt(numero)));
    	}

}
