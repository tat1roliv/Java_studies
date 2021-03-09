package pti_algoritmos;
//import java.util.Arrays;
import java.util.Scanner;

public class pti_quase {
	
	public static void main(String[] args) {
		//telaEntrada
		txtEntradaPrograma();
		//declaracao do vetor
		int nVetor = lerElementosVetor(0);
		int v[] = new int[nVetor];
		lerVetor(v);
		System.out.print("Vetor declarado: ");
		imprimir(v);
		//calcula maior diferenca
		int maiorDiferencaEntreElementos = CalculaMaiorDiferencaVetor(v);
		System.out.println("Maior diferença entre elementos do vetor informado: " + maiorDiferencaEntreElementos);
		//verifica se ordenado
		boolean vetorOrdenado = verificaSeOrdenado(v);
		//imprime mensagem se ordenado ou nao
		if (vetorOrdenado) {
			System.out.println("Elementos do vetor estão ordenados.");
		}else {
			System.out.println("Elementos do vetor NÃO estão ordenados.");
		}

	}
	
	public static void txtEntradaPrograma() {
		System.out.println("******* P R O G R A M A ********");
		System.out.println("_____Trabalhando com Vetores_____");
		System.out.println();
	}
	
	public static int lerElementosVetor(int n) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o número de elementos do vetor: ");
		String valorDigitado = leitor.nextLine();
		
		//System.out.print(valorDigitado);
		
		while (!validaInteiro(valorDigitado)) {
			System.out.print("Valor inválido, digite outra vez (número inteiro): ");
			valorDigitado = leitor.nextLine();
		}
		return Integer.parseInt(valorDigitado);
		
	}
	
	//ler dados do vetor (input)
    public static void lerVetor(int []vet){
        
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++){
        	System.out.print("Informe o elemento na posição V["+i+"]: ");
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
    
    //validar inteiro
    //consultado em (https://receitasdecodigo.com.br/java/verificar-se-uma-string-e-inteiro-em-java)
    public static boolean validaInteiro(String valorTestar) {
        return valorTestar != null && valorTestar.matches("[0-9]*");
    }
    
    //calcula a maior diferença entre elementos do vetor
    public static int CalculaMaiorDiferencaVetor(int []vet) {
    	
    	int maiorElementoVetor = vet[0];
    	int menorElementoVetor = vet[0];
    	
    	//busca maior e menor	
    	for (int i = 0; i < vet.length; i++) {

    		if (vet[i] > maiorElementoVetor) {
    			maiorElementoVetor = vet[i];
    		}
    		if (vet[i] < menorElementoVetor) {
    			menorElementoVetor = vet[i];			
    		}
    	}
    	System.out.println("Maior elemento do vetor informado: " + maiorElementoVetor);
    	System.out.println("Menor elemento do vetor informado: " + menorElementoVetor);
    	
    	return calculaDiferencaEntreValores(maiorElementoVetor, menorElementoVetor);
    }
    
    //operacao solicitada entre elementos do vetor
    public static int calculaDiferencaEntreValores(int x, int y) {
    	return x - y;
    }
    
  //verifica ordenamento (ordem crescente do vetor)
    public static boolean verificaSeOrdenado(int []vetor) {
    	
    	boolean ordenado = false;
    	
    	for (int i = 1; i < vetor.length; i++) {       		
    		if(vetor[i-1] <= vetor[i]) {
    			ordenado  = true;
    		}
    		else {
    			ordenado = false;
    		}
    	}
    	
    	return (ordenado);
    	 	
    }
    
}