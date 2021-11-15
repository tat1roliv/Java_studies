package testesArvoreBinaria;

public class TestaArvoreBinaria {

	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
		
		arvore.inserir(555);
		arvore.inserir(333);
		arvore.inserir(888);
		arvore.inserir(111);
		arvore.inserir(444);
		arvore.inserir(999);
		System.out.println("Letra A: número de nós esquerda festiva na árvore desenhada abaixo: " + arvore.NumeroNosEsquerdaFestiva());
		System.out.println("Letra B: árvore hierarquizada");
		arvore.DesenhoArvoreHierarquizada2();

	}

}
