
public class TesteCalculadora {

	//static => nao precisa da instancia da classe para utilizar o metodo
	static int resultadoSoma;
	
	public static void main(String[] args) {

		MinhaCalculadora calc = new MinhaCalculadora();
		
		System.out.println(calc.soma(1,2));
		
		System.out.println(calc.soma(6.5,7.5));
		
		System.out.println(soma2Valores(1,2));

	}
	
	static double soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
