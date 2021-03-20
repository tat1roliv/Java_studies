package livro;
import java.util.Arrays;

public class bubblesort_sim1 {

	public static void main(String[] args) {
		int []a = {36, 15, 75, 2, 16, 48, 42, 51};
		int []b = {13, 45, 38, 20, 23, 7, 6, 5, 10, 11};
		int []c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		bubble(a);
		bubble(b);
		bubble(c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
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

}
