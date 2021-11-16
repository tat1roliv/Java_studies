public class No {
	
	private long id;
	private No esq;
	private No dir;
	
	public No(long val) {
		this.id = val;
		this.dir = null;
		this.esq = null;
	}
	
	public long getValor() {
		return id;
	}
	public void setValor(long valor) {
		this.id = valor;
	}
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
	
	
	

}