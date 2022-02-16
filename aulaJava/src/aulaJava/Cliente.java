package aulaJava;

public class Cliente {
 
	String cpf;
	int anoNascimento;
	String nome;
	String email;
	
	public static void main (String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.cpf = "02850435902";
		cliente1.anoNascimento = 1980;
		cliente1.nome = "Marcos da Rocha Souza";
		cliente1.email = "mr_souza@gmail.com";
	}
}


