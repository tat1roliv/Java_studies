/*
SelectionSort
busca o menor elemento -> posição 0;
repete procedimento -> pos 1;
repete -> ...n

o(n)² (for + for -> mesma classe de complexidade)

https://www.youtube.com/watch?v=92BfuxHn2XE

*/

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] v= { 32, 17, 51, 8, 23 }; //4 fases de ordenacao p  array deste tam (5-1)

        System.out.printf("inicio -> %s \n", Arrays.toString(v));

        selectionSo(v);

        System.out.printf("fim -> %s \n", Arrays.toString(v));

    }

    public static void selectionSo (int[] v){
        for ( int i = 0; i < v.length ; i++ ){
            //busca o indice que contem o menor elemento
            int sindex = i;
            for (int j = i + 1; j < v.length; j++ ){
                if (v[j] < v[sindex])
                sindex = j;
            } 
            int aux = v[i];
            v[i] = v[sindex];
            v[sindex] = aux;
        }

    }

}