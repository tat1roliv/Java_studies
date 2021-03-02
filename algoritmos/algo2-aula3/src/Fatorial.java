//Fatorial => 4! = 4*3!; 3! = 3 x 2!; <n! = n(n-1)!;

public class Fatorial {
    public static int nfatorial(int n) {
        int fat = 1;
        for(int termo = 1; termo <= n; termo++){
            fat = fat * termo;
        }
        return fat;
    }
    
}
