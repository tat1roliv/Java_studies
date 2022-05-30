package arquiteturaSingleton_aula3;

public class GerenciamentoImpressora {
	
	public static GerenciamentoImpressora gerenciamentoImpressora;
	
	private GerenciamentoImpressora() {}
	
	public static synchronized GerenciamentoImpressora getInstance() {
		if (gerenciamentoImpressora == null) {
			gerenciamentoImpressora = new GerenciamentoImpressora();
		}
		return gerenciamentoImpressora;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
