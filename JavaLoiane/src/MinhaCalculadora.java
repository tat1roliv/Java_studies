
public class MinhaCalculadora {

	//static => nao precisa da instancia da classe para utilizar o metodo
	public static double soma(double d, double e) {
		return d + e;
	}
	
	public static double soma(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public static int soma(int[] vetorInteiros) {
		int total = 0;
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			total+= vetorInteiros[i];
		}
		
		return total;
	}
}
