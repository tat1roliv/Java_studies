package livro;
import java.util.Arrays;

public class insertionsort_sim1 {

	public static void main(String[] args) {
		int []a = {36, 15, 75, 2, 16, 48, 42, 51};
		int []b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int []c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		insertionSort(a);
		insertionSort(b);
		insertionSort(c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
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

}
