package arvoreBinaria;

public class ArvoreBinaria {
	
	private No raiz;

	//construtor
	public ArvoreBinaria() {
		this.raiz = null; //inicia a arvore vazia
	}

	//metodo inserir elemento na arvore
	public void inserir(long id) {
		//para a arvore vazia => criar um novo no e atribui a raiz
		if ( this.raiz == null ) {
			this.raiz = new No(id, null, null);
			return;
		}
		//para a arvore que ja tem raiz
		else {
			//se o id for menor que a raiz(encapsulado) => seta novo no a esq
			if ( id < this.raiz.getId() ) {
				No novo = new No(id, null, null);
				this.raiz.setEsquerda(novo);
			}
		}
		
		
	}
	
	

}
