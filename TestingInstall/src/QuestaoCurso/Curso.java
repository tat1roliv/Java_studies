package QuestaoCurso;
/*
public class Curso {
	
	private String nome;
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}
*/

import java.util.ArrayList;

public class Curso {
	
	//atributos
	private String nome;
	private ArrayList<String> disciplinasCurso;
	
	//construtor
	public Curso(String nome) {
		this.nome = nome;
		this.disciplinasCurso = new ArrayList<>();
	}
	
	//metodo da classe	
	public void addDisciplina(String disciplina) {
		this.disciplinasCurso.add(disciplina);	
	}
	
	//getters setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getDisciplinasCurso() {
		return disciplinasCurso;
	}

	public void setDisciplinasCurso(ArrayList<String> disciplinasCurso) {
		this.disciplinasCurso = disciplinasCurso;
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", disciplinasCurso=" + disciplinasCurso + "]";
	}
	
	

}