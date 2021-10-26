package com.examen.saul;

public class CuentaAtras implements Runnable {

	public int total;

	public CuentaAtras(int total) {
		this.total = total;
	}

	@Override
	public void run() {
		while (total > 0) {
			total--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				System.err.println(ex.equals(ex.getMessage()));
			}
			System.out.println(total);
		}
	}
}