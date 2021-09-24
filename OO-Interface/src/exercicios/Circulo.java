package exercicios;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	
	private double raio;

	//getters setters
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {		
		return ( raio * raio ) * Math.PI;
		
		//return Math.pow(raio,2) * Math.PI ;
	}
	
	
	
 
}
