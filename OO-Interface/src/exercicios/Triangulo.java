package exercicios;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	
	private double base;
	private double altura;
	
	//getters setters
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	
	
	

}
