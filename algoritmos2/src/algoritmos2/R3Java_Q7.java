package algoritmos2;
import java.util.Scanner;

public class R3Java_Q7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int n1 = leitor.nextInt();
		int n2;
		do {
			System.out.println("Digite o segundo numero: ");
			n2 = leitor.nextInt();
			if (n2 == 0) {
				System.out.println("valor invalido");
			}
			
		} while (n2 ==0 );
		float divisao = (float) n1/n2;
		System.out.println("Resultado = " + String.format("%.2f", divisao));
	}

}
