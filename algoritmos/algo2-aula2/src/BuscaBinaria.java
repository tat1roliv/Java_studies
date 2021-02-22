import java.util.Arrays; //metodo java

//busca binaria
/*
encontrar o meio do vetor ((v[0] + v[n])/2);
segue a busca a esq ou a dir do vetor;
a cada busca, descarta-se metade do valor para a proxima busca;
caso nao haja o dado no vetor, v0 > vn (quebra);
*/

public class BuscaBinaria {
    public static void main(String[] args) {
        int v[] = {7,3,4,5,6,2};
        Arrays.sort(v);
        imprimir(v);  
    }

    public static int buscaBin(int[] v, int nBuscado){
        int i = 0;
        int f = n;
    }


    public static void imprimir(int[] v){
        for (int i = 0; i< v.length; i++){
            System.out.println(v[i] + " ");
        }
        System.out.println();
    }

}