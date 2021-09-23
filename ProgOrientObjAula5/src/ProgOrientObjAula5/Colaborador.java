package ProgOrientObjAula5;

public abstract class Colaborador {
	
	//atributos
	private String nome;
	private String departamento;
	
	//construtor
	public Colaborador(String nome, String departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}
	
	//metodo abstrato
	public abstract double salario();
	
	//getters setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		 return String.format("Colaborador: %s\nDepartamento: %s", this.nome, this.departamento);
	}
	
	
	

}
