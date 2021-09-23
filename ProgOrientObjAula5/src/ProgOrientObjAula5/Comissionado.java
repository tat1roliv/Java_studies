package ProgOrientObjAula5;


public class Comissionado extends Colaborador{
	
	//atributos
	private double totalVendas;
	private int comissao;

	
	//construtor
	public Comissionado(String nome, String departamento, int comissao) {
		super(nome, departamento);
		this.comissao = comissao;
	}
	
	//metodos
	 public double salario() {
		return this.totalVendas * (this.comissao / 100.);
	 }
	  
	 //getters setters
	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	 
	@Override
	public String toString() {
		return String.format("%s\nTotal de Vendas: R$ %.2f\n" +
				             "Comissão: %d%%\nSalário Mensal: R$ %.2f",
				              super.toString(), this.getTotalVendas(),
				             this.getComissao(), this.salario());
	}


	 
	 

}
