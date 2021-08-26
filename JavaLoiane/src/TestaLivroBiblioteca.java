import java.util.Date;

public class TestaLivroBiblioteca {

	public static void main(String[] args) {
		
		LivroBiblioteca livrobiblioteca = new LivroBiblioteca();
		livrobiblioteca.nome = "MAd8";
		livrobiblioteca.autor = "Ada";
		livrobiblioteca.qtdPaginas = 123;
		livrobiblioteca.anoLancamento = 1995;
			
		
		livrobiblioteca.emprestado = true;
		livrobiblioteca.dataEntrega = new Date() ;
		String pessoaEmprestado = "Jose";
		
		System.out.println(livrobiblioteca.nome);

	}

}
