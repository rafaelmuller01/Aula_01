package trab05;

public class Conta {
	
	public float numero;
	public float saldo;
	public boolean debito;
	
	public boolean debitaSaldo(float debito) {
		if (debito < this.saldo) {
			this.saldo = this.saldo - debito;
			return true;
			} else { 
				return false;
		}
	}
	
	public Conta(float numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;

	}

	public String retornaConta() {
		return ("numero da conta: " + this.numero + "; saldo da conta: " + this.saldo);
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
		  }

	public boolean setSaldo(float saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
			return true;
			} else { 
				return false;
		}
	}
	
	
}