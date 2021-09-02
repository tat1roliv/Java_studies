
public class Carro {
	
	//atributos
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	

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
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro modelo " + this.modelo + " é de " + this.capCombustivel * this.consumoCombustivel + " km");
		
	}
	
	public double ObterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//parametro info que nao tem na classe	
	private double divideKmPorConsumoCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel (double km) {

		return this.divideKmPorConsumoCombustivel(km);
		
	}
	//

	//getters && setters
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return this.numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	
	
	
}
