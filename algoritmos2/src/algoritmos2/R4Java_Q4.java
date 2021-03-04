package algoritmos2;
import java.util.Scanner;

public class R4Java_Q4 {
	
	static int retornaX(int valorX) {
		int res;
		if (valorX < -1) {
			res = Math.abs( valorX + 2);
		}
		else if(valorX <= 2) {
			res = ((int)Math.pow(valorX, 2) - 4);
		}
		else {
			res = 2 * valorX - 1;
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
