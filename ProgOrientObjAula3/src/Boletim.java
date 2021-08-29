
public class Boletim {
	
	//atributos
	private double nota;
	private int frequencia;
	private String status;
	
	//metodos
	public void inserir_nota(double nota) {
		this.nota = nota;
	}
	
	public void excluir_nota() {
		
	}
	
	public void alterar_nota(double nova_nota) {
		this.nota = nova_nota;
	}
	
	public void inserir_frequencia(boolean freq) {
		
	}
	
	public void alterar_status() {
		
	}
	
	//calcular media
	public double calcular_media(double AM, double AC, double AS) {
			
			double media = AM * 0.3 + AC * 0.2 + AS * 0.5;
			return media;
	}
		
	public double calcular_media(double PM, double AS) {
			
			double media = PM * 0.4 + AS * 0.6;
			return media;
	    }
	
	//getters setters
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	

}
