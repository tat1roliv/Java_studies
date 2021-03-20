package livro;

import java.util.Arrays;

public class selectionsort_sim1 {

	public static void main(String[] args) {
		int []a = {36, 15, 75, 2, 16, 48, 42, 51};
		int []b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int []c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		selectionSort (a);
		selectionSort (b);
		selectionSort (c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
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
