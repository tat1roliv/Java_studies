package aulas;
import java.util.Arrays;

/*
BubbleSort
compara pares de elementos subjacentes (elemento da esquerda com o seguinte, se maior, troca;
"borbulhando", joga os maiores elementos para as posicoes finais do vetor

https://www.youtube.com/watch?v=Cq7SMsQBEUw

o(n)² -> classe de complexidade

*/


public class Web4_BubbleSort {


	    public static void main(String[] args) {

	        int[] v= { 32, 17, 51, 8, 23 };

	        System.out.printf("inicio -> %s \n", Arrays.toString(v));

	        bubble(v);

	        System.out.printf("fim -> %s \n", Arrays.toString(v));

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
	            System.out.printf("passagem %d -> %s \n",
	                i, Arrays.toString(v));
	        }
	    }    
	
	
}
