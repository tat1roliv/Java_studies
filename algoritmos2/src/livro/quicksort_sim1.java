package livro;

import java.util.Arrays;

public class quicksort_sim1 {

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
