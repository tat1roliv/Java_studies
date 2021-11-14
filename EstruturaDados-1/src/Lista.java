//TAD LISTA SEQUENCIAL
public class Lista {
	
	//aplicacao cliente / usuario da agenda
	private Contato elementos[];
	private int qtd;
	
	
	public Lista() {	
		this.elementos = new Contato[100];
		this.qtd = 0;
	}
	
	
	
		// 1) Operação inserir
		public void inserir(Contato c) { 
			this.elementos[this.qtd] = c;
			this.qtd++;
		}
		
		
		
		// 2) Operação recuperar
		public Contato recuperar(String nome) { 
			
			//buscar contato
			for (int i =0; i < qtd; i++) {
				if ( this.elementos[i].comparaNome(nome)==0) {
					//achou contato
					return this.elementos[i];
				}
			}
			
			return null;
		}
		
		
		
		
		// 3) Operação atualizar
		public void atualizar(String nome, int idade, String telefone) {
			
			for (int i =0; i < qtd; i++) {
				//buscar contato
				if ( this.elementos[i].comparaNome(nome)==0) {
					//achou contato
					this.elementos[i] = new Contato(nome, idade, telefone);
					return ; //retorno com nada = sai do laço
					
				}
			}			
			
		}
		
		
		//4) remover
		public void remover(Contato c) {
			
			
		}
		
		
		
		// 5) Informa a quantidade de elementos da Lista
		public int quantidade() { 
			return this.qtd;
		}
	
	}
