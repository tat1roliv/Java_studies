
public class Faculdade {

	public static void main(String[] args) {
			
		
		//variaveis de referencia dos objetos
		Boletim B1 = new Boletim();
		Boletim B2 = new Boletim();
		
		B1.inserir_nota(10.0f);
		B1.inserir_frequencia(true);
		B1.alterar_status();
		
		//B2.nota = 9;
		//B2.frequencia = 85;
		//B2.status = "Aprovado";
		
		B2.inserir_nota(9.0f);
		B2.inserir_frequencia(true);
		B2.alterar_status();
		
		System.out.println(B1.nota);
		System.out.println(B2.nota);
	
		}
	}
