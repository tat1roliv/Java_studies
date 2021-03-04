package algoritmos2;
import java.util.Scanner;

public class R5Java_Q4 {
	
	//funcaoBuscar
	static int funcaoBuscar(int [] vetorA, int valorBuscado) {
		for (int i = 0; i < vetorA.length; i++) {
			if (valorBuscado == vetorA[i]) {
				return i;
	
			}
		}
		return -1;
	}
	
	
	//funcao lerVetor
	static void lerVetor(int [] vetorA) {
		Scanner leitor = new Scanner(System.in);
		//solicita elementos vetorA
		for (int i= 0; i < vetorA.length; i++) {
			System.out.print("Valor[" + i + "]: ");
			vetorA[i] = leitor.nextInt();
		}

	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		//declara vetorA
		int []vetorA = new int[5];
				
		//funcao lerVetor
		lerVetor(vetorA);
		
		//solicita valorBuscado
		System.out.print("Digite valorBuscado: ");
		int valorBuscado = leitor.nextInt();
		
		//buscar
		int res = funcaoBuscar( vetorA, valorBuscado); 
		if (res >=0) {
			System.out.println("valor encontrado na posição: "+ res);	
		}
		else {
			System.out.println("não encontrado");
		}


	}

}
