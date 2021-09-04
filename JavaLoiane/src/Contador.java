
public class Contador {
	
	//atributos
	static int cont;
	
	//construtor
	public Contador() {
		cont++;
	}
	
	//metodos
	public static void Incrementar() {
		cont++;
	}

	public static void Zerar() {
		cont = 0;
	}
	
	public static int ObterValor() {
		return cont;
	}
}
