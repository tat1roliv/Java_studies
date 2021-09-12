
public class Aluno extends Pessoa {
	
	private String[] cursos;
	private String[][] notas;
	
	//construtores
	public Aluno() {
		
	}
	
	//metodos
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}

	
	
	//getters setters
	public String[] getCursos() {
		return cursos;
	}

	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}

	public String[][] getNotas() {
		return notas;
	}

	public void setNotas(String[][] notas) {
		this.notas = notas;
	}

	
	
	
	

	

	
}
