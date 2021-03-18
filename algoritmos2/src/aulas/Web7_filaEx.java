package aulas;

public class Web7_filaEx {

	public static void main(String[] args) {
		Fila f = new Fila(3); //class
	    System.out.printf("Fila atual: %s.\n", f.toString()); 
	    try {
	      f.enfileira(29);
	      System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 29);
	      f.enfileira(10);
	      System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 10);
	      f.enfileira(83);
	      System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 83);
	      f.enfileira(36);
	      System.out.printf("Fila %s <= %s enfileirado.\n", f.toString(), 36);
	    } catch (Exception e) {
	      System.err.println(e.getMessage());
	    }
	    System.out.printf("Fila atual: %s.\n", f.toString());
	    try {
	      System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
	      System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
	      System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
	      System.out.printf("Desenfileirando %d <= fila %s.\n", f.desenfileira(), f.toString()); 
	    } catch (Exception e) {
	      System.err.println(e.getMessage());
	    }
	  }
	
	
}
