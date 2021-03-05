package aulas;

public class Web3_Fibonacci {

/*
 Fibonacci (árvore binária) 
 
 {0,1,1,2,3,5,8,13,21,...}
 
 fib(n) = 0 se n=0;
 fib(1) = 1 se n=1;
 fib(n) = fib(n-1) + fib(n-2)  se n>1;
 
 */
	public static void main(String[] args) {
	
		int f = Fibonacci(7);//return 13
		System.out.print(f);

	}
	
	public static int Fibonacci(int n) {
		if (n==0 || n==1) {
			return n;			
		}
		return Fibonacci(n-1) + Fibonacci(n-2);
	}

}
