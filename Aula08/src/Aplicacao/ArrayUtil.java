package Aplicacao;

public class ArrayUtil {

	public static int soma(int vetor[]) {
		int resultadosoma = 0;

		for (int i = 0; i < vetor.length; i++) {
			resultadosoma = resultadosoma + vetor[i];
		}
		return resultadosoma;
	}

	public static int menor(int vetor[]) {

		int menorvalor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < menorvalor) {
				menorvalor = vetor[i];
			}
		}
		return menorvalor;

	}

	public static int maior(int vetor[]) {

		int maiorvalor = vetor[0];
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] > maiorvalor) {
				maiorvalor = vetor[i];
			}
		}
		return maiorvalor;

	}

	public static int negativo(int vetor[]) {
	
		int contnegati = 0;
		for (int i = 1; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				contnegati++;
			}
		}
		return contnegati;
	}
	
	public static boolean par(int vetor[]) {
		int parimpar = 0;
		for (int i = 1; i < vetor.length; i++) {
			
			if(vetor[i] %2 != 0 ) {
				return false;
			} 
		}
		
		return true;
		
	}

}
