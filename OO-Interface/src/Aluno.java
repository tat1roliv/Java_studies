import java.util.Arrays;
import java.util.Objects;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	//construtores
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	//metodos
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}

	public String obterEtiquetaEndereco() {
		String enderecoAluno = "Endereço do aluno: ";
		enderecoAluno += super.getEndereco();
		return enderecoAluno;

	}
	

	//getters setters
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Dados - Aluno ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		
		return Objects.equals(curso, other.curso) && Arrays.equals(notas, other.notas);
	}
	

	
	




}






