package aulas;
import java.util.Arrays;

/*
 
 https://www.youtube.com/watch?v=92BfuxHn2XE
 
o(n)² -> classe de complexidade
 
 
 */

public class Web4_InsertionSort {

	public static void main(String[] args) {
		 int[] v= { 32, 17, 51, 8, 23 }; 

	        System.out.printf("inicio -> %s \n", Arrays.toString(v));

	        insertionSort(v);

	        System.out.printf("fim -> %s \n", Arrays.toString(v));

	}
	
	public static void insertionSort(int []v) {
		for (int i = 1; i < v.length; i++ ) { //start com i=1
			int x = v[i];
			for (int j = i-1 ; j >= 0 && v[j] > x ; j--) {
				v[j+1] = v[j];
				v[j] = x;
			}
			System.out.printf("Iteração do  número %d -> %s \n ", x, Arrays.toString(v));
		}
	}
	
	

}
