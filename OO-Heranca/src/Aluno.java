
public class Aluno extends Pessoa {
	
	private String curso;
	private String[] notas;
	
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

	public String[] getNotas() {
		return notas;
	}

	public void setNotas(String[] notas) {
		this.notas = notas;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Dados - Aluno ");
		System.out.println(this.obterEtiquetaEndereco());
		
	}
	
	
	
	

	

	
}
