package algoritmos2;
import java.util.Scanner;

public class R2Java_Q3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a altura (m): ");
		float altura = leitor.nextFloat();
		System.out.print("Digite o sexo (F/M): ");
		char sexo = leitor.next().charAt(0);
		float pesoIdeal;
		
		if (sexo == 'f' || sexo == 'F') {
			pesoIdeal = (62.1f * altura) - 44.7f;
		}
		else  {
			pesoIdeal = (72.7f * altura) - 58.0f;			
		}
		
		System.out.println("Peso ideal: " + String.format("%.2f", pesoIdeal));		
	}	
}
