
public class TestaContato {

	public static void main(String[] args) {
		
		Contato contato0  = new Contato();
		contato0.nome = "Joao";
		contato0.endereco = "Av 1, 90";
		contato0.email = "joao@gmail.cm";
		
		contato0.telefones = new String[5];
		contato0.telefones[0] = "111111111";
		contato0.telefones[1] = "999999999";
		
		System.out.println(contato0.telefones[1]);
		

	}

}
