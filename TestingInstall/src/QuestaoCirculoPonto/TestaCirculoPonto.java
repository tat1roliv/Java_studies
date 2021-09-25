package QuestaoCirculoPonto;

public class TestaCirculoPonto {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(1,2);
		Ponto p2 = new Ponto (3,4);
		Ponto p3 = new Ponto(3,4);
		
		System.out.println(p1.igual(p2));
		System.out.println(p3.igual(p2));
		
		Circulo c1 = new Circulo(1,2, 1);
		Circulo c2 = new Circulo(3,4, 1);
		Circulo c3 = new Circulo(3,4, 1);

		System.out.println(c1.igual(c2));
		System.out.println(c3.igual(c2));
	}

}
