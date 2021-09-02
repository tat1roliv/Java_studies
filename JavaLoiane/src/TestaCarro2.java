
public class TestaCarro2 {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Ducato");
		//van.numPassageiros = 10;
		van.setCapCombustivel(100);
		van.setConsumoCombustivel(0.2);
		
		System.out.println(van.getNumPassageiros());
		
		Carro van2 = new Carro("Ford", "Ka", 20, 200, 0.4);
		van2.setModelo("Ducato");
		
		System.out.println(van2.getMarca());
		System.out.println(van2.getModelo());
		System.out.println(van2.getNumPassageiros());
		System.out.println(van2.getCapCombustivel());
		System.out.println(van2.getConsumoCombustivel());
		
		

	}

}
