package ProgOrientObjAula5;

import java.util.List;

public class EmpresaMain3 {

	public static void main(String[] args) {
		Horista horista = new Horista("Avery Jordan", "Desenvolvimento", 75.5);
		horista.setHorasTrabalhadas(220);
			
        Comissionado comissionado = new Comissionado("Charlene Butler", "Comercial", 25);
        comissionado.setTotalVendas(350000);

        BaseComissionado baseComissionado = new BaseComissionado("Terrance Wallace", "Venda", 5, 3000);
        baseComissionado.setTotalVendas(150000);
			
		List<Colaborador> colaboradores = List.of(
			                horista,
			                new Mensalista("Christian Cunningham", "Infraestrutura", 7000),
			                new Mensalista("Taylor Griffin", "Agile", 8500),
			                comissionado,
			                baseComissionado,
			                new Mensalista("Brennan Sims", "Engenharia", 15600)
		);
			
        FolhaPagamento folha = new FolhaPagamento(colaboradores);
        folha.geraRelatorio();

	}

}
