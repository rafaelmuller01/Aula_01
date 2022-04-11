package Trab07;

public class Piloto extends Thread {

	private String nome;
	private String equipe;
	private int numero;
	private int voltas;
	private int tempo;

	public Piloto(String nome, String equipe, int numero, int voltas, int tempo) {
		this.nome = nome;
		this.equipe = equipe;
		this.numero = numero;
		this.voltas = voltas;
		this.tempo = tempo;
	}

	public void run() {
		System.out.println("LARGADA");

		try {
			for (int i = 0; i <= this.voltas; i++) {
				System.out.println(this.nome + " Número de voltas: " + i);
				sleep(this.tempo);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}
