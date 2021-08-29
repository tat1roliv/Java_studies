
public class Fracao {
//fracao => expressa a razao entre dois numeros inteiros;
	
	//atributos
	private int numerador;
	private int denominador;
	
	//construtores
	
	//construtor fracao com parametro
	public Fracao(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//construtor fracao sem parametro
	public Fracao() {
		this.numerador = 1;
		this.denominador = 1;
	}
	
		
	//metodos
	
	//toString => c/ polimorfismo dinamico/sobrescrita
	public String toString() {
		return this.numerador+"/"+this.denominador;
	}
	
	//operacoes
	public Fracao somaFracao(Fracao f) {//polimorfismo estatico
		
		Fracao fracaoResultanteSoma = new Fracao();
		
		fracaoResultanteSoma.numerador = (this.numerador * f.denominador + this.denominador * f.numerador) ;
		fracaoResultanteSoma.denominador = (this.denominador * f.denominador) ;
		
		return fracaoResultanteSoma; 
	}
	
	public Fracao somaFracao( int inteiro ) {//polimorfismo estatico
		
		Fracao fracaoResultanteSoma = new Fracao();
		
		fracaoResultanteSoma.numerador = this.numerador  +  inteiro * this.denominador;
		fracaoResultanteSoma.denominador = (this.denominador) ;
		return fracaoResultanteSoma;
		
	}
	
	public Fracao multiplicacaoFracao( Fracao f ) {
		
		Fracao fracaoResultanteMulti = new Fracao();
		
		fracaoResultanteMulti.numerador = this.numerador * f.numerador;
		fracaoResultanteMulti.denominador = this.denominador * f.denominador ;
		return fracaoResultanteMulti;
			
	}
	
	public Fracao divisaoFracao( Fracao f ) {
		
		Fracao fracaoResultanteDivisao = new Fracao();
		
		fracaoResultanteDivisao.numerador = this.numerador * f.denominador;
		fracaoResultanteDivisao.denominador = this.denominador * f.numerador ;
		return fracaoResultanteDivisao;

	}
	
	public boolean testaIgualdade( Fracao f) {
		if ( (this.numerador * f.denominador == this.denominador * f.numerador) ) {
			return true;
		}
		return false;
	}
	
	
	//getters and setters
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

}
