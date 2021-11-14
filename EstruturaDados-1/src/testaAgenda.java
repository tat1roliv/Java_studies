
public class testaAgenda {

	public static void main(String[] args) {
		
		//aplicação cliente
		
		Contato c1 = new Contato("ana", 45, "123456");
		Lista agenda = new Lista();
		
		System.out.println(c1.comparaNome("ana"));
		//System.out.println(c1.comparaNome("jose"));
		
		agenda.inserir(c1);
		agenda.inserir(new Contato("adao", 20, "654321"));
		agenda.inserir(new Contato("ada", 29, "456789"));
		
		
		
		if (agenda.recuperar("adanoilda") == null)
			System.out.println("não achei");
		
		agenda.atualizar("adao", 59, "999999");
		
		System.out.println("qtd contatos: " + agenda.quantidade());
		
	}

}
