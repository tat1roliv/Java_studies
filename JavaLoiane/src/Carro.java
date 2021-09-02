//aulas24 25 26 27
public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	

	//construtores
	Carro() {
		System.out.println("a classe carro foi instanciada...");
		numPassageiros = 4;
		
	}
	
	Carro (String marca_, String modelo_, double capCombustivel_, int numPassageiros_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;

	}
	
	
	//metodos
	void exibirAutonomia() {
		System.out.println("A autonomia do carro modelo " + modelo + " é de " + capCombustivel * consumoCombustivel + " km");
		
	}
	
	double ObterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	//parametro info que nao tem na classe
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		return qtdCombustivel;
	}
	

	
	
	
}
