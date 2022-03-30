package trab05;

public class Especial extends Conta{
	private float limite;
	
	public Especial(float numero, float saldo, float limite) {
		super(numero, saldo);
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean debitaSaldo() {
		return debitaSaldo();		

	}
	
	
}
