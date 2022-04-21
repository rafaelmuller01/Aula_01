package Aplicacao;

public class Calcula {
	
	public float soma (float n1, float n2) {
		return n1 + n2;
	}
	
	public float subtrai (float n1, float n2) {
		return n1 - n2;
	}
	
	public float multi (float n1, float n2) {
		return n1 * n2;
	}

	public boolean maior(double n1, double n2) {
		if(n1 >= n2) {
			return true;
		}else {
			return false;
		}
		
	}
}
