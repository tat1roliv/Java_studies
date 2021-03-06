package pti_algoritmos;
import java.util.Scanner;

public class CriacaoVetor {
	
	
	
	
	
	//funcao criarVetor
    static int[] CriarVetor() {
    	
    	System.out.println("Digite o número de elementos do vetor: ");
        
        int nElementosVetor = ObtemInteiroTratadoDoTerminal();
        
        while (tamanhoVetor < 2) {
        	System.out.println("O vetor precisa conter pelo menos 2 elementos para que possam ser comparados. Informe um número válido: ");
        	tamanhoVetor = ObtemInteiroTratadoDoTerminal();        	
        }
        
        int vetor[] = new int[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
        	
        	System.out.println("Informe o valor do " + (i+1) + "º elemento do vetor: ");      	  
      	         	  
      	    vetor[i] = ObtemInteiroTratadoDoTerminal();        	
        }    	
    	
    	return vetor;
    }
	
	
	
	public static void main(String[] args) {
		
		int [] vetorA = CriarVetor();
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número de elementos do vetor: ");
		//double n = leitor.nextDouble();
		
		//double []vetor = new double [n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Elemento: ");
			vetor[i] = leitor.nextDouble();
		}

	}

}
