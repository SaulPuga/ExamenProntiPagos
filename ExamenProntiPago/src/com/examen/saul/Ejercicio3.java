package com.examen.saul;

public class Ejercicio3 {

	public static void main(String[] args) throws InterruptedException {
		int tiempo = 60;
		CuentaAtras c = new CuentaAtras(tiempo);
		Thread t = new Thread(c);

		t.start();
		System.out.println("Cronometro Iniciado");

	}
}