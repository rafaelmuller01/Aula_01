package aula04;

public class especial extends Conta{
	private float limite;
	
	public especial(float numero, float saldo, float limite) {
		super(numero, saldo, limite);
		
	}

	public float getLimite() {
		return limite;
	}

	public float setLimite() {
		return limite;
	}
	
	public boolean debitaSaldo() {
		return debito;		

	}

	@Override
	public String retornaConta() {
		return ("numero da conta: " + this.numero + "; saldo da conta: " + this.saldo + " o seu limite é: " + this.limite);
	}
	
	
}
