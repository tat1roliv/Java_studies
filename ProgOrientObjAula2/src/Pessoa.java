
public class Pessoa {
	
	private String nome;
	private int CPF;
	private String email;
	
	private boolean Validar_CPF(int CPF) {
		//API com o sistema da Receita Federal
		return true;
	}
	
	public boolean igual(Pessoa p) {
		if (this.CPF == p.CPF) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	//getters and setters
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		if (Validar_CPF(cPF))
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	
	

}
