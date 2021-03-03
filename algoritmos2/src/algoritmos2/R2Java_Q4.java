package algoritmos2;
import java.util.Scanner;

public class R2Java_Q4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o consumo em Kw: ");
		int consumo = leitor.nextInt();
		float valor;
		if (consumo < 150) {
			valor = consumo * 0.20f;
		}
		else if(consumo < 500) {
			valor = consumo * 0.25f;
		}
		else {
			valor = consumo * 0.30f;
		}
		if (valor < 11.90f) {
			valor = 11.90f;
		}
		System.out.println("Valor da Conta: " + String.format("%.2f", valor));
	}

}
