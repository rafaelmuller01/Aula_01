package Aplicacao.teste;

import org.junit.*;

import Aplicacao.Calcula;

public class CalculaTeste {
	
	@Test
	public void testeSoma(){
		double resultado;
	
		Calcula calc = new Calcula();
		resultado = calc.soma(10, 5);
		
		Assert.assertEquals(15, resultado, 0); //MARGEM DE ERRO É O ULTIMO, E O PRIMEIRO É O RESULTADO QUE EU QUERO
		
		resultado = calc.soma(3, -5);
		Assert.assertEquals(-2, resultado, 0);
		
		resultado = calc.soma(-15, 30);
		Assert.assertEquals(15, resultado, 0);
		
		resultado = calc.soma(-5, -8);
		Assert.assertEquals(-13, resultado, 0);
	}
	
	
	
	@Test
	public void testeSubtrai() {
		double resultado1;
		
		Calcula calc1 = new Calcula();
		
		resultado1 = calc1.subtrai(10, 5);
		Assert.assertEquals(5, resultado1, 0);
		
		resultado1 = calc1.subtrai(13, -5);
		Assert.assertEquals(18, resultado1, 0);
		
		resultado1 = calc1.subtrai(-15, 30);
		Assert.assertEquals(-45, resultado1, 0);
		
		resultado1 = calc1.subtrai(-5, -8);
		Assert.assertEquals(3, resultado1, 0);
	}
	
	@Test
	public void testeMulti() {
		double resultado2;
		
		Calcula calc2 = new Calcula();
		
		resultado2 = calc2.multi(10, 5);
		Assert.assertEquals(50, resultado2, 0);
		
		resultado2 = calc2.multi(2, -5);
		Assert.assertEquals(-10, resultado2, 0);
		
		resultado2 = calc2.multi(-2, 30);
		Assert.assertEquals(-60, resultado2, 0);
		
		resultado2 = calc2.multi(-2, -8);
		Assert.assertEquals(16, resultado2, 0);
		
	}
	
	@Test
	public void testeSubtraiDecimal() {
		double resultado3;
		
		Calcula calc3 = new Calcula();
		
		resultado3 = calc3.subtrai((float)10.3, (float)5.1);
		Assert.assertEquals(5.2, resultado3, 0.1);
		
	}

	@Test
	public void testeMaior() {
		boolean resultado4;
		boolean resultado5;
	
		Calcula calc4 = new Calcula();
		Calcula calc5 = new Calcula();
	
		resultado4 = calc4.maior(10, 1);
		Assert.assertTrue(resultado4);
	
		resultado5 = calc5.maior(1, 10);
		Assert.assertFalse(resultado5);
	}

	@Ignore
	public void before() {
		System.out.println("INICIANDO OS TESTES");
	}
	
	@Ignore
	public static void afterClass() {
		System.out.println("FINALIZANDO OS TESTE DA CLASSE CALCULO");
	}
	
}