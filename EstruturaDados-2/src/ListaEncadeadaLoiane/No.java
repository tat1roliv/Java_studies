package ListaEncadeadaLoiane;

public class No<T> {

		private T elemento;
		private No<T> proximo;
		
		
		
		
		
		//construtores
		//construtor passando um atributo
		public No(T elemento) {
			this.elemento = elemento;
			this.proximo = null;
			
		}
		
			
		//construtor passando os dois atributos
		public No(T elemento, No<T> proximo) {
			this.elemento = elemento;
			this.proximo = proximo;
		}
		

		//getters setters
		public T getElemento() {
			return elemento;
		}
		public void setElemento(T elemento) {
			this.elemento = elemento;
		}
		public No<T> getProximo() {
			return proximo;
		}
		public void setProximo(No<T> proximo) {
			this.proximo = proximo;
		}


		@Override
		public String toString() {
			return "No [elemento=" + elemento + ", proximo=" + proximo + ", getElemento()=" + getElemento()
					+ ", getProximo()=" + getProximo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}



		
		
}
