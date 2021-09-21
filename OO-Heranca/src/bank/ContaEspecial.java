package bank;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	
	
	

	public ContaEspecial(double limite) {
		this.limite = limite;
	}
	
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}



	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}
	
	
	
	

}
