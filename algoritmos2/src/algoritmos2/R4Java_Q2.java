package algoritmos2;
import java.util.Scanner;

public class R4Java_Q2 {
	
	static int retornaMaior(int n1, int n2) {
		int maior = n1;
		if(n2>n1) {
			maior = n2;
		}
		return maior;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		int n2 = leitor.nextInt();
		int maior = retornaMaior(n1,n2);
		System.out.println("o maior número informado é: " + maior);

	}

}
