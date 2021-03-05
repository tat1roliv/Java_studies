package aulas;
import java.util.Scanner;

public class Web2_BuscaSequencial {

	  public static void main(String[] args) {
	    
	    int v[] = {7, 3, 4, 5, 6, 2};// declarar e criar um vetor
	    
	    imprimir(v);// apresenta os dados do vetor
	    
	    Scanner leitor = new Scanner(System.in);// buscar um dado
	    System.out.print("Valor: ");
	    int valor = leitor.nextInt();
	    int pos = buscaSequencial(v, valor);
	    if (pos >= 0) {
	      System.out.println("Valor encontrado na posição " + pos);
	    }
	    else {
	      System.out.println("Valor não encontrado.");
	    }
	  }

	  //funcao buscaSequencial
	  public static int buscaSequencial(int[] v, int x) {
	    for (int i = 0; i < v.length; i++) {
	      if (v[i] == x) {
	        return i;
	      }
	    }
	    return -1;
	  }
	  
	  //funcao ler vetor
	  public static void lerVetor(int[] vet) {
	    Scanner leitor = new Scanner(System.in);
	    for (int i = 0; i < vet.length; i++) {
	      System.out.print("V[" + i + "]: ");
	      vet[i] = leitor.nextInt();
	    }
	  }
	  
	  //funcao imprimir
	  public static void imprimir(int[] v) {
	    for (int i = 0; i < v.length; i++) {
	      System.out.print(v[i] + " ");
	    }
	    System.out.println();
	  }
	}
	

