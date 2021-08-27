
public class Boletim {
	
	//atributos
		private float nota;
		private int frequencia;
		private String status;
		
		//metodos
		public void inserir_nota(float nota) {
			this.nota = nota;
		}
		
		public void excluir_nota() {
			
		}
		
		public void alterar_nota(float nova_nota) {
			nota = nova_nota;
		}
		
		public void inserir_frequencia(boolean freq) {
			
		}
		
		public void alterar_status() {
			
		}
		
		public void calcular_media() {
			
		}
		
		//getters setters
		public float getNota() {
			return nota;
		}

		public void setNota(float nota) {
			this.nota = nota;
		}

		public int getFrequencia() {
			return frequencia;
		}

		public void setFrequencia(int frequencia) {
			this.frequencia = frequencia;
		}
		

}
