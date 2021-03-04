package pti_algoritmos;

public class ExVetorFuncao {
	
	
	public static void main(String[] args) {
		// dec inic vetor
		int []vetor = {10, 20, 30, 40, 50, 60};
		//chama funcao apresentarVetor
		apresentarVetor(vetor);
		//chama funcao somarVetor
		int soma = somarVetor(vetor);
		System.out.println("\nSoma = " + soma);
	}
	
	static void apresentarVetor(int [] vetor) {
		for (int i=0; i< vetor.length; i++) {
			System.out.println(vetor[i]);
		}	
	}
	
	static int somarVetor (int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[1];
		}
		return soma;
	}
	
	
}
