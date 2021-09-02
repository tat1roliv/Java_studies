
public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		van.setNumPassageiros(10);
		van.setCapCombustivel(100);
		van.setConsumoCombustivel(0.2);
		
		Carro fusca = new Carro();
		fusca.setMarca("Volks");
		fusca.setModelo("Fusca");
		fusca.setNumPassageiros(5);
		fusca.setCapCombustivel(50);
		fusca.setConsumoCombustivel(0.5);
		
		
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
