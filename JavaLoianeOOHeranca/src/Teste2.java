
public class Teste2 {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua X, n.1");
		aluno.setEndereco("Rua Y, n.22");
		professor.setEndereco("Rua Z, n.333");
		
		System.out.println(pessoa.obterEtiquetaEndereco());//metodo da superclass
		System.out.println(aluno.obterEtiquetaEndereco());//metodo da classe aluno =>polimorfismo
		System.out.println(professor.obterEtiquetaEndereco());//metodo da classe professor=>polimorfismo
		
	}

}
