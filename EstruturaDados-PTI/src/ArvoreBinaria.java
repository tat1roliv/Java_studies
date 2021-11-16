public class ArvoreBinaria {

	private No raiz;
	private int calculaNoEsquerda;

	public ArvoreBinaria() {
		this.raiz = null;
		this.calculaNoEsquerda = 0;
	}

	public void adicionaNovoNo(long id) {

		No novoNo = new No(id);

		if (this.raiz == null) {
			this.raiz = novoNo;
			return;

		} else {

			No atual = this.raiz;

			while (true) {
				if (novoNo.getValor() < atual.getValor()) {
					if (atual.getEsq() != null) {
						atual = atual.getEsq();
					} else {
						atual.setEsq(novoNo);
						break;
					}
				} else if (novoNo.getValor() > atual.getValor()) {

					if (atual.getDir() != null) {
						atual = atual.getDir();
					} else {
						atual.setDir(novoNo);
						break;
					}

				}
			}

		}

	}

	public int contaNosDaEsquerdaFestiva() {
		contaNosDaEsquerdaFestiva(this.raiz);
		return calculaNoEsquerda;
	}

	private void contaNosDaEsquerdaFestiva(No n) {
		if (n != null) {
			if (n.getEsq() != null) {
				calculaNoEsquerda++;
			}

			contaNosDaEsquerdaFestiva(n.getEsq());
			contaNosDaEsquerdaFestiva(n.getDir());
		}
	}

	public void imprimeArvore() {
		imprimeArvore(this.raiz, "");
	}
	
	public void imprimeArvore(No n, String espaco) {
		if(n != null) {
			System.out.println(espaco + n.getValor());
			imprimeArvore(n.getEsq(), espaco + "   ");
			imprimeArvore(n.getDir(), espaco + "   ");
			
		} else {
			System.out.println(espaco + "-");
		}
		
	}
	
	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public int getCalculaNoEsquerda() {
		return calculaNoEsquerda;
	}

	public void setCalculaNoEsquerda(int calculaNoEsquerda) {
		this.calculaNoEsquerda = calculaNoEsquerda;
	}

}