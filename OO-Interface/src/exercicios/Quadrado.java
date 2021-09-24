package exercicios;

public class Quadrado extends Figura2D implements DimensaoSuperficial{
	
	private int lado;

	//getters setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {	
		return lado * lado;
		//return Math.pow(lado,2);
	}
	

}
