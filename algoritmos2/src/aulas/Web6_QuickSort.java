package aulas;
import java.util.Arrays;

/*
 
 complexidade => n log n
 
 metodo Arrays.sort do java -> quicksort
 
 mais rapido que o merge
 
 metodo de divisao e conquista (dividir em partes menores -> 3)
 
 elementos > pivo
 elementos == pivo
 elementos < pivo
 
 elencar uma posicao do vetor para pivo(geralmente a 1a);
 jogar o pivo para o meio, atribuindo a esq para menores e a dir para maiores
 repeat ate o v.length = 1 elemento
 
 https://www.youtube.com/watch?v=8hEyhs3OV1w
 
 
  */

public class Web6_QuickSort {

	public static void main(String[] args) {
		int X[] = {29, 10, 36, 18, 83, 42, 8, 20}; 
	    sort(X, 0, X.length - 1); 
	    System.out.printf("Ordenado: %s \n", Arrays.toString(X)); 
	  }
	   
	  public static void sort(int X[], int inicio, int fim) { 
	    if (inicio < fim) {
	      int pivot = divide(X, inicio, fim); 
	      sort(X, inicio, pivot - 1); 
	      sort(X, pivot + 1, fim); 
	    } 
	  } 
	 
	   public static int divide(int X[], int inicio, int fim) { 
	    int pivot = X[inicio]; 
	    int postPivot = inicio; 
	    for (int i = inicio + 1; i <= fim; i++) { 
	      if(X[i] < pivot) { 
	        X[postPivot] = X[i]; 
	        X[i] = X[postPivot + 1]; 
	        postPivot++; 
	      } 
	    } 
	    X[postPivot] = pivot; 
	    return postPivot; 

	}

}
