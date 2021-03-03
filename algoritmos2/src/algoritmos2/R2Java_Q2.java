package algoritmos2;
import java.util.Scanner;

public class R2Java_Q2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento: ");
		int anoInformado = leitor.nextInt();
		int anoAtual = 2021;
		int resultado = anoAtual - anoInformado;
		if (resultado >=16) {
			System.out.println("Apto");
		}
		else
			System.out.println("Inapto");

	}

}
