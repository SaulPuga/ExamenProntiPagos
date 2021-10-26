package com.examen.saul;

public class Ejercicio1 {

	public static void main(String[] args) throws InterruptedException {

		String palabra = "somos o no somos";

		boolean isPalindromo = palindromo(palabra);
		System.out.println(isPalindromo);

	}

	private static boolean palindromo(String palabra) {

		String palabraAlReves = palabra.replaceAll(" ", "").trim();

		palabraAlReves = invierteCadena(palabraAlReves).toLowerCase();

		palabra = palabra.replaceAll(" ", "").toLowerCase();

		return palabraAlReves.equals(palabra);
	}

	public static String invierteCadena(String cadena) {
		return new StringBuilder(cadena).reverse().toString();
	}

}
