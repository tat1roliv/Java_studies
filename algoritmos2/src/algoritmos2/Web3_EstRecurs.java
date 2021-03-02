package algoritmos2;

public class Web3_EstRecurs {
	public static void main(String[] args) {
		int fat = fatorial(4);
		System.out.println(fat);
	}
	
	public static int fatorial (int n) {
		if (n == 0 ) {
			return 1;
		}
		int f = fatorial(n-1);
		int res = n*f;
		return res;
	}
}
