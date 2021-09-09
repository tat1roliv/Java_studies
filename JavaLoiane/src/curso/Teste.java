package curso;
import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entrar com o nome do curso: ");
		String nome = leitor.nextLine();
		
		System.out.println("Entrar com o horario do curso: ");
		String horario = leitor.nextLine();
		
		System.out.println("Entrar com o professor do curso: ");
		String nomeProf = leitor.nextLine();
		
		System.out.println("Entrar com o departamento do professor do curso: ");
		String departamentoProf = leitor.nextLine();
		
		System.out.println("Entrar com o email do professor do curso: ");
		String emailProf = leitor.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(departamentoProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		//alunos
		Aluno[] alunos = new Aluno[5];
		for(int i = 0; i<5; i++) {
			System.out.println("Entrar com o nome do aluno " + (i+1) + ":");
			String nomeAluno = leitor.nextLine();
			
			System.out.println("Entrar com a matricula: ");
			String matriculaAluno = leitor.nextLine();
			
			double[] notas = new double[4];
			
			for(int j = 0; j<4; j++) {
				System.out.println("Entrar com a nota " + (j+1) + ":");
				notas[j] = leitor.nextDouble();
				
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);

			
		}
		
		curso.setProfessor(professor);
		
		

		
	}

}
