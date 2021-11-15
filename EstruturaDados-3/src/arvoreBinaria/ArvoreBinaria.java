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
			
			//no aux p percorrer a arvore => ja buscar a posicao certa antes de seguir
			No aux = this.raiz;
			No pai = null; 
			
			while ( aux != null ) {
				
				pai = aux; //guardar o valor do pai antes de ir p dir ou esq
				
				if ( id < aux.getId() ) {
					aux = aux.getEsquerda();
				}
				else if ( id > aux.getId() ) {
					aux = aux.getDireita();
				}
				else
					return; //se for igual retorna, nao faz nada, segue o codigo
			}
			
			No novo = new No(id, null, null);
			//se o id for menor que a raiz(encapsulado) => seta novo no a esq
			if ( id < pai.getId() ) {
				pai.setEsquerda(novo);
			}
			
			//se o id for menor que a raiz(encapsulado) => seta novo no a dir
			else if ( id > pai.getId() ) {
				pai.setDireita(novo);
			}
			
			
		}
		
		
	}


	
	
	
	

}
