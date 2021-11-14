package ListaEncadeadaLoiane;

public class ListaEncadeada<T> {
	
	private No<T> inicio;
	
	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento); //cria a celula
		//e o inicio aponta para essa celula
		this.inicio = celula;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
