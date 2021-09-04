package pti_algoritmos;

import java.util.Scanner;

public class RecebeVetSomaImpares {

public static void main(String[] args) {
		
		int nVetor = lerElementosVetor(0);//le qtd posicoes []v
		int v[] = new int[nVetor];//cria []v com n informado
		lerVetor(v);//solicita v[i] para todas as posicoes necessarias
		System.out.print("Vetor declarado: ");
		imprimir(v);//imprime v declarado
		int resultado = somaImpares(v);
		System.out.print("Soma dos valores impares informados: "+ resultado);//calcula se impar e exibe return da funcao	
	}
	
	public static int lerElementosVetor(int n) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o número de elementos do vetor: ");
		String nVetor  = leitor.nextLine();
		return Integer.parseInt(nVetor);	
	}
	
    public static void lerVetor(int []vet){
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++){
        	System.out.print("Informe o elemento na posição V["+i+"]: ");
        	vet[i] = leitor.nextInt();
       }
    }
  
    public static void imprimir(int[] vet){  	
        for (int i = 0; i < vet.length; i++) {
        System.out.print(vet[i] + " ");
        }
        System.out.println();
    }
    
    public static int somaImpares(int []vet) {
    	int soma = 0;
    	for (int i = 0; i < vet.length; i++) {
    		if( vet[i] % 2 != 0) {
    			soma = soma + vet[i];	
    		}
    	}
    	return soma;
    }   	
}
