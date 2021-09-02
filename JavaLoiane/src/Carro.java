//aulas24 25 26 27
public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	

	//construtores
	//boa pratica => quando criar construtores, criar tambem o vazio
	public Carro() {
		
	}
	
	public Carro (String marca, String modelo, double capCombustivel, int numPassageiros, double consumoCombustivel){
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;

	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parâmetros");
	}
	
	public Carro(String marca, String modelo) {
		this(marca,modelo, 10);
		System.out.println("Chamando construtor com 2 parâmetros");
	}

	//metodos
	void exibirAutonomia() {
		System.out.println("A autonomia do carro modelo " + this.modelo + " é de " + this.capCombustivel * this.consumoCombustivel + " km");
		
	}
	
	double ObterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//parametro info que nao tem na classe
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		return qtdCombustivel;
	}
	

	
	
	
}
