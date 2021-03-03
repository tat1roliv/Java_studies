package algoritmos2;
import java.util.Scanner;

public class RJava_Q3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o salário: ");
		double salario = leitor.nextDouble();
		System.out.print("Digite o valor do reajuste (em %): ");
		double reajuste = leitor.nextDouble();
		double salarioReajustado = salario + (salario * (reajuste/100));
		System.out.println("Salario: " + salario);
		System.out.println("Reajuste(em %): " + reajuste);
		System.out.println("Salario novo: " + salarioReajustado);

	}

}
