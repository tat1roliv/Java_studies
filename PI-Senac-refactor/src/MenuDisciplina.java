import java.util.List;
import java.util.Scanner;

public class MenuDisciplina {
	
	public void AbrirMenu(Scanner menu) {
		
		try {	
		
			while (true) {
				
				System.out.print("\nMenu Disciplina\n\n");
		        System.out.print("Op��o 1 - Cadastrar \n");
		        System.out.print("Op��o 2 - Atualizar \n");
		        System.out.print("Op��o 3 - Excluir \n");
		        System.out.print("Op��o 4 - Retornar \n\n");
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
		        	return;
		
		        default:
		            System.out.print("\nOp��o Inv�lida!\n");
		            break;		            
		        }
			}
		} catch (Exception e) {
			System.out.print("Falha ao abrir menu Disciplina. Retorno: " + e.getMessage());
		}			
	}	
	
	private void Cadastrar(Scanner menu) {
		
		try {
			
			while (true) {
				
				Disciplina novaDisciplina = new Disciplina();
				
				novaDisciplina = ObtemDadosDisciplina(novaDisciplina, menu);
				
				System.out.print("\nDados do novo cadastro\n\n");
						
				System.out.print(novaDisciplina);
				
				System.out.print("\n\nConfirmar cadastro? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					novaDisciplina.Adicionar();
					
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
			System.out.print("Falha ao cadastrar Disciplina. Retorno: " + e.getMessage());
		}		
	}
	
	private Disciplina ObtemDadosDisciplina(Disciplina disciplina, Scanner menu) {
		
		String valorDigitado = null;
		
		try {			
			
			System.out.print("Informe o nome:\n");		
			disciplina.setNome( menu.nextLine());
			
			while (!isInt(valorDigitado)) {				
				System.out.print("\nCarga hor�ria(h): ");			
				valorDigitado = menu.nextLine();
				
				if(!isInt(valorDigitado))
					System.out.print("Valor inv�lido.\n");
			}
			
			disciplina.setCargaHoraria(Integer.parseInt(valorDigitado));
			valorDigitado = null;				
			
		}catch(Exception e) {
			System.out.print("Falha ao obter dados da Disciplina. Retorno: " + e.getMessage());
		}	
		return disciplina;
	}
	
	private void Atualizar(Scanner menu) {
		
		try {
			
			while(true) {
				
				Disciplina disciplinaSelecionada = ObtemDisciplinaSelecionada(menu);	
				
				if(disciplinaSelecionada == null) {
					System.out.print("Atualiza��o cancelada.\n");
					break;
				}
				  	
	        	disciplinaSelecionada = ObtemDadosDisciplina(disciplinaSelecionada, menu);     	
		         
		        System.out.print(disciplinaSelecionada);
		        
		        System.out.print("\n\nConfirmar atualiza��o? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					disciplinaSelecionada.Atualizar();
					
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
			System.out.print("Falha ao atualizar Disciplina. Retorno: " + e.getMessage());
		}	
	}
	
	private Disciplina ObtemDisciplinaSelecionada(Scanner menu) {
			
		String valorDigitado = null;		
		var listaDisciplinas = new Disciplina().Buscar();
		int numeroElementos = listaDisciplinas.size();
		
		try {
			
			if(numeroElementos == 0) {
				System.out.print("Nenhuma disciplina dispon�vies.\n"
							   + "Realizar o cadastro atrav�s do menu Cadastrar.\n"
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
				System.out.print("Falha ao obter Disciplina da lista. Retorno: " + e.getMessage());
			}
		
		return (Disciplina)(listaDisciplinas.get(Integer.parseInt(valorDigitado)));
	}
	
	private void Excluir(Scanner menu) {
		
		try {
			
			while(true) {
				
				Disciplina disciplinaSelecionada = ObtemDisciplinaSelecionada(menu);
				
				if(disciplinaSelecionada == null) {
					System.out.print("Exclus�o cancelada.\n");
					break;
				}
				
				System.out.print("\n" + disciplinaSelecionada);
		        
		        System.out.print("\n\nConfirmar exclus�o? (S/N) ");
				
				if(menu.nextLine().toUpperCase().contains("S")) {
					disciplinaSelecionada.Remover();
					
					System.out.print("Realizar nova exclus�o? (S/N) ");
					
					if(menu.nextLine().toUpperCase().contains("S"))
						continue;					
					else
						break;
					
				}else {	
					System.out.print("Exclus�o cancelada.\n");
					break;
				}	
			}
		} catch (Exception e) {
			System.out.print("Falha ao excluir Disciplina. Retorno: " + e.getMessage());
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
