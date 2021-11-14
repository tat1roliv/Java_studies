
public class testaListaLigada {

	public static void main(String[] args) {
		Lista minhaLista = new Lista();
		//agenda.inserir(new Contato("fabio",45,"1234566"));
		minhaLista.insereInicio(new Cliente(10,"fabio","",0));
		minhaLista.insereInicio(new Cliente(20,"anderson","",0));
		minhaLista.insereInicio(new Cliente(30,"ariane","",0));
		minhaLista.imprimeLista();
		minhaLista.inserePosicao(new Cliente(40,"samuel","",0),2);
		minhaLista.inserePosicao(new Cliente(1,"laura","",0),1);
		minhaLista.inserePosicao(new Cliente(0,"mireille","",0),0);
		minhaLista.imprimeLista();
	}

}
