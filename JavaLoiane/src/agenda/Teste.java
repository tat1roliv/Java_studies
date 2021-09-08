package agenda;
import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entrar com o nome da agenda: ");
		String nome = leitor.nextLine();
		
		Agenda agenda = new Agenda(nome);
		System.out.println(agenda.getNome());
		
		Contato[] contatos = new Contato[3] ;
		
		for (int i = 0; i<3; i++) {
			System.out.println("Entrar com os dados do contato: ");
			Contato c = new Contato();
			
			System.out.println("Nome: ");
			nome = leitor.nextLine();
			c.setNome(nome);
			
			System.out.println("Telefone: ");
			String telefone = leitor.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Email: ");
			String email = leitor.nextLine();
			c.setEmail(email);
			
			contatos[i] =  c;
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}

		
	}
	

}
