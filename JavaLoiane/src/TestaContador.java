
public class TestaContador {

	static void imprimirValor() {
		System.out.println(Contador.ObterValor());
	}
	
	public static void main(String[] args) {
		
		imprimirValor();
		
		Contador.Incrementar();
		Contador.Incrementar();
		Contador.Incrementar();

		imprimirValor();
		
		Contador.Zerar();
		
		imprimirValor();
		
		Contador c1 = new Contador();
		
		imprimirValor();
	}

}
