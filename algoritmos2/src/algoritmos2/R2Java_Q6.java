package algoritmos2;
import java.util.Scanner;

public class R2Java_Q6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int numero1 = leitor.nextInt();
		System.out.println("Digite o segundo numero: ");
		int numero2 = leitor.nextInt();
		System.out.println("Digite o operador: ");
		char operador = leitor.next().charAt(0);
		int res = 0;
		switch (operador) {
		case '+':
			res = numero1 + numero2;
			break;
		case '-':
			res = numero1 - numero2;
			break;
		case '*':
			res = numero1 * numero2;
			break;
		case '/':
			res = numero1 / numero2;
			break;
		default:
			System.out.println("dados invalidos");
		}
		System.out.println("Resultado: " + String.format("%.2f",res));
	}
}
