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
		System.out.println("Letra A: n�mero de n�s esquerda festiva na �rvore desenhada abaixo: " + arvore.NumeroNosEsquerdaFestiva());
		System.out.println("Letra B: �rvore hierarquizada");
		arvore.DesenhoArvoreHierarquizada2();

	}

}
