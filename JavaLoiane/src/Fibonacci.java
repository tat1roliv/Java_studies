
public class Fibonacci {

	public static int fib(int n) {
		
		if(n < 2) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		
		//System.out.println(fib(3));
		
		for (int i = 1 ; i < 20 ; i++) {
			System.out.println(fib(i) + " ");
		}
	}
	
}
