package Trabalho06;

import java.util.Scanner;

public class PrincipalTrab06 {
public static void main(String[] args) {
		
		int vetor = 2;
		int i;
		int numero, anoNascimento;
		float saldo, somasaldo=0;
		String cpf, nome, email;
		
		Scanner entrada = new Scanner(System.in);

		Cliente clientes[] = new Cliente[vetor];
		
		for ( i=0; i < clientes.length; i++) {
			System.out.println("Digite o CPF do cliente :");
			cpf = entrada.nextLine();
			System.out.println("Digite o Nome do cliente :");
			nome = entrada.nextLine();
			System.out.println("Digite o email do cliente :");
			email = entrada.nextLine();	
			System.out.println("Digite o ano de nascimento do cliente :");
			anoNascimento = entrada.nextInt();
			System.out.println("Digite o número da conta :");
			numero = entrada.nextInt();
			System.out.println("Digite o saldo da conta :");
			saldo = entrada.nextFloat();
			
			entrada.nextLine();
			
			clientes[i] = new Cliente(cpf, anoNascimento, nome, email);
			clientes[i].setConta(new Conta(numero, saldo));

		}

		entrada.close();

		for (i=0; i < clientes.length; i++) {
			System.out.println("Cliente " + (i+1) + ": ");
			System.out.println(clientes[i].retornaCliente());
			System.out.println(clientes[i].getConta().retornaConta());
			somasaldo += clientes[i].getConta().getSaldo();
		}
		
		System.out.println("Soma de todos os saldos: " + somasaldo);
	
	}
}

