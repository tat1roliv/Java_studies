import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class MenuAluno {
	
	public void AbrirMenu(Scanner menu) {
		
		try {	
		
			while (true) {
				
				System.out.print("\nMenu Aluno\n\n");
		        System.out.print("Op��o 1 - Cadastrar \n");
		        System.out.print("Op��o 2 - Atualizar \n");
		        System.out.print("Op��o 3 - Excluir \n");
		        System.out.print("Op��o 4 - Avaliar \n");
		        System.out.print("Op��o 5 - Retornar \n\n");
		        System.out.print("Digite uma op��o: ");
		
		        String opcao = menu.nextLine();
		
		        switch (opcao) {
		        
		        case "1":	        	
		        	Cadastrar(menu);		        	
		            break;
		
		        case "2":
		        	Atualizar(menu);
		            break;
		
		        case "3":
		        	Excluir(menu);
		            break;		            
		            
		        case "4":
		        	Avaliar(menu);
		            
		        case "5":		        	
		        	return;
		
		        default:
		            System.out.print("\nOp��o Inv�lida!\n");
		            break;		            
		        }
			}
		} catch (Exception e) {
			System.out.print("Falha ao abrir menu Aluno. Retorno: " + e.getMessage());
		}			
	}	
	
	private void Cadastrar(Scanner menu) {
		
		try {
			
			while (true) {
				
				Aluno novoAluno = new Aluno();
				
				novoAluno = ObtemDadosAluno(novoAluno, menu);
				
				System.out.print("\nCadastrar endere�o? (S/N) ");			
				if(menu.nextLine().toUpperCase().contains("S")) {
					novoAluno.setEndereco(ObtemDadosEndereco(menu));
				}
				
				System.out.print("\nCadastrar boletim? (S/N) ");			
				if(menu.nextLine().toUpperCase().contains("S")) {
					novoAluno.setBoletim(ObtemDadosBoletim(menu));
				}
			
				System.out.print("\nDodos do novo cadastro\n\n");
						
				System.out.print(novoAluno);
				
				System.out.print("Confirmar cadastro? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					novoAluno.Adicionar();
					
					System.out.print("Realizar novo cadastro? (S/N) ");
					
					if(menu.nextLine().toUpperCase().contains("S"))
						continue;
					else
						break;
					
				}else {	
					System.out.print("Novo cadastro apagado.\n");
					break;
				}	
			}
		} catch (Exception e) {
			System.out.print("Falha ao cadastrar Aluno. Retorno: " + e.getMessage());
		}		
	}
	
	private Aluno ObtemDadosAluno(Aluno aluno, Scanner menu) {

		String valorDigitado = null;
		
		try {			
			System.out.print("\nDados do Aluno\n\n");
			
			System.out.print("Informe o nome:\n");		
			aluno.setNome( menu.nextLine());
			
			System.out.print("Informe o e-mail:\n");		
			aluno.setEmail( menu.nextLine());
			
			System.out.print("Informe o telefone:\n");		
			aluno.setTelefone( menu.nextLine());
			
			System.out.print("Informe o CPF:\n");		
			aluno.setCPF( menu.nextLine());
			
			while (!isDate(valorDigitado)) {				
				System.out.print("Informe data de nascimento (dd/MM/yyyy):\n");	
				valorDigitado = menu.nextLine();
				
				if(!isDate(valorDigitado))
					System.out.print("Valor inv�lido.\n");
			}
			
			aluno.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(valorDigitado));
			
		}catch(ParseException e) {
			System.out.print("Falha ao obter dados do Aluno. Retorno: " + e.getMessage());
		}	
		return aluno;
	}
	
	private Endereco ObtemDadosEndereco(Scanner menu) {

		var novoEndereco = new Endereco();
		String valorDigitado = null;
		
		try {	
			
			System.out.print("\nEndereco\n");
			
			System.out.print("Informe o Logradouro:\n");		
			novoEndereco.setLogradouro(menu.nextLine());
			
			while (!isInt(valorDigitado)) {				
				System.out.print("Informe o Numero:\n");			
				valorDigitado = menu.nextLine();
				
				if(!isInt(valorDigitado))
					System.out.print("Valor inv�lido.\n");
			}

			novoEndereco.setNumero(Integer.parseInt(valorDigitado));
			valorDigitado = null;

			System.out.print("Informe o Complemento:\n");		
			novoEndereco.setComplemento(menu.nextLine());
			
			System.out.print("Informe o Bairro:\n");		
			novoEndereco.setBairro(menu.nextLine());
			
			System.out.print("Informe o CEP:\n");		
			novoEndereco.setCEP(menu.nextLine());
			
			System.out.print("Informe o Cidade:\n");		
			novoEndereco.setCidade(menu.nextLine());
			
			System.out.print("Informe o Estado:\n");		
			novoEndereco.setEstado(menu.nextLine());
			
		} catch (Exception e) {
			System.out.print("Falha ao obter dados de Endere�o. Retorno: " + e.getMessage());
		}	
		return novoEndereco;
	}
	
	private void Atualizar(Scanner menu) {
		
		try {
			
			while (true) {
				
				Aluno alunoSelecionado = ObtemAlunoSelecionado(menu);
				
				if(alunoSelecionado == null) {
					System.out.print("Atualiza��o cancelada.\n");
					break;
				}
				
				System.out.print("Aluno selecionado: " + alunoSelecionado.getNome());
				
				System.out.print("\n\nAtualizar:\n");
		        System.out.print("Op��o 1 - Dados do Aluno \n");
		        System.out.print("Op��o 2 - Endere�o do aluno\n");
		        System.out.print("Op��o 3 - Boletim do aluno\n");
		        System.out.print("Op��o 4 - Retornar \n\n");
		        System.out.print("Digite uma op��o: ");
		
		        String opcao = menu.nextLine();
		
		        switch (opcao) {
		        case "1":	        	
		        	alunoSelecionado = ObtemDadosAluno(alunoSelecionado, menu);     	
		            break;
		
		        case "2":
		        	alunoSelecionado.setEndereco(ObtemDadosEndereco(menu));
		            break;
		
		        case "3":	        	
		        	alunoSelecionado.setBoletim(ObtemDadosBoletim(menu));
		            break;
		            
		        case "4":
		        	return;
		
		        default:
		            System.out.print("\nOp��o Inv�lida!\n");
		            break;	            
		        }
		        
		        System.out.print(alunoSelecionado);
		        
		        System.out.print("\n\nConfirmar atualiza��o? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					alunoSelecionado.Atualizar();
					
					System.out.print("Realizar nova atualiza��o? (S/N) ");
					
					if(menu.nextLine().toUpperCase().contains("S"))
						continue;
					else
						break;
					
				}else {	
					System.out.print("Atualiza��o cancelada.\n");
					break;
				}	
			}
		} catch (Exception e) {
			System.out.print("Falha ao atualizar Aluno. Retorno: " + e.getMessage());
		}	
	}
	
	private Boletim ObtemDadosBoletim(Scanner menu) {
		
		var novoBoletim = new Boletim();
				
		try {		
			
			System.out.print("\nSelecionar disciplinas do novo boletim\n");
			
			while (true) {
				
				var disciplinaSelecionada = ObtemDisciplinaSelecionada(menu);
				
				if(disciplinaSelecionada == null) {
					return null;
				}
				
				var novaDisciplinaCursada = new DisciplinaCursada(disciplinaSelecionada);
				
				System.out.print("\n\n" + disciplinaSelecionada);
				
				System.out.print("\n\nAdicionar? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					novoBoletim.addDisciplinaCursada(novaDisciplinaCursada);
					
					System.out.print("Adicionar nova disciplina? (S/N) ");
					
					if(!menu.nextLine().toUpperCase().contains("S"))
						break;
					
				}else {	
					System.out.print("Nova disciplina apagada.\n");					
				}		
				}	
			} catch (Exception e) {
				System.out.print("Falha ao obter dados do Boletim. Retorno: " + e.getMessage());
			}		
		
		return novoBoletim;
	}	
	
	private Disciplina ObtemDisciplinaSelecionada(Scanner menu) {

		String valorDigitado = null;		
		var listaDisciplinas = new Disciplina().Buscar();
		int numeroElementos = listaDisciplinas.size();
		
		try {
			
			if(listaDisciplinas.size() == 0) {
				System.out.print("Nenhuma disciplina dispon�vies.\n"
							   + "Realizar o cadastro atrav�s do menu Disciplinas.\n"
							   + "Digite 'OK' para continuar.\n");
				menu.nextLine();
				return null;
			}
			
			System.out.print("\nLista de disciplinas dispon�vies:\n\n");
			
			for (Object disciplinaBD : listaDisciplinas) {
				
				int indiceLista = listaDisciplinas.indexOf(disciplinaBD);
				
				System.out.print("Op��o: " + indiceLista + " - Nome: " + ((Disciplina)disciplinaBD).getNome() + "\n");
			}
			
			System.out.print("Op��o: " + numeroElementos + " - Retornar\n");
			
			while(!isValidIndex(valorDigitado, listaDisciplinas)) {
				System.out.print("\nEscolha uma op��o: ");
				
				valorDigitado = menu.nextLine();
				
				if(valorDigitado.contains(String.valueOf(numeroElementos))) {
					return null;
				}
				
				if(!isValidIndex(valorDigitado, listaDisciplinas))
					System.out.print("Op��o inv�lida.\n");
			}	
			
			} catch (Exception e) {
				System.out.print("Falha ao obter disciplina da lista. Retorno: " + e.getMessage());
			}
		
		return (Disciplina)(listaDisciplinas.get(Integer.parseInt(valorDigitado)));
	}
	
	private void Excluir(Scanner menu) {
		
		try {
			
			while(true) {
				
				Aluno alunoSelecionado = ObtemAlunoSelecionado(menu);
				
				if(alunoSelecionado == null) {
					System.out.print("Exclus�o cancelada.\n");
					break;
				}
				
				System.out.print(alunoSelecionado);
		        
		        System.out.print("Confirmar exclus�o? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					alunoSelecionado.Remover();
					
					System.out.print("Realizar nova exclus�o? (S/N) ");
					
					if(menu.nextLine().toUpperCase().toUpperCase().contains("S"))
						continue;					
					else
						break;
					
				}else {	
					System.out.print("Atualiza��o cancelada.\n");
					break;
				}	
			}
		} catch (Exception e) {
			System.out.print("Falha ao excluir aluno. Retorno: " + e.getMessage());
		}	
	}
	
	private void Avaliar(Scanner menu) {
		
		try {
			
			while(true) {
				
				Aluno alunoSelecionado = ObtemAlunoSelecionado(menu);
				
				if(alunoSelecionado == null) {
					System.out.print("Avalia��o cancelada.\n");
					break;
				}
				
				if (alunoSelecionado.getBoletim() == null) {
					System.out.print("Aluno ainda n�o possui um boletim cadastrado.\n"
									+"Voc� pode adicionar um boletim atrav�s do menu Atualizar Aluno.\n"
									+ "Digite 'OK' para continuar.\n");
					menu.nextLine();
					break;
				}
			
				System.out.print("Boletim do aluno: " + alunoSelecionado.getNome() + "\n\n");
				
				System.out.print(alunoSelecionado.getBoletim());

				System.out.print("Inserir notas? (S/N) ");			
				if(menu.nextLine().toUpperCase().contains("S")) {
					alunoSelecionado = AdicionaNotasBoletim(alunoSelecionado, menu);  
				}
				
				System.out.print("\nInserir frequ�ncia? (S/N) ");			
				if(menu.nextLine().toUpperCase().contains("S")) {
					alunoSelecionado = AdicionaFrequencia(alunoSelecionado, menu);
				}			
		        
				alunoSelecionado.AvaliarAluno();
				
		        System.out.print("\nBoletim do aluno\n\n" + alunoSelecionado.getBoletim());
		        
		        if (alunoSelecionado.isAprovado()) {
					System.out.print("Aluno aprovado!");
				}else {
					System.out.print("Aluno reprovado!");
				}	
		        
		        System.out.print("\n\nConfirmar altera��es? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					alunoSelecionado.Atualizar();
					
					System.out.print("Realizar nova avalia��o? (S/N) ");
					
					if(menu.nextLine().toUpperCase().contains("S"))
						continue;
					else
						break;
					
				}else {	
					System.out.print("Avalia��o cancelada.\n");
					break;
				}
			}
		} catch (Exception e) {
			System.out.print("Falha ao realizar avalia��o. Retorno: " + e.getMessage());
		}	
	}

	private Aluno AdicionaNotasBoletim(Aluno aluno, Scanner menu) {

		String valorDigitado = null;
		Boolean valido = false;
		
		try {
			
			var boletim = aluno.getBoletim();
					
			var disciplinas = boletim.getDisciplinas();
			
			for (DisciplinaCursada disciplina : disciplinas) {
				
				System.out.print("\nDisciplina: " + disciplina.getNome() + "\n");
				
				while (!valido) {				
					System.out.print("Nota 1: ");			
					valorDigitado = menu.nextLine();
					
					valido = VerificaSeValorDaNotaEhValido(valorDigitado);
					
					if(!valido)
						System.out.print("Valor inv�lido.\n");
				}
				
				disciplina.setNota1(Double.parseDouble(valorDigitado));
				valido = false;
				
				while (!valido) {
					
					System.out.print("Nota 2: ");			
					valorDigitado = menu.nextLine();
					
					valido = VerificaSeValorDaNotaEhValido(valorDigitado);
					
					if(!valido)
						System.out.print("Valor inv�lido.\n");
				}
				
				disciplina.setNota2(Double.parseDouble(valorDigitado));	
				valido = false;
				
				disciplina.CalculaMedia();
				
			}
			
			boletim.setDisciplinas(disciplinas);			
			aluno.setBoletim(boletim);
			
		} catch (Exception e) {
			System.out.print("Falha ao adicionar notas ao Boletim. Retorno: " + e.getMessage());
		}
		
		return aluno;
	}

	private Boolean VerificaSeValorDaNotaEhValido(String valorDigitado) {		
		return isDouble(valorDigitado) && Double.parseDouble(valorDigitado) >= 0 && Double.parseDouble(valorDigitado) <= 10;		
	}
	
	private Aluno AdicionaFrequencia(Aluno aluno, Scanner menu) {

		String valorDigitado = null;
		Boolean valido = false;
		
		try {
			
			System.out.print("\nInserir frequ�ncia\n");
			
			var boletim = aluno.getBoletim();
					
			var disciplinas = boletim.getDisciplinas();
			
			for (DisciplinaCursada disciplina : disciplinas) {
				
				System.out.print("\nDisciplina: " + disciplina.getNome()
								+"\nCarga hor�ria: " + disciplina.getCargaHoraria() + " h\n");
				
				while (!valido) {				
					System.out.print("Frequ�ncia(h): ");			
					valorDigitado = menu.nextLine();
					
					valido = VerificaSeValorDaFequenciaEhValido(valorDigitado, disciplina);
					
					if(!valido)
						System.out.print("Valor inv�lido.\n");
				}
				
				disciplina.setFrequencia(Integer.parseInt(valorDigitado));
				valido = false;
			}
			
			boletim.setDisciplinas(disciplinas);			
			aluno.setBoletim(boletim);			
			
		} catch (Exception e) {
			System.out.print("Falha ao adicionar frequ�ncia no Boletim. Retorno: " + e.getMessage());
		}
		
		return aluno;
	}	

	private Boolean VerificaSeValorDaFequenciaEhValido(String valorDigitado, DisciplinaCursada disciplina) {
		return isInt(valorDigitado) && Integer.parseInt(valorDigitado) >= 0 && Integer.parseInt(valorDigitado) <= disciplina.getCargaHoraria();
	}

	private Aluno ObtemAlunoSelecionado(Scanner menu) {

		String valorDigitado = null;		
		var listaAlunos = new Aluno().Buscar();
		int numeroElementos = listaAlunos.size();
		
		try {
			
			if(numeroElementos == 0) {
				System.out.print("Nenhuma aluno dispon�vies.\n"
							   + "Realizar o cadastro atrav�s do menu Cadastrar.\n"
							   + "Digite 'OK' para continuar.\n");
				menu.nextLine();
				return null;
			}
			
			System.out.print("\nLista de alunos:\n\n");
			
			for (Object alunoBD : listaAlunos) {
				
				int indiceLista = listaAlunos.indexOf(alunoBD);
				
				System.out.print("Op��o: " + indiceLista + " - Nome: " + ((Aluno)alunoBD).getNome() + "\n");
			}
			
			System.out.print("Op��o: " + numeroElementos + " - Retornar\n");
			
			while(!isValidIndex(valorDigitado, listaAlunos)) {
				System.out.print("\nEscolha uma op��o: ");
				
				valorDigitado = menu.nextLine();
				
				if(valorDigitado.contains(String.valueOf(numeroElementos)))
					return null;
				
				if(!isValidIndex(valorDigitado, listaAlunos))
					System.out.print("Op��o inv�lida.\n");
			}	
			} catch (Exception e) {
				System.out.print("Falha ao obter aluno da lista. Retorno: " + e.getMessage());
			}
		
		return (Aluno)(listaAlunos.get(Integer.parseInt(valorDigitado)));
	}	
	
	public static boolean isDouble(String text) {
	    try {
	        Double.parseDouble(text);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public static boolean isInt(String text) {
	    try {
	        Integer.parseInt(text);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public static boolean isDate(String text) {
	    try {
	    	SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
	    	parser.parse(text);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public static boolean isValidIndex(String text, List<Object> lista) {
	    try {
	    	int inteiro = Integer.parseInt(text);
	    	lista.get(inteiro);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
}
