package livro;
import java.util.Arrays;

public class mergesort_sim1 {

	public static void main(String[] args) {
		int []a = {36, 15, 75, 2, 16, 48, 42, 51};
		int []b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int []c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
					
	    sort(a, 0, a.length - 1);
	    System.out.printf("Ordenado: %s \n", Arrays.toString(a));
	    
	    sort(b, 0, b.length - 1);
	    System.out.printf("Ordenado: %s \n", Arrays.toString(b));
	    
	    sort(c, 0, c.length - 1);
	    System.out.printf("Ordenado: %s \n", Arrays.toString(c));
	    
	  }

	  public static void sort(int X[], int inicio, int fim) {
	    if (inicio < fim) {
	      int meio = (inicio + fim) / 2;
	      sort(X, inicio, meio);
	      sort(X, meio + 1, fim);
	      merge(X, inicio, meio, fim);
	    }
	  }

	  public static void merge(int X[], int inicio, int meio, int fim) {
	    int i, esquerda, direita;
	    int aux[] = new int[X.length];
	    for (i = inicio; i <= fim; i++) {
	      aux[i] = X[i];
	    }
	    esquerda = inicio;
	    direita = meio + 1;
	    i = inicio;
	    while (esquerda <= meio && direita <= fim) {
	      if (aux[esquerda] <= aux[direita])
	        X[i++] = aux[esquerda++];
	      else
	        X[i++] = aux[direita++];
	    }
	    while (esquerda <= meio)
	      X[i++] = aux[esquerda++];
	    while (direita <= fim)
	      X[i++] = aux[direita++];
	  }
	
}
