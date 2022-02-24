package aula02;
import java.util.*;

public class Principal {
public static void main(String[] args) {
		
		
		String cpf;
		String nome;
		int anoNascimento;
		String email;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu CPF:");
		cpf = ler.nextLine();
		
		System.out.println("Digite sua Data de nascimento:");
		anoNascimento = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Digite seu nome:");
		nome = ler.nextLine();
		
		System.out.println("Digite seu E-mail:");
		email = ler.nextLine();
	
		Cliente cliente1 = new Cliente(cpf, anoNascimento, nome, email);
		
		
		float numero;
		float saldo;
		
		System.out.println("Digite o numero da sua conta:");
		numero = ler.nextFloat();
		
		System.out.println("Digite o seu saldo:");
		saldo = ler.nextFloat();
		
		Cliente conta1 = new Cliente(cpf, anoNascimento, nome, email);
		
		
	}
}
