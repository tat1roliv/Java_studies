package algoritmos2;
import java.util.Scanner;

public class R5Java_Q6 {
	
	//vetor tiposCedulas
	static final int [] tiposCedulas = {50,20,10};//a ordem dos elementos altera o resultado
	
	public static void main(String[] args) {
		//solicita valor
		//verifica se é multiplo de 10
		Scanner leitor = new Scanner(System.in);
		int valor; 
		int []quantidade = new int [tiposCedulas.length];
 		do {
			System.out.print("Digite o valor desejado (Cédulas de $50 $20 $10): ");
			valor = leitor.nextInt();
				if (valor % 10 != 0) {
					System.out.println("valor inválido");
				}
		} while (valor % 10 != 0);
 		
 		for (int i = 0; i < tiposCedulas.length; i++) {
 			quantidade[i] = valor / tiposCedulas[i];
 			valor = valor % tiposCedulas[i];
 		}
 		
 		for (int i = 0; i < tiposCedulas.length; i++) {
 			System.out.println("R$ " + tiposCedulas[i] + " = ");
 			System.out.println(quantidade[i]);

 		}
				

		
		
	}

}
