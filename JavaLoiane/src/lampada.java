
public class Lampada {
	
	//atributos
	private String modeloLampada;
	private String tensaoLampada;
	private int potenciaLampada;
	private String corLampada;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tiposLampada;
	
	//encapsulamento tipo boolean get=> isAtributo
	private boolean tipoAbajour;
	private boolean ligada;
	
	//construtores
	public Lampada() {

	}

	public Lampada(String modeloLampada, String tensaoLampada, int potenciaLampada, String corLampada, String tipoLuz,
			int garantiaMeses, String[] tiposLampada, boolean tipoAbajour, boolean ligada) {

		this.modeloLampada = modeloLampada;
		this.tensaoLampada = tensaoLampada;
		this.potenciaLampada = potenciaLampada;
		this.corLampada = corLampada;
		this.tipoLuz = tipoLuz;
		this.garantiaMeses = garantiaMeses;
		this.tiposLampada = tiposLampada;
		this.tipoAbajour = tipoAbajour;
		this.ligada = ligada;
	}
	
	//metodos
	public void ligar() {
		setLigada(true);
	}
	

	
	public void desligar() {
		setLigada(false);
	}
	
	
	
	public void mostrarEstado() {
		
		if (isLigada()) {
			System.out.println("A lampada está ligada");
		} else {
			System.out.println("A lampada está desligada");
		}
		
	}
	
	
	
	public void mudarEstado() {
		
		if (isLigada()) {
			setLigada(false);
		} 
		
		if (!isLigada()) {
			setLigada(true);
		} 
		
	
	}
	
	//getters && setters

	public String getModeloLampada() {
		return this.modeloLampada;
	}

	public void setModeloLampada(String modeloLampada) {
		this.modeloLampada = modeloLampada;
	}

	public String getTensaoLampada() {
		return this.tensaoLampada;
	}

	public void setTensaoLampada(String tensaoLampada) {
		this.tensaoLampada = tensaoLampada;
	}

	public int getPotenciaLampada() {
		return this.potenciaLampada;
	}

	public void setPotenciaLampada(int potenciaLampada) {
		this.potenciaLampada = potenciaLampada;
	}

	public String getCorLampada() {
		return this.corLampada;
	}

	public void setCorLampada(String corLampada) {
		this.corLampada = corLampada;
	}

	public String getTipoLuz() {
		return this.tipoLuz;
	}

	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}

	public int getGarantiaMeses() {
		return this.garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTiposLampada() {
		return this.tiposLampada;
	}

	public void setTiposLampada(String[] tiposLampada) {
		this.tiposLampada = tiposLampada;
	}

	public boolean isTipoAbajour() {
		return this.tipoAbajour;
	}

	public void setTipoAbajour(boolean tipoAbajour) {
		this.tipoAbajour = tipoAbajour;
	}

	public boolean isLigada() {
		return this.ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
}
