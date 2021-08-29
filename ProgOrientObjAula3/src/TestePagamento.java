
public class TestePagamento {

	public static void main(String[] args) {
		
		Pagamento p = new Pagamento();
		
		System.out.println(p.calcularComissao(10000));
		System.out.println(p.calcularComissao(10000,10));
		
				
	}

}
