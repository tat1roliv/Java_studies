package algoritmos2;
import java.util.Scanner;

public class R3Java_Q3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int totalPositivos = 0;
		int totalNegativos = 0;
		System.out.print("Digite um número: ");
		int n = leitor.nextInt();
		while (n!=0) {
			if (n>0) {
				totalPositivos += n;
			}
			else {
				totalNegativos += n;
			}
			System.out.print("Digite um número: ");
			n = leitor.nextInt();
		}
		int somaTotal = totalPositivos + totalNegativos;
		System.out.println("soma dos positivos: "+totalPositivos);
		System.out.println("soma dos negativos: "+totalNegativos);
		System.out.println("soma total: "+somaTotal);
	}

}
