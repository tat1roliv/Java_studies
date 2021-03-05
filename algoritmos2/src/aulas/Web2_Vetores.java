package aulas;
import java.util.Scanner;

public class Web2_Vetores {
	public static void main(String[] args) {
        //declarar e criar o vetor
        //int v[] = new int[6];
        int v[] = {7,4,5,6,2,9};
        //ler dados do vetor (input)
        lerVetor(v);   
        //imprimir
        imprimir(v);
        //buscar um dado
        Scanner leitor = new Scanner(System.in);
        System.out.println("valor a buscar no vetor: ");
        int valor = leitor.nextInt();
        int pos = buscaSequencial(v, valor);
        if (pos >= 0){
            System.out.println("v["+pos+"]");
        }
        else{
            System.out.println("valor n�o encontrado");
        }

    }  


//busca sequencial
/*
opcao frequente para vetores nao ordenados;
baixa eficiencia;
*/
public static int buscaSequencial (int[] v, int valorBuscado) {
    for ( int i = 0; i < v.length; i++){
        if (v[i] == valorBuscado){
            return i;
        }   
    }
    return -1;
}

//busca binaria
/*
+ eficiente;
restri��o -> vetor precisa estar ordenado;
*/


//funcao
    public static void lerVetor(int[] vet){
        //ler dados do vetor (input)
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++){
        System.out.print("V["+i+"]: ");
        vet[i] = leitor.nextInt();
        }
    }

    public static void imprimir(int[] vet){
        //imprimir
        for (int i = 0; i < vet.length; i++) {
        System.out.print(vet[i] + " ");
        }
        System.out.println();
    }

}



