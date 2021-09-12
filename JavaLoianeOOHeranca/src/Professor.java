
public class Professor extends Pessoa {

	private double salario;
	private String nomeCurso;
	
	//construtores
	public Professor() {
		
	}
	
	
	//metodos
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		String enderecoProfessor = "Endereço do professor: ";
		enderecoProfessor += super.getEndereco();
		return enderecoProfessor;
		
	}

	//getters setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
	
}
