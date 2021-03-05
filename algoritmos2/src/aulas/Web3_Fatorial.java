package aulas;
import java.util.Scanner;

public class Web3_Fatorial{

/*
 Recorrencia do fatorial
 n! = 1 se n=0;
 n! = n*(n-1) se n>0;
 */
	
/*
 	public static int nFatorial(int n) {
		int fat = 1;
		for (int i=0; i<=n; i++) {
			fat = fat * i;
		}
		return fat;
	}
 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Calcular fatorial do número: ");
		int xDigitado = leitor.nextInt();
		int res = nFatorial(xDigitado);
		System.out.print(res);
	}


	public static int nFatorial(int xDigitado) {
		if(xDigitado==0) {
			return 1;
		}
		int f = nFatorial(xDigitado-1);
		int resultado = xDigitado * f;
		return resultado;
	}
		
	
}