package aulas;
import java.util.Arrays; 
import java.util.Scanner;
	
public class Web2_BuscaBinaria {

	//busca binaria
	/*
	encontrar o meio do vetor ((v[0] + v[n])/2);
	segue a busca a esq ou a dir do vetor;
	a cada busca, descarta-se metade do valor para a proxima busca;
	caso nao haja o dado no vetor, v0 > vn (quebra);
	*/

	    public static void main(String[] args) {
	    	
	        int v[] = {7,3,4,5,6,2};
	        Arrays.sort(v);//ordenando o vetor antes para atender aos requisitos de busca
	        imprimir(v);  
	        
	        //buscar um dado
	        Scanner leitor = new Scanner(System.in);
	        System.out.println("valor a buscar no vetor: ");
	        int valor = leitor.nextInt();
	        int pos = buscaBin(v, valor);
	        if (pos >= 0){
	            System.out.println("v["+ pos +"]");
	        }
	        else{
	            System.out.println("valor não encontrado");
	        }

	    }

	    public static int buscaBin(int[] v, int nBuscado){
	        int i = 0; //inicial
	        int f = v.length - 1; //final
	        int m;//meio vetor
	        while( i<= f){
	            m = ( i + f ) / 2;
	            if (v[m] == nBuscado ) {
	                return m;
	            }
	            if (nBuscado < v[m]){
	                f = m - 1;//desloca a posicao de f para o meio -1
	            }
	            else {
	                i = m + 1;//desloca a poscao de i para m+1
	            }
	        }
	        return -1;
	    }


	    public static void imprimir(int[] v){
	        for (int i = 0; i< v.length; i++){
	            System.out.println(v[i] + " ");
	        }
	        System.out.println();
	    }

	}
	
