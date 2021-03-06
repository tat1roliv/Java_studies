package pti_algoritmos;
import java.util.Scanner;
import java.util.Arrays;

public class pti_prelim {

	public static void main(String[] args) {
		
		//entrada dados
		System.out.println("Digite o número de elementos do vetor: ");
		Scanner leitor = new Scanner(System.in);
		String numInformado = leitor.nextLine();
		
		System.out.println(numInformado);
		
		verificaSeInteiro(numInformado);

		
		//int []vetorFormado = newVetor(numInformado);
}		
	public static boolean verificaSeInteiro(String valorInput) {
		try {
			Integer.parseInt(valorInput);
			return false;
		} 
		catch (Exception e){
			return true; // retorna true se nao é inteiro (consultado em https://www.guj.com.br/t/validar-se-o-campo-e-int-ou-string/363990/2)
		}
	}
	
		
	//public static int newVetor(int n){
		
		//int []v = new int [int n];
		
	//}
		
		
		

	}


