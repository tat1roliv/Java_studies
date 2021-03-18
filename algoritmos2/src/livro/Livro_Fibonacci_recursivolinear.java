package livro;

public class Livro_Fibonacci_recursivolinear {
	
	public static int recursivoLinear(int n, int a, int b) {
		if (n == 0) return a;
		if( n == 1) return b;
		return recursivoLinear(n-1, b, a+b);
	}

}
