package algoritmos2;
import java.util.Scanner;

public class R4Java_Q4 {
	
	static int retornaX(int x) {
		int res;
		if (x < -1) {
			res = Math.abs(x+2);
		}
		else if(x <= 2) {
			res = ((int)Math.pow(x, 2) - 4;
		}
		else {
			res = 2 * x - 1;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Valor de X: ");
		int x = leitor.nextInt();
		int res = retornaX(x);
		System.out.println("Resultado = " + res);
		
	}

}
