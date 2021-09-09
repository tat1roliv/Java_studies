package curso;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	
	//metodos
	public String obterInfo() {
		String info = "Nome do curso: " + nome + "\n";
		
		if (professor != null) {
			info += professor.obterInfo();
		}
		
		if (alunos != null) {
			System.out.println("alunos");
			
			for(Aluno aluno : alunos) {
				info += aluno.obterInfo();
			}
			
		}
		return info;
			
	}
	
	public double obterMedia() {
		double soma = 0;
		
		for (double nota : nota) {
			soma += nota;
		}
		return soma/4;
		
	}
	
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	
}
