
public class Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		//acesso a toda a classe aluno
		
		aluno.setNome("Maria");
		System.out.println(aluno.getNome());
		
		Pessoa professor = new Professor();
		//pessoa => superclass das classes professor e aluno => nessa forma de declaracao, só se tem acesso aos atributos da classe pessoa, sem as particularidades da classe professor
		
	}
	
	


}
