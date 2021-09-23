package ProgOrientObjAula5;

public class Horista extends Colaborador{
	
	//atributos
	private int horasTrabalhadas;
	private double valorPorHora;
	
	//construtor
	public Horista(String nome, String departamento, double valorPorHora) {
		super(nome, departamento);
		this.valorPorHora = valorPorHora;
	}

	//metodos
	public double salario() {
		return this.horasTrabalhadas * this.valorPorHora;
	}

	
	//getters setters
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s\nHoras trabalhadas: %d\n" +
								"Valor por hora: R$ %.2f\nSalário: R$ %.2f",
				                	super.toString(), this.horasTrabalhadas,
				                	this.valorPorHora, this.salario()
				                	);
	}


	
	
	
}
