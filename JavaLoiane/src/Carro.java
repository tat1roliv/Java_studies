//aulas24 25 26 27
public class Carro {
	
	//atributos
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
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
