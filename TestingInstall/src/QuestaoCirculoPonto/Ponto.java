package QuestaoCirculoPonto;

public class Ponto {
	
	private int x,y;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean igual(Ponto p) {
		return this.x == p.x && this.y == p.y;
	}
	
	

}
