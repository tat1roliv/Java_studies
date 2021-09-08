package agenda;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;
	
	//construtores
	public Agenda() {
		
	}

	public Agenda(String nome) {
		this.nome = nome;
	}
	
	//metodos
	public String obterInfo() {
		String info = "Nome: " + nome ;
		
		if(contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo();
				
			}
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

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	
	
	

}
