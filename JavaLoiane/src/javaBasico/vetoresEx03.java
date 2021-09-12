package javaBasico;
import java.util.Scanner;

public class vetoresEx03 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++ ) {
			
			System.out.print("Entre com o valor da posição " + i + ": ");
			vetorA[i] = leitor.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i];
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
