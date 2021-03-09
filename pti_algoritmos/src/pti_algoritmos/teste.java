package pti_algoritmos;
import java.util.Scanner;

public class teste {

	    public static void main(String[] args) {
	    	
	    	int vetor[] = CriaVetorComInformacoesFornecidasNoTerminal();
	    	
	    	int maiorDiferenca = ObtemDiferencaEntreElementosDeMaiorEMenorValorDoVetor(vetor);    	
	    	System.out.println("A maior diferença entre dois elementos distintos do vetor é: " + maiorDiferenca);
	    	
	    	boolean crescente = VerificaSeVetorEstaEmOrdemCrescente(vetor);
	        System.out.println("O vetor está em ordem crescente? " + ((crescente) ? "Sim" : "Não"));
	        	
	    }
	    
	    private static int[] CriaVetorComInformacoesFornecidasNoTerminal() {
	    	
	    	System.out.println("Informe a quantidade de elementos que serão lidos para o vetor: ");
	        
	        int tamanhoVetor = ObtemInteiroTratadoDoTerminal();
	        
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
	    
		private static int ObtemDiferencaEntreElementosDeMaiorEMenorValorDoVetor(int vetor[]) {
			int menorElemento = 0;
			int maiorElemento = 0;
			int valorAtual = 0;
			
	    	for (int i = 0; i < vetor.length; i++) {
	    		
	      	  	valorAtual = vetor[i];
	      	  
		      	if ( i == 0) {
		      		menorElemento = valorAtual;
		      		maiorElemento = valorAtual;
		      	}
		      	
		      	else{
		      		
		      		if (maiorElemento < valorAtual)
		          		maiorElemento = valorAtual;
		          	  
		          	if (menorElemento > valorAtual)
		          		menorElemento = valorAtual;
		      	}     	  
	    	}
	    	
	    	return maiorElemento - menorElemento;
	    }

		private static boolean VerificaSeVetorEstaEmOrdemCrescente(int vetor[]) {
			
			boolean ondemCrescente = true;		
			int valorAnterior = 0;
			int valorAtual = 0;
	    	
	    	for (int i = 0; i < vetor.length; i++) {
	    		
	    		if (i == 0)
	    			valorAnterior = vetor[i];    		
	    		
	    		if (i != 0)
	    			valorAnterior = valorAtual;
	      	  
	      	    valorAtual = vetor[i];
	      	  
	      	    if (valorAnterior > valorAtual && i != 0)
	      		    ondemCrescente = false;    	  
	      	  
	    	}
	    	
	    	return ondemCrescente;
	    }
	    
		private static int ObtemInteiroTratadoDoTerminal() {		
		
			Scanner in = new Scanner(System.in);
		  
		  	String valorTerminal = in.nextLine();
		    
		    while (NaoEhInteiro(valorTerminal)) {
		    	System.out.println("Informe um valor numérico inteiro.");
		    	
		    	valorTerminal = in.nextLine();
		    }
		    
		    return Integer.parseInt(valorTerminal);    
	    }
		
		public static boolean NaoEhInteiro(String valor) {
		    try {
		        Integer.parseInt(valor);
		        return false;
		    } catch (Exception e) {
		        return true;
		    }
		}
	}

