package bank;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if ((this.saldo - valor) <= 0 ) {
			System.out.println("Saldo insuficiente.");
			return false;
		}
		this.saldo -= valor; 
		return true;
	}
	
	public void depositar (double valor) {
		this.saldo += valor;
	}

	//getters setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}


	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	

}
