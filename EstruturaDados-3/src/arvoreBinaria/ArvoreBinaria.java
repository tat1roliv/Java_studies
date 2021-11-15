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
			//se o id for menor que a raiz => seta novo no a esq
			if ( id < pai.getId() ) {
				pai.setEsquerda(novo);
			}
			
			//se o id for menor que a raiz(encapsulado) => seta novo no a dir
			else if ( id > pai.getId() ) {
				pai.setDireita(novo);
			}
			
			
		}
		
		
	}
	
	//percurso simetrico ou InOrder
	public void simFixado() { 
		simFixado(this.raiz);
	}
	
	//metodo simFixado (recursivo)
	private void simFixado(No atual) {
		if ( atual != null ) {
			simFixado(atual.getEsquerda());
			System.out.print(atual.getId() + " ");
			simFixado(atual.getDireita());
		}
	}
	
	//desenha 
	public void Desenha() { 
		Desenha(this.raiz);
	}
	
	//metodo desenha
	private void Desenha(No atual) {
		if ( atual != null ) {
			Desenha(atual.getDireita());
			System.out.println(atual.getId() + " ");
			Desenha(atual.getEsquerda());
		}
		else {
			System.out.println(" - ");
		}
	}
	
	//desenhaDeitado 
		public void DesenhaDeitado() { 
			DesenhaDeitado(this.raiz, " ");
		}
		
		//metodo desenha
		private void DesenhaDeitado(No atual, String espacos) {
			if ( atual != null ) {
				DesenhaDeitado(atual.getDireita(), espacos+ "     ");
				System.out.println(espacos+atual.getId() + " ");
				DesenhaDeitado(atual.getEsquerda(), espacos+ "     ");
			}
			else {
				System.out.println(espacos+" - ");
			}
		}



	
	
	
	

}
