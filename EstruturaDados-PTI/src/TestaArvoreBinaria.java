public class TestaArvoreBinaria {
	public static void main(String[] args) {
		
		ArvoreBinaria binaryTree = new ArvoreBinaria();
		
		binaryTree.adicionaNovoNo(555);
		binaryTree.adicionaNovoNo(333);
		binaryTree.adicionaNovoNo(888);
		binaryTree.adicionaNovoNo(111);
		binaryTree.adicionaNovoNo(444);
		binaryTree.adicionaNovoNo(999);
		binaryTree.adicionaNovoNo(100);
		binaryTree.adicionaNovoNo(334);
		System.out.println("PTI ESTRUTURA DE DADOS\n");
		System.out.println("Letra A: Nós a esquerda da arvore abaixo: " + binaryTree.contaNosDaEsquerdaFestiva());
		System.out.println("Letra B:  ");
		binaryTree.imprimeArvore();
		

	}
}
