package algoritmos2;
import java.util.Scanner;

public class RJava_Q5 {
	
	public static final float assinatura = 17.90f;
	public static final float interurbanos = 34.29f;
	public static final float locais = 0.04f;
	public static final float celular = 0.20f;
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o total de minutos para chamadas locais: ");
		int minutosLocais = leitor.nextInt();
		System.out.print("Digite o total de minutos para chamadas para celular: ");
		int minutosCelular = leitor.nextInt();
		float valorLocais = minutosLocais * locais;
		float valorCelular = minutosCelular * celular;
		float valorContaMes = assinatura + interurbanos + valorLocais + valorCelular;
		System.out.println("Assinatura (R$): " + assinatura);
		System.out.println("Interurbanos (R$): " + interurbanos);
		System.out.println("Chamadas locais (R$): " + valorLocais);
		System.out.println("Chamadas para celular (R$): " + valorCelular);
		System.out.println("Valor da conta do mês (R$): " + valorContaMes);
	}

}

