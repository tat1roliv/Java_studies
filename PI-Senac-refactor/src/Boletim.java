import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class Boletim {
	
	//atributos
	@Expose private List<DisciplinaCursada> Disciplinas;
	
	//construtores
	public Boletim() {
		Disciplinas = new ArrayList<DisciplinaCursada>();
	}
	
	public Boletim(List<DisciplinaCursada> disciplinas) {
		Disciplinas = disciplinas;
	}
	
	//getters setters
	public List<DisciplinaCursada> getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(List<DisciplinaCursada> disciplinas) {
		Disciplinas = disciplinas;
	}	
	
	public void addDisciplinaCursada(DisciplinaCursada disciplina) {
		Disciplinas.add(disciplina);
	}
	
	@Override
	public String toString() {
		
		String listaDisciplinas = "";
		
		for (Disciplina disciplina :Disciplinas) {			
			listaDisciplinas += disciplina.toString();
		}
		
		return listaDisciplinas;
	}
}
