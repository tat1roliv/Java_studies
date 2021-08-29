
public class Fracao {
	
	//atributos
	int numerador;
	int denominador;
	
	//metodos
	
	//polimorfismo estatico
	public double somaFracao( int a, int b, int c, int d ) {
		return ( (a * d + c * b) / (b * d) );
	}
	
	//polimorfismo estatico
	public double somaFracao( int a, int b, int c ) {
		return ( (a  + c * b) / b );
		
	}
	
	public double multiplicacaoFracao( int a, int b, int c, int d ) {
		return ( (a * c ) / (b * d) );
	}
	
	public double divisaoFracao( int a, int b, int c, int d ) {
		return ( (a * d ) / (b * c) );
	}
	
	public boolean testaIgualdade( int a, int b, int c, int d ) {
		if ( (a / b) == (c / d)) {
			return a*d == b*c;
		}
		return false;
	}
	
	
	
	}