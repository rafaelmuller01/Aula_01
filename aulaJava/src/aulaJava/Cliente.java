package aulaJava;

public class Cliente {
 
	public String cpf;
	public int anoNascimento;
	public String nome;
	public String email;
	
	
	
	public String retornaCliente() {
		return "cpf: " + this.cpf + " Nascimento: " + this.anoNascimento + " Nome: " + this.nome + " email: " + this.email;
	}
	
}


