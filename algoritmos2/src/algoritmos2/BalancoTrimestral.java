package algoritmos2;

public class BalancoTrimestral {

	public static void main(String[] args) {
		double gastosJaneiro = 15000;
		double gastosFevereiro = 23000;
		double gastosMarco = 17000;
		double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println("Gastos do Trimestre = " + gastosTrimestre);
		double mediaMensal = gastosTrimestre/3;
		System.out.println("M�dia mensal = " + mediaMensal);

	}

}
