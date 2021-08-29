
public class TestaPessoa {

	public static void main(String[] args) {
	
		Pessoa P = new Pessoa();
		
		P.setNome("Albert");
		P.setCPF(111222333);
		P.setEmail("albert@senac.com.br");
		
		System.out.println("\nDados pessoa: ");
		System.out.println("O CPF inserido foi: " + P.getCPF());
		System.out.println("O nome inserido foi: " + P.getNome());
		System.out.println("O email inserido foi: " + P.getEmail());
		
		Pessoa P2 = new Pessoa();
		
		System.out.println("\nDados pessoa: ");
		P2.setNome("Jose da Silva");
		P2.setCPF(111222333);
		P2.setEmail("jose@senac.com.br");
		
		System.out.println("O CPF inserido foi: " + P2.getCPF());
		System.out.println("O nome inserido foi: " + P2.getNome());
		System.out.println("O email inserido foi: " + P2.getEmail());
		
		
		//comparando objetos => objetos diferentes => alocação na memoria => resultado nao é a mesma pessoa
		if (P == P2) {
			System.out.println("mesma pessoa");
		}else {
			System.out.println("não são a mesma pessoa");
		}
		
		//chama o metodo que vrifica se p1 == p2
		if (P.igual(P2)) {
			System.out.println("mesma pessoa");
		}else {
			System.out.println("não são a mesma pessoa");
		}
		
		

	}

}
