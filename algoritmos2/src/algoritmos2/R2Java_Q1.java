package algoritmos2;
import java.util.Scanner;

public class R2Java_Q1 {
	
		
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numeroDigitado = leitor.nextInt();
		if (numeroDigitado > 100) {
			int soma = numeroDigitado + 150;
			System.out.println("Resultado: " + soma);
		}	
	}
}
