package bank;

public class Teste {

	public static void main(String[] args) {
		System.out.println("**** Teste Conta Bancaria ****");
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNomeCliente("Maria");
		conta.setNumConta(123456);
		conta.setSaldo(100.50);
		
		System.out.println(conta);
		
		conta.sacar(1.50);
		
		System.out.println("saldo: " + conta.getSaldo());
		
		conta.depositar(350);
		
		System.out.println("saldo: " + conta.getSaldo());
		
	}
}
