package algoritmos2;

public class Web3_q1 {

/*
 Potencia
 
pot(n) = 1 se n=0;
pot(n) = a.a(elv a n-1)  se n>0;
 */
	
	public static void main(String[] args) {
		int p = potencia(9,2);
		System.out.println("Potencia = " + p);
	}
	public static int potencia(int a, int n) {
		if (n==0) {
			return 1;
		}
		return a * potencia(a, n-1);
	}
}

//implementar funcao recursiva para calcular a potencia an, supondo que tanto a quanto n sejam inteiros e positivos
