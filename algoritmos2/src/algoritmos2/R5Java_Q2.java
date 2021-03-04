package algoritmos2;
import java.util.Scanner;

public class R5Java_Q2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//declara vetorA
		int []vetorA = new int[7];
		//solicita elementos vetorA
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetorA[i] = leitor.nextInt();
		}
		
		//pesquisa e troca valores
		int cont = 0;
		for (int i= 0; i < vetorA.length; i++) {
			if(vetorA[i] >= 10 && vetorA[i] <=20) {
				vetorA[i] = 0;
				cont++;
			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + "   ");
		}
		System.out.println("\nModificações: " + cont);
	}

}
