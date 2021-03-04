package algoritmos2;
import java.util.Scanner;

public class R5Java_Q3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//declara vetorA
		int []vetorA = new int[10];
		//solicita elementos vetorA
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetorA[i] = leitor.nextInt();
		}
		
		//solicita x e y
		System.out.print("Digite X: ");
		int x = leitor.nextInt();
		System.out.print("Digite Y: ");
		int y = leitor.nextInt();
		int soma = vetorA[x] + vetorA[y];
		System.out.println("Soma: " + soma);
		
	}

}
