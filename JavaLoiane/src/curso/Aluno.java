package curso;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas;
	
	//metodos
	public String obterInfo() {
		String info = "Nome: " + nome ;
		info += "Matricula: " + matricula;
		info += "Notas: " ;
		
		double soma = 0;
		for (double nota: notas) {
			info += nota + " ";
			soma += nota;
		}
		
		double media = soma/4;
		info += "media: " + media;
		
		if(media >=7) {
			info += "aprovado";
		} else {
			info += "reprovado";
		}
		
		return info;
	}
	
	
	//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	

}
