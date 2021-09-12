package javaBasico;
import java.util.Scanner;

public class vetoresEx02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++ ) {
			
			System.out.print("Entre com o valor da posição " + i + ": ");
			vetorA[i] = leitor.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.print("vetor a: ");
		for (int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("vetor b: ");
		for (int valoresB : vetorB) {
			System.out.println(valoresB);
		}
		
	}
}

