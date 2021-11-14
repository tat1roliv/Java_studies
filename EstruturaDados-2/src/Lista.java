// Implementação da classe Lista
public class Lista {
	private No inicio;

	public Lista() // construtor da classe Lista inicializada vazia
	{
		this.inicio = null;
	}
	
	
	//Inserção de um elemento no início da Lista.
	public void insereInicio(Object elemento) {
		No novo = new No(elemento, null);
		novo.setProximo(this.inicio);
		this.inicio = novo;
		
	}
	// Insercao de um elemento em uma posicao
	public void inserePosicao(Object elemento, int pos) {
		int i=0;
		No aux = this.inicio;
		No ant = null;
		while(i<pos) {
			ant = aux;
			aux = aux.getProximo();
			i++;
		}
		No novo = new No(elemento, aux);
		if( ant == null )
			// insere no inicio da lista
			this.inicio = novo;
		else // insere no meio ou no final da lista
			ant.setProximo(novo);
		
	}
	public void imprimeLista() {
		No aux = this.inicio;
		System.out.print("[ ");
		while( aux != null) {
			System.out.print(aux.getElemento()+" ");
			aux = aux.getProximo();
		}
		System.out.println("]");
	}
}
// Final da classe Lista