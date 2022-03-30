package trab05;
import java.util.*;

 	
public class exer05 {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		int n = 3; 

	    int i;
	    
		Cliente[] clientes = new Cliente[n];
		
			for (i=0; i < clientes.length; i++) {
				
				clientes[i] = new Cliente();
			      System.out.printf("Informe o cpf: ");
			      clientes[i].setCpf(ler.nextLine());
			      
			      System.out.printf("Informe o ano de nascimento: ");
			      clientes[i].setAnoNascimento(ler.nextInt());
			      
			      System.out.printf("Informe o seu nome: ");
			      clientes[i].setNome(ler.nextLine());
			      
			      System.out.printf("Informe o email: ");
			      clientes[i].setEmail(ler.nextLine());
			      
			      System.out.println(clientes[i].retornaCliente());
			 }
		
			Conta[] contas = new Conta[3];
		
		
		
	}
}
