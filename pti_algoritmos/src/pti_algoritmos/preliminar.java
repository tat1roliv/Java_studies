package pti_algoritmos;
import java.util.Scanner;

public class preliminar {
	
	public static void main(String[] args) {
		int nVetor = lerElementosVetor(0);
		int v[] = new int[nVetor];
		System.out.println("no static void main " + nVetor);
		lerVetor(v);
		imprimir(v);

	}

	public static int lerElementosVetor(int n) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a quantidade de posições do vetor: ");
		String valorDigitado = leitor.nextLine();
		
		//System.out.print(valorDigitado);
		
		while (valorDigitado == "sss") {//regex?
			System.out.println("Digite um valor válido para a quantidade de posições do vetor [n inteiro]:");
			valorDigitado = leitor.nextLine();
		}
		return Integer.parseInt(valorDigitado);
	
		
	}
	
	//ler dados do vetor (input)
    public static void lerVetor(int []vet){
        
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++){
        	System.out.print("V["+i+"]: ");
        	vet[i] = leitor.nextInt();
       }
    }
    
	//imprimir
    public static void imprimir(int[] vet){
        
        for (int i = 0; i < vet.length; i++) {
        System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    

	

}
