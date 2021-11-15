// Implementa��o da classe No de uma �rvore
public class No {

	private long id; // identificador do elemento
	private No esq; // aponta para o filho esquerdo do n�
	private No dir; // aponta para o filho direito do n�
	
	
	//construtor da classe No
	public No(long id, No esq, No dir) {
		this.id = id;
		this.esq = esq;
		this.dir = dir;
	}
	
	//getters setters
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
	public No getDir() {
		return dir;
	}
	public void setDir(No dir) {
		this.dir = dir;
	}
	public long getId() {
		return id;
	}
	
}
