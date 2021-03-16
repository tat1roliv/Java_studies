package algoritmos2;
import java.util.Scanner;

public class Web3_q2 {
	
		public static void main(String[] args) {
			imprimirBinario(99);
		}

		public static void imprimirBinario(int n) {
			if (n < 2) {
				System.out.print(n);
			}
			else {
				imprimirBinario(n / 2);
				System.out.print(n % 2);
			}

			
		}
	
}

/*
caso base => quociente=0 
passo da recursao => saber como x/2 é convertido. Depois, adiciona um digito (0 ou 1) relativo a x

*/

//implementar uma funcao recursiva que receba como parametro um numero natural 
//e apresente o seu correspondente binario

