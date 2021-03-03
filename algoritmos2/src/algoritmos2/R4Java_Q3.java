package algoritmos2;
import java.util.Scanner;

public class R4Java_Q3 {
	
	static boolean retornaParImpar(int n) {
		if (n%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o número: ");
		int n = leitor.nextInt();
		boolean verificaPar = retornaParImpar(n);
		if (verificaPar) {
			System.out.println("É par");
		}else {
			System.out.println("É impar");
		}

	}

}
