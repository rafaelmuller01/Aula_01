package trab07b;
import java.util.Scanner;

public class Trab07b {
public static void main(String[] args) {
		
		int vetor = 2;
		int i;
		int numero, anoNascimento;
		float saldo, somasaldo=0;
		String cpf, nome, email;
		
		Scanner entrada = new Scanner(System.in);

		Cliente clientes[] = new Cliente[vetor];
		
		for ( i=0; i < clientes.length; i++) {
			System.out.println("Digite o CPF do cliente " + (i+1) +  " : ");
			cpf = entrada.nextLine();
			System.out.println("Digite o Nome do cliente " + (i+1) +  " : ");
			nome = entrada.nextLine();
			System.out.println("Digite o email do cliente " + (i+1) +  " : " );
			email = entrada.nextLine();	
			System.out.println("Digite o ano de nascimento do cliente " + (i+1) +  " : ");
			anoNascimento = entrada.nextInt();
			System.out.println("Digite o número da conta " + (i+1) +  " : ");
			numero = entrada.nextInt();
			System.out.println("Digite o saldo da conta " + (i+1) +  " : ");
			saldo = entrada.nextFloat();
			
			entrada.nextLine();
			
			clientes[i] = new Cliente(cpf, anoNascimento, nome, email);
			clientes[i].setConta(new Conta(numero, saldo));

		}

		entrada.close();

		for (i=0; i < clientes.length; i++) {
			clientes[i].start();
			somasaldo += clientes[i].getConta().getSaldo();		
		}
		
		System.out.println("Soma de todos os saldos: " + somasaldo);	
	}
}
