/*
BubbleSort
compara pares de elementos subjacentes (elemento da esquerda com o seguinte, se maior, troca;
"borbulhando", joga os maiores elementos para as posicoes finais do vetor

https://www.youtube.com/watch?v=Cq7SMsQBEUw


*/

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] vetorBubble = { 32, 17, 51, 8, 23 };
        System.out.printf("inicio -> %s \n", Arrays.toString(vetorBubble));
        bubble(vetorBubble);
        System.out.printf("fim -> %s \n", Arrays.toString(vetorBubble));

    }
        
    public static void bubble(int[] v) {
        for (int i=0; i<v.length; i++){
            for (int j=0; j< v.length - 1; j++){
                if (v[j] > v[j + 1]){
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
            System.out.printf("passagem -> %s \n",
                i, Arrays.toString(v));
        }
    }    
}