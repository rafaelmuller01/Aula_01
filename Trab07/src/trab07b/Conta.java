package trab07b;

public class Conta {
	
	public float numero;
	public float saldo;
	public int debito = 100;
	public int creditado = 1000;
	
	
	public Conta(float numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;

	}
	
	public Conta() {
		// TODO Auto-generated constructor stub
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
	
	public boolean debitaSaldo(float debito) {
		if (debito < this.saldo) {
			this.saldo = this.saldo - debito;
			return true;
			} else { 
				return false;
		}
		
		
	}
	
	public void creditaSaldo(float saldo){
        this.saldo = this.saldo + saldo;
    }
	
}