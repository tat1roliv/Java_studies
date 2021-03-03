package algoritmos2;
import java.util.Scanner;

public class R2Java_Q5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o mês: ");
		int mes = leitor.nextInt();
		switch (mes) {
		case 1: 
		case 12:
			System.out.println("Ferias!");
			break;
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("1 semestre");
			break;
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			System.out.println("2 semestre");
			break;
		default:
			System.out.println("Mês Inválido!");
		}	

	}

}
