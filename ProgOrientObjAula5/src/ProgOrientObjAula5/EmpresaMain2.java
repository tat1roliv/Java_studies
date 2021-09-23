package ProgOrientObjAula5;

import java.util.List;

public class EmpresaMain2 {
	
	public static long contadorMensalistas(List<Colaborador> colaboradores) {
	     return colaboradores.stream().filter(colaborador -> colaborador instanceof  Mensalista).count();
	  }
	
	
	public static void main(String[] args) {
		List<Colaborador> colaboradores = List.of(
		new Horista("Avery Jordan", "Desenvolvimento", 75.5),
		new Mensalista("Christian Cunningham", "Infraestrutura", 7000),
		new Mensalista("Taylor Griffin", "Agile", 8500),
		new Comissionado("Charlene Butler", "Comercial", 25),
		new BaseComissionado("Terrance Wallace", "Venda", 5, 3000),
		new Mensalista("Brennan Sims", "Engenharia", 15600)
	);
				
		System.out.printf("O total de colaboradores mensalistas é de %d colaboradores", contadorMensalistas(colaboradores));
 }

}
