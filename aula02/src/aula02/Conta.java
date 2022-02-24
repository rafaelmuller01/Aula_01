package aula02;

public class Conta {
	
	public float numero;
	public float saldo;
	public int debito = 100;
	public int creditado = 1000;
	
	
	
	public Conta(float numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
		this.debito = debito;
		this.creditado = creditado;
	}

	public String retornaConta() {
		return ("numero: " + this.numero + " saldo: " + this.saldo);
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
			return true;
			} else { 
				return false;
		}
	}
	
	
}
