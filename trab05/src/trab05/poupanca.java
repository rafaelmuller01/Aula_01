package trab05;

public class poupanca extends Conta{
	private int aniversario;
	
	
	public poupanca(float numero, float saldo, int aniversario) {
		super(numero, saldo);
		// TODO Auto-generated constructor stub
	}


	public int getAniversario() {
		return aniversario;
	}


	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	
}
