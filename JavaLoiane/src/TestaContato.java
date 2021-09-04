
public class TestaContato {

	public static void main(String[] args) {
		
		Contato contato  = new Contato();
		contato.setNome("Maria Silva");
		contato.setEmail("maria@gmail.cm");
		
		//contato.setTelefone(new String[5]);
		//contato.getTelefone()[0] = "111111111";
		//contato.getTelefone()[1] = "999999999";
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone()[1]);
		
		//relacionamento classe contato e classe endereco
		Endereco end = new Endereco();
		end.setNomeRua("Rua ABC");
		end.setNumero("123");
		end.setComplemento("Apto 1");
		end.setCep("51110-120");
		end.setCidade("Hellcife");
		end.setEstado("PE");
		
		contato.setEndereco(end);
		
		//java8 => null safe operator
		if(contato != null && contato.getEndereco() != null) {
			System.out.println("\nDados Endereço");
			System.out.println(contato.getEndereco().getNomeRua());
			System.out.println(contato.getEndereco().getNumero());
			System.out.println(contato.getEndereco().getComplemento());
			System.out.println(contato.getEndereco().getCep());
			System.out.println(contato.getEndereco().getCidade());
			System.out.println(contato.getEndereco().getEstado());
		}
		
		//relacionamento classe contato e classe telefone
		Telefone tel1 = new Telefone();
		tel1.setTipo("fixo");
		tel1.setDdd("081");
		tel1.setNumero("32551111");
		
		Telefone tel2 = new Telefone();
		tel2.setTipo("celular");
		tel2.setDdd("099");
		tel2.setNumero("99999911");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel1;
		telefones[1] = tel2;
		
		contato.setTelefones(telefones);
		
		if(contato != null && contato.getTelefones() != null) {
			System.out.println("\nDados Telefones");
			
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getTipo());
				System.out.println(t.getDdd());
				System.out.println(t.getNumero());
				
			}
			
		
		}
		
		
		
		
		

	}

}
