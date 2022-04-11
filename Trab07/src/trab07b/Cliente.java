package trab07b;

public class Cliente extends Thread{
	
	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;
	private Conta conta;
	private int i;
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
	}

	public void run() {
		System.out.println("CPF: " + this.cpf);
		System.out.println("Ano de nascimento: " + this.anoNascimento);
		System.out.println("Nome: " + this.anoNascimento);
		System.out.println("Email: " + this.email);
		System.out.println("Conta: " + getConta().getNumero());
		System.out.println("Saldo: "+ getConta().getSaldo());
		
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String retornaCliente() {
		return "cpf: " + this.cpf + "; Ano de nascimento: " + this.anoNascimento + "; Nome: " + this.nome + "; Email: " + this.email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}

