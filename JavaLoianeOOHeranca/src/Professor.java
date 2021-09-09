
public class Professor {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private double salario;
	private String nomeCurso;
	
	//construtores
	public Professor() {
		
	}
	
	public Professor(String nome, String endereco, String telefone, String cpf, double salario, String nomeCurso) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.salario = salario;
		this.nomeCurso = nomeCurso;
	}
	
	
	//metodos
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
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
