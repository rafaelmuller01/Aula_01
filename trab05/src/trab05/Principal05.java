package trab05;

import java.util.Scanner;

public class Principal05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n = 3;
		int i;
		int resposta;
		int aniversario = 0;
		float numero = 0, saldo = 0, limite = 0;
		float totalsaldo = 0;
		float totallimite = 0;

		Conta[] contas = new Conta[n];

		for (i = 0; i < contas.length; i++) {

			contas[i] = new Especial(numero, saldo, limite);
			System.out.println("Digite qual conta ser� cadastrada 1-Especial; 2-poupan�a;");
			resposta = ler.nextInt();
			ler.nextLine();

			if (resposta == 1) {
				System.out.println("Informe o n�mero da conta especial: ");
				((Especial) contas[i]).setNumero(ler.nextFloat());

				System.out.println("Informe o saldo da conta: ");
				((Especial) contas[i]).setSaldo(ler.nextFloat());

				System.out.println("Informe o limite da conta: ");
				((Especial) contas[i]).setLimite(ler.nextFloat());

				System.out.println(((Especial) contas[i]).retornaConta());

			} else if (resposta == 2) {
				contas[i] = new poupanca(numero, saldo, aniversario);
				
				System.out.println("informe o n�mero da conta poupan�a:");
				((poupanca) contas[i]).setNumero(ler.nextFloat());

				System.out.println("informe o n�mero da conta poupan�a:");
				((poupanca) contas[i]).setSaldo(ler.nextFloat());

				System.out.println("informe o n�mero da conta poupan�a:");
				((poupanca) contas[i]).setAniversario(ler.nextInt());
				
				

			} else {
				i--;
				System.out.println("Invalido");
			}

		}
			for (i = 0; i < contas.length; i++) {
				totalsaldo = contas[i].saldo + totalsaldo;
			}
			System.out.println("O total do saldo �: " + totalsaldo);
		
		if(contas[i] instanceof Especial) 
		{
			for (i = 0; i < contas.length -1; i++) {
				totallimite = ((Especial) contas[i]).getLimite() + totallimite;
			}
			System.out.println("O total do limite �: " + totallimite);
	    }
		
		}
			

}
