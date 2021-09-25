
public class Calculadora {
	
	public static int quadrado(int x) {
		return x*x;
		
	}

	public static double quadrado(double y) {
		return y*y;
	}
	
	public static void main(String[] args) {
		
		int res = quadrado(2);
		double res2 = quadrado(2.5);
		System.out.println(res + "  e  " +res2);
		
	}
}
