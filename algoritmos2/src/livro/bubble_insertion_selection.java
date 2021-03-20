package livro;

import java.util.Arrays;

public class bubble_insertion_selection {

	public static void main(String[] args) {
		int []a = {36, 15, 75, 2, 16, 48, 42, 51};
		int []b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int []c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		long tempoInicial = System.nanoTime();
		bubble(a);
		long tempoFinal = System.nanoTime();
		
		System.out.printf("A ordenação do vetor A demorou %d nano segundos. \n", tempoFinal - tempoInicial);
		
		long tempInicial = System.nanoTime();
		bubble(b);
		long tempFinal = System.nanoTime();
		
		System.out.printf("A ordenação do vetor B demorou %d nano segundos. \n", tempFinal - tempInicial);
	
		long temInicial = System.nanoTime();
		bubble(c);
		long temFinal = System.nanoTime();
		
		System.out.printf("A ordenação do vetor B demorou %d nano segundos. \n", temFinal - temInicial);

	}
	
	
	
	 public static void bubble(int[] v) {
	        for (int i=0; i < v.length; i++){
	            for (int j=0; j < v.length - 1; j++){
	                if (v[j] > v[j + 1]){
	                    int aux = v[j];
	                    v[j] = v[j+1];
	                    v[j+1] = aux;
	                }
	            }
	            //%d = i
	            //%s = return da funcao arraystostring
	            //n <br>
	            //System.out.printf("passagem %d -> %s \n",
	               // i, Arrays.toString(v));
	        }
	    } 
	 
	 public static void insertionSort(int []v) {
			for (int i = 1; i < v.length; i++ ) { //start com i=1
				int x = v[i];
				for (int j = i-1 ; j >= 0 && v[j] > x ; j--) {
					v[j+1] = v[j];
					v[j] = x;
				}
				//System.out.printf("Iteração do  número %d -> %s \n ", x, Arrays.toString(v));
			}
		}
	 
	 public static void selectionSort (int[] v){
	        for ( int i = 0; i < v.length ; i++ ){
	            //busca o indice que contem o menor elemento
	            int sindex = i;//armazena menor elem vetor
	            for (int j = i + 1; j < v.length; j++ ){
	                if (v[j] < v[sindex])
	                sindex = j;
	            } 
	            //troca
	            int aux = v[i];
	            v[i] = v[sindex];
	            v[sindex] = aux;
	        }

	    }

	

}
