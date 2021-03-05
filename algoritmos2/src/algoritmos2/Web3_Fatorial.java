package algoritmos2;

public class Web3_Fatorial {
	public static int nfatorial(int n) {
        int fat = 1;
        for(int termo = 1; termo <= n; termo++){
            fat = fat * termo;
        }
        return fat;
    }
    
}
//Fatorial => 4! = 4*3!; 3! = 3 x 2!; <n! = n(n-1)!;
//Recursividade => permite solucionar um problema a partir de uma instância conhecida;

