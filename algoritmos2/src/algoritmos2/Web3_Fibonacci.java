package algoritmos2;

public class Web3_Fibonacci {
	
	public static void main(String[] args) {
		int fat = fib(7); //return v[7]=>13 {0,1,1,2,3,5,8,13}
		System.out.println(fat);
	}
	
	public static int fib(int n) {
		if (n ==0 || n==1) {
			return n;
		}
		return fib(n-1)+ fib(n -2);
		
	}
}

// 0; para n = 0
// 1; para n = 1
//Fib(n) = Fib(n-1) + Fib(n-2); para n > 1