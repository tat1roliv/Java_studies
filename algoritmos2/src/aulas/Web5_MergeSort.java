package aulas;
import java.util.Arrays;
/*
 https://www.youtube.com/watch?v=ZRPoEKHXTJg
 
 estrategia recursiva de divisao e conquista
 
 complexidade => n log n
 
 metodo de divisao e conquista (dividir em partes menores -> )
 
 divide o vetor ao meio
 identifica inicio, meio e fim do vetor
 
 */
public class Web5_MergeSort {

	  public static void main(String[] args) {
	    int X[] = { 31, 10, 29, 42, 51, 19, 83, 7 };
	    sort(X, 0, X.length - 1);
	    System.out.printf("Ordenado: %s \n", Arrays.toString(X));
	  }

	  public static void sort(int X[], int inicio, int fim) {
	    if (inicio < fim) {
	      int meio = (inicio + fim) / 2;
	      sort(X, inicio, meio);
	      sort(X, meio + 1, fim);
	      merge(X, inicio, meio, fim);
	    }
	  }

	  public static void merge(int X[], int inicio, int meio, int fim) {
	    int i, esquerda, direita;
	    int aux[] = new int[X.length];
	    for (i = inicio; i <= fim; i++) {
	      aux[i] = X[i];
	    }
	    esquerda = inicio;
	    direita = meio + 1;
	    i = inicio;
	    while (esquerda <= meio && direita <= fim) {
	      if (aux[esquerda] <= aux[direita])
	        X[i++] = aux[esquerda++];
	      else
	        X[i++] = aux[direita++];
	    }
	    while (esquerda <= meio)
	      X[i++] = aux[esquerda++];
	    while (direita <= fim)
	      X[i++] = aux[direita++];
	  }
	}