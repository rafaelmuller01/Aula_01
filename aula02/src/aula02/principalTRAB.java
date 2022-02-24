package aula02;
import java.util.*;

public class principalTRAB {

	public static void main(String[] args) {
		int numero;
		float valor;
		boolean recebe;
		
		Conta conta1 = new Conta(23196, 250);
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		valor = ler.nextFloat();
		
		recebe = conta1.setSaldo(valor);
		
		if(recebe == true){
			System.out.println("Saldo atualizado");
		}else {
			System.out.println("Saldo não atualizado. Não pode ser negativo");
		}
	}

}
