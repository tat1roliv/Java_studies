package curso;

public class Professor {
	
	private String nome;
	private String departamento;
	private String email;
	
	//metodos
	public String obterInfo() {
		return "Nome: " + nome +
				"\nDepartamento: " + departamento +
				"\nEmail: " + email;
	}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}

