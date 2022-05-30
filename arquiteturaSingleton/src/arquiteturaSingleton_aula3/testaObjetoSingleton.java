package arquiteturaSingleton_aula3;

public class testaObjetoSingleton {

	public static void main(String[] args) {
		
		ObjetoSingleton obj1 = ObjetoSingleton.getInstance();
		System.out.println("\nobjeto1: " + obj1);
		
		ObjetoSingleton obj2 = ObjetoSingleton.getInstance();
		System.out.println("\nobjeto2: " +obj2);
		
		if (obj1 == obj2) {
			System.out.println("\nPossuem a mesma instância.");
		}
	}

}
