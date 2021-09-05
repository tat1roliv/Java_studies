
public class Ponto {
	
	//ATRIBUTOS (encapsulados)
	private int coordX;
	private int coordY;
	
	//CONSTRUTORES
	public Ponto(){
		this.coordX = 0;
		this.coordY = 0;
	}

	public void Ponto(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}

	//METODOS
	public boolean testaIgualdadePontos(Ponto ponto) {
		if ( this.coordX  == ponto.coordX && this.coordY == ponto.coordY) {
			return true;
		}
		return false;
	}
	 
	public double calculaDistanciaPontos(Ponto ponto) {
		double dist;
		int coordX = ponto.coordX;
		int coordY = ponto.coordY;
		return dist = Math.sqrt((this.coordX-coordX) * (this.coordX-coordX) + (this.coordY-coordY) * (this.coordY-coordY));	 	    
	}
	
	//getters and setters 
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

}
