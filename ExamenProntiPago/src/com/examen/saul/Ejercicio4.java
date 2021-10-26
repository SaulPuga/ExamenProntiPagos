package com.examen.saul;

public class Ejercicio4 {
	public static void main(String[] args) throws InterruptedException {

		String palabra = "Hola Pronti Pagos";
		String Palindromo = invierteCadena(palabra);
		System.out.println(Palindromo);

	}

	public static String invierteCadena(String cadena) {
		return new StringBuilder(cadena).reverse().toString();
	}

}
