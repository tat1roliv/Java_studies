package arvoreBinaria;

public class No {

	private long id; //id elemento
	private No esquerda; //aponta para o filho a esq
	private No direita; //aponta para o filho a dir
	
	
	//construtor
	public No(long id, No esquerda, No direita) {
		this.id = id;
		this.esquerda = esquerda;
		this.direita = direita;
	}


	//getters setters
	public No getEsquerda() {
		return esquerda;
	}


	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}


	public No getDireita() {
		return direita;
	}


	public void setDireita(No direita) {
		this.direita = direita;
	}


	public long getId() {
		return this.id ;
	}
	
	

	
}
