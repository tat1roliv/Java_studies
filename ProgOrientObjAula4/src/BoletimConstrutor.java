
public class BoletimConstrutor {
	
	private double nota;
	private int frequencia;
	private String status;
	
	//construtor1
	public BoletimConstrutor(double n, int f, String s) {
		nota = n;
		frequencia = f;
		status = s;
	}
	
	//construtor2
	public BoletimConstrutor(String st) {
		nota = 10;
		frequencia = 100;
		status = st;
	}
	
	//construtor3
	public BoletimConstrutor() {
		
	}
	
	//imprimir
	public void imprimir() {
		System.out.println(this.getNota() + "\n" + this.getFrequencia() + "\n" + this.getStatus() + "\n");
	}
	
	
	
	//getters and setters
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
