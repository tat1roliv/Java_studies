package aulas;

public class Web3_BuscaBinariaIterativa {
	
/*
	public static int buscaBinariaIterativa(int []v, int x) {
	//vetor deve estar em ordem crescente
		
		int i;
		int m;
		int f;
		
		i = 0;
		f = v.length - 1;
		
		while (i <= f) {
			
			m = (i + f) / 2;
			
			if (v[m] == x) {
				return m;
			}
			if (x < v[m]) {
				f = m-1;
			}
			else (x > v[m]) {
				i = m+1;
			}
			return -1;
		}
	}
*/
	public static void main(String[] args) {
		int []v = {3,7,8,11,14,18,21,25};
		int p = busca(9,v,0, v.length - 1);//valor buscado = 9; return -1(nao encontrado)
		System.out.println("posicao: " + p);
	}
	
	public static int busca(int nBuscado, int []v, int i, int f) {
		if (i > f) {
			return -1;
		}
		int m = (i+f) / 2;
		if (v[m] == nBuscado) {
			return m;
		}
		if (nBuscado < v[m]) {
			return busca(nBuscado,v,i, m-1);
		}
		else {
			return busca(nBuscado,v,m+1,f);
		}
	}
	
	
}
