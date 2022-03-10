package Principal;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		
		String cpf;
		int anoNascimento;
		String nome;
		String email;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu CPF: ");
		cpf = ler.nextLine();
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNascimento = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.println("Digite seu email: ");
		email = ler.nextLine();
		
		Cliente cliente01 = new Cliente(cpf, anoNascimento,nome, email);
		/* erro import */
		
		System.out.println(cliente01.retornaCliente());
		
		float numero;
		float saldo;
		
		System.out.println("Digite o numero da sua conta:");
		numero = ler.nextFloat();
		
		System.out.println("Digite o seu saldo:");
		saldo = ler.nextFloat();
		
		Cliente conta1 = new Cliente(cpf, anoNascimento, nome, email);
		
		Conta conta01 = new Conta(numero, saldo);
		/* erro import */
		
		System.out.println(conta01.retornaConta());
		
		ler.close();
	}
}
/* se passar para o mesmo pacote que a principal ele para de dar o erro de import*/