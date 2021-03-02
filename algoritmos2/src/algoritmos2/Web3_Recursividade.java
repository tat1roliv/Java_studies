package algoritmos2;

public class Web3_Recursividade {
	public static int xfatorial(int n) {
		//base da recursao(parada)
		if (n==0) 
			return 1;
		else
			return n * xfatorial(n-1);
	}

}

//Fatorial => n=0 => 1; <n! = n(n-1)!>;