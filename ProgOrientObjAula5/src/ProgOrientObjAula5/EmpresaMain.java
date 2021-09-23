package ProgOrientObjAula5;

public class EmpresaMain {

	public static void main(String[] args) {
		
		//parte 1
		System.out.println("\n|---- Colaborador -----------------");
		//Colaborador colaborador = new Colaborador("Christian Cunningham", "Infraestrutura");
		//System.out.println(colaborador);
		
		System.out.println("\n|---- Horista ---------------------");
		Horista horista = new Horista("Avery Jordan", "Desenvolvimento", 75.5);
		horista.setHorasTrabalhadas(220);
		System.out.println(horista);
			
		System.out.println("\n|---- Mensalista ------------------");
		Mensalista mensalista = new Mensalista("Taylor Griffin", "Agile", 8500);
		System.out.println(mensalista);
		
		System.out.println("\n|---- Comissionado ----------------");
		Comissionado comissionado = new Comissionado("Charlene Butler", "Comercial", 25);
		comissionado.setTotalVendas(350000);
		System.out.println(comissionado);
			
		System.out.println("\n|---- Base Comissionado -----------");
		BaseComissionado baseComissionado = new BaseComissionado("Terrance Wallace", "Venda", 5, 3000);
		baseComissionado.setTotalVendas(350000);
		System.out.println(baseComissionado);

	}
	
	

}
