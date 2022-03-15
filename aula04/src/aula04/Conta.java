package aula04;

public abstract class Conta {
	
	public float numero;
	public float saldo;
	public boolean debito;
	public int aniversario;
	
	public boolean debitaSaldo(float debito) {
		if (debito < this.saldo) {
			this.saldo = this.saldo - debito;
			return true;
			} else { 
				return false;
		}
	}
	
	public Conta(float numero, float saldo, float limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.aniversario = aniversario;

	}

	public abstract String retornaConta();


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