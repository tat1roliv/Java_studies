package algoritmos2;
import java.util.Scanner;


public class R5Java_Q1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		//declara vetorA
		int []vetorA = new int[8];
		//solicita elementos vetorA
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetorA[i] = leitor.nextInt();
		}
		
		//declara vetorB
		int []vetorB = new int[vetorA.length];
		//solicita elementos vetorB
		for (int i= 0; i < vetorB.length; i++) {
			vetorB[i] = vetorA[i] * 3;
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.print("");
	}

}
