package javaBasico;
import java.util.Scanner;

public class vetoresEx04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] vetorA = new double[3];
		double[] vetorB = new double[vetorA.length];
		
		for (int i=0; i < vetorA.length; i++ ) {
			
			System.out.print("Entre com o valor da posição " + i + ": ");
			vetorA[i] = leitor.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("vetor a: ");
		for (int i=0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println("vetor b: ");
		for (double valoresB : vetorB) {
			System.out.println(valoresB);
		}
		
	}
}