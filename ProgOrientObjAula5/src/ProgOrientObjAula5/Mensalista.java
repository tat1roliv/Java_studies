package ProgOrientObjAula5;


public class Mensalista extends Colaborador {
	//atributos
	private double salarioMensal;

	//construtor
	public Mensalista(String nome, String departamento, double salarioMensal) {
		super(nome, departamento);
		this.salarioMensal = salarioMensal;
		
	}
	
	//metodos
	public double salario() {
		return this.salarioMensal;
	}

	@Override
	public String toString() {
		return String.format("%s\nSalário Mensal: R$ %.2f",
				super.toString(), this.salario());
	}

	
	
	
}
