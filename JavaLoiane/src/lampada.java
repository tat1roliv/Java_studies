
public class lampada {

	String modeloLampada;
	String tensaoLampada;
	int potenciaLampada;
	String corLampada;
	String tipoLuz;
	int garantiaMeses;
	String[] tiposLampada;
	boolean tipoAbajour;
	
	boolean ligada;
	
	void ligar() {		
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		
		if (ligada) {
			System.out.println("A lampada está ligada");
		} else {
			System.out.println("A lampada está desligada");
		}
		
	}
	
	void mudarEstado() {
		
		if (ligada) {
			ligada = false;
		} 
		
		if (!ligada) {
			ligada = true;
		} 
		
	
	}
}
