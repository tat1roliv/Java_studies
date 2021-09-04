
public class Fatorial {
	
	//metodo nao recursivo
	public static int fatorialNaoRecursivo(int num) {
		int total = 1;
		
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}
	
	//metodo recursivo
	
	//fatorial(3) = 3 * fatorial(2);
	//fatorial(2) = 2 * fatorial(1);
	//fatorial(1) = 1 * fatorial(0);
	//fatorial(0) = 1 ;
	
	public static int fatorialRecursivo(int num) {
		
		if(num == 0) {
			return 1;//ponto de parada
		}
		
		return num * fatorialRecursivo(num-1);//recursividade
	}
	
	public static void main(String[] args) {
		System.out.println(fatorialRecursivo(5));
		System.out.println(fatorialNaoRecursivo(5));
	}

}
