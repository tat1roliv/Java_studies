package livro;

public class Livro_Fatorial_iterativo_recursivo_2_1 {
	
	public static void main(String[] args) {
		System.out.println(iterativo(10));
		System.out.println(recursivo(10));
	}

	public static int iterativo(int n) {
		 int resultado = 1;//caso base
		 for(int i = resultado; i <= n; i++) {
			 resultado *= i;
		 }
		 return resultado;
	}
	
	public static int recursivo(int n) {
		if (n == 0 ) return 1;
		return n * recursivo(n-1);	
	}
}
