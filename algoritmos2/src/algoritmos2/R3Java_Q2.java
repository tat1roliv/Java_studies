package algoritmos2;
import java.util.Scanner;

public class R3Java_Q2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i = 1;
		int n;
		int quant = 0;
		int soma = 0;
		
		while (i<=6) {
			System.out.print("Digite um numero: ");
			n = leitor.nextInt();
			if (n%2 ==0) {
				soma = soma + n;
				quant++;
			}
			i++;
		}
		float media = soma /quant;
		System.out.println("Soma: " + soma);
		System.out.println("Quantidade de números pares: " + quant);
		System.out.println("Media: " + String.format("%.1f", media));
	}

}
