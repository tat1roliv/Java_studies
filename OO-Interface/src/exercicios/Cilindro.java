package exercicios;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	
	private int altura;
	private double raio;	
	
	//getters and setters
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularVolume() {		
		return Math.PI * (raio * raio) * altura;
	}
	
	@Override
	public double calcularArea() {	
		
		double areaBase = ( raio * raio ) * Math.PI;
		double areaLateral = 2 * Math.PI * raio * altura;
		
		double areaTotal = ( 2 * areaBase ) + areaLateral;
		
		return areaTotal;
	}
	
	
	
	

}
