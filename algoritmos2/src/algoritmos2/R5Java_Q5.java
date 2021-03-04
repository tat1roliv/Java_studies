package algoritmos2;
import java.util.Scanner;

public class R5Java_Q5 {
	
	//funcao lerVetor
	static void lerVetor(float [] vetorA) {
		Scanner leitor = new Scanner(System.in);
		//solicita elementos vetorA
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetorA[i] = leitor.nextInt();
		}

	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//declara a quantidade de posicoes do vetor
		float []vetorA = new float[10];
		//chama a funcao lerVetor
		lerVetor(vetorA);
		
		//atribui a pos 0 para min e max
		float valorMinimo = vetorA[0];
		float valorMaximo = vetorA[0];
		
		//varre vetor, busca min max
		for(int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < valorMinimo) {
				valorMinimo = vetorA[i];
			}
			if (vetorA[i] > valorMaximo) {
				valorMaximo = vetorA[i];
			}
		}
		
		//print
		System.out.println("Menor: " +  valorMinimo);
		System.out.println("Maximo: " +  valorMaximo);

	}

}
