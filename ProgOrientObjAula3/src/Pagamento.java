
public class Pagamento {

	public double calcularComissao(double salario) {
		return salario * 0.05;
	}
	
	public double calcularComissao(double salario, double comissao) {
		return salario * 0.1 + comissao * 0.01;	
	}
	
}
