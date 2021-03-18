package livro;

public class Livro_Fibonacci_2_2 {
	
	
	public static int iterativo(int n) {
		int f = -1;
		int a = 1;
		int b = 0;
		for(int i = 3; i <= n; i++) {
			f = a+b;
			b=a;
			a = f;
			
		}
		return f;
	}

	public static int fibRecursivo(int x) {
		if (x ==0 || x==1) {
			return x;
		}
		return fibRecursivo(x-1)+ fibRecursivo(x -2);
		
	}
	
}
