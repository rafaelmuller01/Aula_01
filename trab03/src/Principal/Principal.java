package Principal;

import Conta.Conta;
import Cliente.Cliente;


public class Principal {
	public static void main(String[] args) {
		
		
		Cliente cliente01 = new Cliente("03510400902", 1985, "ana clara", "aninha@gmail.com");
		
		Conta conta01 = new Conta(1519, 750.95f);
		
	}
}
