package trab05;

public class especial extends Conta{
	private float limite;
	
	public especial(float numero, float saldo, float limite) {
		super(numero, saldo);
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean debitaSaldo() {
		return debito;		

	}
	
	
}
