package aulaJava;

public class Principal extends Cliente{
	
	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente();
		cliente1.cpf = "02850435902";
		cliente1.anoNascimento = 1980;
		cliente1.nome = "Marcos da Rocha Souza";
		cliente1.email = "mr_souza@gmail.com";
		
		System.out.println(cliente1.retornaCliente());
	
		Cliente cliente2 = new Cliente();
		cliente2.cpf = "03510400902";
		cliente2.anoNascimento = 1985;
		cliente2.nome = "Ana Clara Marques";
		cliente2.email = "aninha@gmail.com";
		
		Cliente cliente3 = new Cliente();
		
		cliente3.cpf = "04564238906";
		cliente3.anoNascimento = 1975;
		cliente3.nome = "Pedro de Alcantara";
		cliente3.email = "pedro_75@gmail.com";
		
		Cliente cliente4 = new Cliente();
		cliente4.cpf = "03510400902";
		cliente4.anoNascimento = 1985;
		cliente4.nome = "Ana Clara Marques";
		cliente4.email = "aninha@gmail.com";
		
		
/*/\/\/\/\/\\/\/\/\/\/\/\//\/\/\/\/\/\/\/\/\/\/\/\/\/\\/\/\*/
		Conta conta1 = new Conta();
		conta1.numero = 1521;
		conta1.saldo = (float)750.63;
		
		Conta conta2 = new Conta();
		conta2.numero = 1314;
		conta2.saldo = (float)10.36;
		
		Conta conta3 = new Conta();
		conta3.numero = 2368;
		conta3.saldo = (float)1523.00;
		
		Conta conta4 = new Conta();
		conta4.numero = 3568;
		conta4.saldo = (float)-50.45;
		
		Conta conta5 = new Conta();
		conta5.numero = 2224;
		conta5.saldo = (float)91.23;
		
		Conta conta6 = new Conta();
		conta6.numero = 1019;
		conta6.saldo = (float)-70.35;
		
		System.out.println(conta1.retornaConta());
		System.out.println(conta1.debitaSaldo());
		System.out.println(conta1.retornaConta());
		
		System.out.println("pula linha");
		
		System.out.println(conta2.retornaConta());
		System.out.println(conta2.creditaSaldo());
		System.out.println(conta2.retornaConta());
	}


}
