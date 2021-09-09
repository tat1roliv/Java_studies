
public class Aluno extends Pessoa {
	
	private String cursos;
	private double notas;
	
	//construtores
	public Aluno() {
		
	}

	public Aluno(String nome, String endereco, String telefone, String cpf, String cursos, double notas) {
		this.cursos = cursos;
		this.notas = notas;
	}
	
	
	//metodos
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	
	//getters setters
	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	
	
	
	

	

	
}
