
public class TestePonto {
	
	public static void txtEntradaPrograma() {
		System.out.println("       P R O G R A M A 	    ");
		System.out.println("************  PTI  *************");
		System.out.println("Programa��o Orientada a Objetos\n");
		//System.out.println("________________________________\n");
	}

	public static void main(String[] args) {
				
		txtEntradaPrograma();
		
		Ponto pontoTeste1 = new Ponto();
		pontoTeste1.setCoordX(1);
		pontoTeste1.setCoordY(5);
		System.out.println("Ponto 1, Coordenada x: " + pontoTeste1.getCoordX() + "\nPonto 1, Coordenada y: " + pontoTeste1.getCoordY());
		
		Ponto pontoTeste2 = new Ponto();
		pontoTeste2.Ponto(1,2);
		System.out.println("Ponto 2, Coordenada x: " + pontoTeste2.getCoordX() + "\nPonto 2, Coordenada y: " + pontoTeste2.getCoordY());
		
		if (pontoTeste1.testaIgualdadePontos(pontoTeste1, pontoTeste2)) {		
			System.out.println("Os pontos informados s�o iguais");
		}else {
			System.out.println("Os pontos informados N�O s�o iguais");
		}	
		
		System.out.println("Dist�ncia entre os pontos: " + pontoTeste1.calculaDistanciaPontos(pontoTeste2));
		
	}

}
