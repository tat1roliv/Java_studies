package algoritmos2;

public class R4Java_Q1 {
	
	static String imprimirSituacao(float nota) {
		String status;
		if (nota >= 6f) {
			status = "aprovado";
		}
		else {
			status = "reprovado";
		}
		return status;
	}
	
	public static void main(String[] args) {
		String situacao = imprimirSituacao(6.7f);
		System.out.println(situacao);
	}

}
