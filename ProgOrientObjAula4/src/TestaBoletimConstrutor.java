import java.util.Scanner;

public class TestaBoletimConstrutor {

	public static void main(String[] args) {
		
		double nota;
		int frequencia;
		String status;
				
				
		Scanner ler = new Scanner (System.in);
				
		System.out.print("Insira a nota de início: ");
		nota = ler.nextDouble();
		System.out.print("Insira a frequência de início: ");
		frequencia = ler.nextInt();
		System.out.print("Insira o status de início: ");
		status = ler.next();
				
		BoletimConstrutor B1;
		B1 = new BoletimConstrutor(nota,frequencia,status);
		
		BoletimConstrutor B2 = new BoletimConstrutor();
		BoletimConstrutor B3 = new BoletimConstrutor("APROVADO \n");
		
		System.out.println(B1.getNota());
		System.out.println(B2.getNota());
		System.out.println(B3.getNota());
		
		System.out.println(B1.getStatus());
		System.out.println(B2.getStatus());
		System.out.println(B3.getStatus());
		
		System.out.println("Uso do construtor com 3 parâmetros: ");
		B1.imprimir() ;
		
		System.out.println("Uso do construtor com nenhum parâmetro: ");
		B2.imprimir();
		
		System.out.println("Uso do construtor com 2 parâmetros: ");
		B3.imprimir();
		
	}

}
