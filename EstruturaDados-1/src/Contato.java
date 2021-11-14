//tad - tipo abstrato de dados

public class Contato{
	
	private String nome;
	private int idade;
	private String telefone;
	
	public Contato(String nome, int idade, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}


	public int comparaNome(String nome){
		return this.nome.compareTo(nome);
		
	}
	
	//getters setters
	public String getTelefone(){
		return this.telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

//toString
	@Override
	public String toString() {
		return "Contato: "+ this.nome + " | Telefone: " + this.telefone;
	}
	
	
	
	
	
}