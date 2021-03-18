package aulas;
import java.util.Arrays;

/*
fila (queue)-> estrutura de dados que armazena elementos de forma sequencial;
FIFO -> first in first out;
nao È permitido acesso aleatorio a nenhum item especifico;
sempre o que È retirado esta na estrutura a mais tempo;

uso -> impressora; atendimento de processos do SO; buffer para gravaÁ„o de dados na midia; processos de comunicaÁ„o de redes;

manipulacao de filas
isEmpty -> return boolean;
length
front -> elem posicao frontal da fila (so consulta);
enqueue -> insere um elemento ao final da fila (recebe como parametro o elemento a entrar na fila);
dequeue -> remove e retorna o elemento que esta no inicio da fila;

 */

public class Web7_Fila {

	// atributos
	  private int[] dados; 
	  private int capacidade; 
	  private int fim;

	  // construtor
	  public Fila (int capacidade) {
	    this.capacidade = capacidade;
	    this.dados = new int[this.capacidade];
	    this.fim = 0;
	  } 

	  // metodos
	  public int primeiro() {
	    return this.dados[0];
	  }

	  public boolean ehVazia() {
	    return this.fim == 0;
	  }

	  public int tamanho() {
	    return this.fim;
	  }

	  public void enfileira(int numero) {
	    if ((this.fim + 1) > this.capacidade) {
	      throw new RuntimeException("A fila est√° com a capacidade m√°xima.");
	    }
	    this.dados[this.fim] = numero;
	    this.fim++;
	  }

	  public int desenfileira() {
	    if (ehVazia()) {
	      throw new RuntimeException("A fila est√° vazia."); 
	    }
	    int numero = this.dados[0]; 
	    for(int i = 0; i < this.fim - 1; i++) {
	      this.dados[i] = this.dados[i + 1]; 
	    } 
	    this.fim--; 
	    return numero; 
	  }  

	  public String toString() {
	    String s = "[";
	    for (int i = 0; i < fim; i++) {
	      s += dados[i];
	      if (i + 1 < fim) {
	        s += ", ";
	      }
	    }
	    s += "]";
	    return s;
	  }

}
