package arquiteturaSingleton_aula3;

public class testaGerenciamentoImpressora {

	public static void main(String[] args) {
		GerenciamentoImpressora obj1 = GerenciamentoImpressora.getInstance();
		System.out.println("documento-impressao-1: " + obj1);
		
		GerenciamentoImpressora obj2 = GerenciamentoImpressora.getInstance();
		System.out.println("documento-impressao-2: " +obj2);
		
		if (obj1 == obj2) {
			System.out.println("\nPossuem a mesma instância.");
		}

	}

}
