
public class Teste3 {

	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Analise de Sistemas");
		double[] notas = { 10 , 7 , 8};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "hola que tal";
		String s2 = "hola que talXXX";
		String s3 = "hola que tal";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s3));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Analise de Sistemas");
		double[] notas2 = { 10 , 7 , 8};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));//compara os atributos
		
		
		
	}
	
	
}
