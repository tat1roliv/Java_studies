package bank;

public class ContaPoupanca extends ContaBancaria {

		private String diaRendimento;
		public double taxaRendimentoPoupanca;

		//
		public ContaPoupanca() {
		}

		public ContaPoupanca(String diaRendimento) {
			this.diaRendimento = diaRendimento;
		}
		
		
		//
		public double calcularNovoSaldo() {
			double saldo = this.getSaldo();
			saldo += taxaRendimentoPoupanca;
			return this.setSaldo(saldo + taxaRendimentoPoupanca);
		}
		

		//getters setters
		public String getDiaRendimento() {
			return diaRendimento;
		}

		public void setDiaRendimento(String diaRendimento) {
			this.diaRendimento = diaRendimento;
		}

		@Override
		public String toString() {
			return "ContaPoupanca [diaRendimento=" + diaRendimento + ", taxaRendimentoPoupanca="
					+ taxaRendimentoPoupanca + "]";
		}



		
		
}
