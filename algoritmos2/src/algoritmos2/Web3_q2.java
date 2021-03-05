package algoritmos2;

public class Web3_q2 {
	

		public static void imprimirBinario(int x) {
			if (x==0) {
				System.out.print("0");
				return; 
			}
			imprimirBinario(x / 2);
			System.out.print("%d", x % 2);
			
		}
	
}

/*
caso base => x=0 (quando o nuemro ja foi transformado em binario ==);
passo da recursao => saber como x/2 é convertido. Depois, adiciona um digito (0 ou 1) relativo a x

*/

//implementar uma funcao recursiva que receba como parametro um numero natural 
//e apresente o seu correspondente binario

