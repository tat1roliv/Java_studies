package QuestaoCirculoPonto;

public class Circulo extends Ponto{
	
	private float raio;

	public Circulo(int x, int y, float raio) {
		super(x, y);
		this.raio = raio;
	}
	
	public boolean igual(Circulo c) {
		return super.igual(c) && this.raio == c.raio;
	}

}
