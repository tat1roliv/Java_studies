package algoritmos2;
import java.util.Scanner;

public class Web3_q3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("digite a: ");
		int a = leitor.nextInt();
		System.out.println("digite b: ");
		int b = leitor.nextInt();
		int prod = produto(a,b);
		System.out.println("Produto: " + prod);
	
		
	}

	public static int produto(int x, int y) {
		if(y==1) {
			return x;
		}
		return produto(x, y-1) + x;
		
	}

}


//escreva uma funcao recursiva que calcula o produto a*b;
//em que a e b sao inteiros e maior que 0;
//a*b = a se b=1
//a*b=a*(b-1)+a se b>1