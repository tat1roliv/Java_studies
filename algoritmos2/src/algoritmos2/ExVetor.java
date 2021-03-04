package algoritmos2;
import java.util.Scanner;


public class ExVetor {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//declarar e inicializa o vetor
		float [] notas = new float[5];
		
		//leitura elementos vetor
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite o elemento do vetor: ");
			notas[i] = leitor.nextFloat();
			
		//media
			float somaTotal = 0.0f;
			for (int j = 0; j < notas.length; j++) {
				somaTotal += notas[j];
				System.out.println("Nota: " + j + ": " + notas[j]);
			}
			float mediaNotas = somaTotal / notas.length;
			System.out.println("média: " + mediaNotas);
		}
	}
	
}
