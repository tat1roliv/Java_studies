// calculadora
package algoritmos2;
import java.util.Scanner;

public class R4Java_Q5 {
	
	
	static double funcaoSomar(double n1, double n2) {
		return n1 + n2;
	}
	
	static double funcaoMultiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	static double funcaoSubtrair(double n1, double n2) {
		return n1 - n2;
	}
	
	static double funcaoDividir(double n1, double n2) {
		return n1 / n2;
	}
	
	static double raizQuadrada (double n) {
		return Math.sqrt(n);
	}
	
	static double potencia (double n1, double n2) {
		return Math.pow(n1, n2);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n1 = leitor.nextInt();
		System.out.println("Digite o segundo número: ");
		double n2 = leitor.nextInt();
		double valorSoma = funcaoSomar(n1, n2);
		System.out.println("A soma é: " + valorSoma);
		double valorMultiplicacao = funcaoMultiplicar(n1, n2);
		System.out.println("A multiplicação é: " + valorMultiplicacao);
		double valorSubtracao = funcaoSubtrair(n1, n2);
		System.out.println("A subtração é: " + valorSubtracao);
		double valorDivisao = funcaoDividir(n1, n2);
		System.out.println("A divisão é: " + valorDivisao);
		double valorRaiz = raizQuadrada(n1);
		System.out.println("A raiz do primeiro é: " + valorRaiz);
		valorRaiz = raizQuadrada(n2);
		System.out.println("A raiz do segundo é: " + valorRaiz);
		double valorPotencia = potencia(n1, n2);
		System.out.println("A potencia é: " + valorPotencia);

	}

}
