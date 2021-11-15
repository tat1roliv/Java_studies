package arvoreBinaria;

public class TestaArvoreBinaria {

	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.inserir(50);
		arvore.inserir(30);
		arvore.inserir(80);
		
		//ate aqui, so compara com a raiz
		
		arvore.inserir(40);
		
		System.out.println(arvore);
		
		
	}
}
