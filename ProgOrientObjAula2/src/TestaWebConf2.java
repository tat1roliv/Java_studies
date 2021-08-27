
public class TestaWebConf2 {

	public static void main(String[] args) {
		
		Boletim B1;
		Boletim B2;
		
		B1 = new Boletim();
		B2 = new Boletim();
		
		B1.inserir_nota(6.5f);
		B1.alterar_nota(7.5f);

		B2.inserir_nota(9.5f);
		//B2.nota = 8.5f; private - nao acessa mais
		B2.setNota(8.5f);
	
		System.out.println(B1.getNota());
		System.out.println(B2.getNota());
		
		
	}

}
