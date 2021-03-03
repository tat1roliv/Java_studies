package algoritmos2;
import java.util.Scanner;

public class R3Java_Q6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número para calcular a tabuada: ");
		int n = leitor.nextInt();
		System.out.println("tabuada a calcular: "+n);
		int res;
		for(int i=0;i<=10;i++) {
			res = n * i;
			System.out.println(n + "x" + i + "=" + res);
		}

	}

}
