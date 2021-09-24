package exercicios;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	
	private int lado;

	//getters setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {	
		return Math.pow(lado, 3);
	}

	@Override
	public double calcularArea() {	
		return 6 * (lado * lado);
	}
	
	

}
