
public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro fusca = new Carro();
		fusca.marca = "Volks";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 5;
		fusca.capCombustivel = 50;
		fusca.consumoCombustivel = 0.5;
		
		
		//autonomia
		van.exibirAutonomia();
		fusca.exibirAutonomia();
		
		//obterautonomia
		double autonomiaVan = van.ObterAutonomia();
		System.out.println("Autonomia van: " + autonomiaVan);
		
		//km combustivel
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel16 = van.calcularCombustivel(16);
		System.out.println(qtdCombustivel10);
		System.out.println(qtdCombustivel16);
	
		
		

	}

}
