package aula04;

public class poupanca extends Conta{
	private int aniversario;
	
	
	public poupanca(float numero, float saldo, int aniversario) {
		super(numero, saldo, aniversario);
		
	}


	public int getAniversario() {
		return aniversario;
	}


	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}


	@Override
	public String retornaConta() {
		return ("numero da conta: " + this.numero + "; saldo da conta: " + this.saldo + " a data do seu aniversário é: " + this.aniversario);
		
	}

	
}
