package aulaJava;

public class Conta {
	
	public float numero;
	public float saldo;
	public int debito = 100;
	public int creditado = 1000;
	
	public String retornaConta() {
		return ("numero: " + this.numero + " saldo: " + this.saldo);
	}
	
	public float debitaSaldo() {
		return (saldo - debito);
	}
	
	public float creditaSaldo() {
		return (saldo - creditado);
	}
}
