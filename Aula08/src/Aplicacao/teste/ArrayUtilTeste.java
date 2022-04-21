package Aplicacao.teste;
import org.junit.*;
import Aplicacao.ArrayUtil;

public class ArrayUtilTeste {
	
	@Test
	public void testeSoma() {
		int resultado;
		
		int[] valores = {1, 5, 10, 30};
		
		resultado = ArrayUtil.soma(valores);
		Assert.assertEquals(46, resultado, 0);
	}
	
	@Test
	public void testemenor() {
		int resultado;
		
		int[] valores = {91, 5, 123, 19};
	
		resultado = ArrayUtil.menor(valores);
		Assert.assertEquals(5, resultado, 0);
	}
	
	@Test
	public void testemaior() {
		int resultado;
		
		int[] valores = {91, 5, 123, 19};
	
		resultado = ArrayUtil.maior(valores);
		Assert.assertEquals(123, resultado, 0);
	}
	
	@Test
	public void testeNeagativo() {
		int resultado1;
		int resultado2;
		int resultado3;
		int resultado4;
	
		int[] valores1 = {91, 5, 123, 19};
		int[] valores2 = {10, -5, 35, 42, 54};
		int[] valores3 = {1, 4,-78, 90, -89,99};
		int[] valores4 = {-2, -7, -10, -20, -40};
		
		resultado1 = ArrayUtil.negativo(valores1);
		resultado2 = ArrayUtil.negativo(valores2);
		resultado3 = ArrayUtil.negativo(valores3);
		resultado4 = ArrayUtil.negativo(valores4);
		Assert.assertEquals(0, resultado1, 0);
		Assert.assertEquals(1, resultado2, 0);
		Assert.assertEquals(2, resultado3, 0);
		Assert.assertEquals(4, resultado4, 0);
		
	}
	
	@Test 
	public void testepar() {
		
		boolean resultado1;
		boolean resultado2;
		boolean resultado3;
		
	
		int[] valores1 = {2, 4, 6, 8};
		int[] valores2 = {10, 15, 20, 42, 54};
		int[] valores3 = {1, 3, 5};
	
		
		resultado1 = ArrayUtil.par(valores1);
		resultado2 = ArrayUtil.par(valores2);
		resultado3 = ArrayUtil.par(valores3);
		
		
		Assert.assertEquals(true, resultado1);
		Assert.assertEquals(false,resultado2);
		Assert.assertEquals(false, resultado3);
	}
}