
public class Excecao {
	
	/*
	try {
		//bloco que é monitorado para erros
	}
	catch (TipoDaException exceptionVariavel) {
		//tratamento do erro
	}
	*/

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
		
			System.out.println("antes da exception");
		
			vetor[4] = 1;
		
			System.out.println("nao sera impresso");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("exception vetor = indice nao existe");
		}
		System.out.println("impresso apos a exception");
	}
	

}
