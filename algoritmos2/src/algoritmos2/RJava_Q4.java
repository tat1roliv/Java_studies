package algoritmos2;
import java.util.Scanner;

public class RJava_Q4 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.print("Digite o valor para horas: ");
	int hora = leitor.nextInt();
	System.out.print("Digite o valor para minutos: ");
	int minuto = leitor.nextInt();
	int conversao = minuto + (hora*60);
	System.out.println("Horario em minutos: " + conversao);
	//pode complementar com funcao validar hora
	
	
}
	
}
