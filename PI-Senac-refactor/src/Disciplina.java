import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;

public class Disciplina implements Base{
	
	//atributos
	@Expose	private String ID;
	
	@Expose private String Nome;
	
	@Expose private int CargaHoraria;	
	
	
	//construtores
	public Disciplina(String nome, int cargaHoraria) {
		super();
		ID = UUID.randomUUID().toString();
		Nome = nome;
		CargaHoraria = cargaHoraria;
	}

	public Disciplina() {
		ID = UUID.randomUUID().toString();
	}
	
	//getters setters
	public String getID() {
		return ID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}	

	//metodo buscar
	public List<Object> Buscar() {
		
		List<Object> listaBD = new ArrayList<Object>();
		
		try {
			
			String caminho = "BancoDados\\"+ this.getClass().getSimpleName() + ".json";
			
			File arquivo = new File(caminho);
			
			if(arquivo.exists()) {
				
				BufferedReader br;
				
				br = new BufferedReader(new FileReader(arquivo));				
				
				Type tipoClasse = new TypeToken<ArrayList<Disciplina>>(){}.getType();
				
				listaBD = new Gson().fromJson(br,tipoClasse);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return listaBD;
	}  
	
	
	//metodo adicionar	
	public Object Adicionar(){
		
		try {
			
			List<Object> listaBD = Buscar();
			
			listaBD.add(this);
			
			Gson gson =  new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
	
			String json = gson.toJson(listaBD);
			
			File diretorio = new File("BancoDados");
			
			if (!diretorio.exists()) { 
				diretorio.mkdirs();
			};			
			
			FileWriter writer;
			
			writer = new FileWriter("BancoDados\\"+this.getClass().getSimpleName()+".json");
			
			writer.write(json);
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return this;
	}
	
	//metodo remover
		public void Remover(){
		
		var listaBD = Buscar();
		
		try {
			
		listaBD.remove(this);
		
		Gson gson =  new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

		String json = gson.toJson(listaBD);
		
		FileWriter writer;
		
		writer = new FileWriter("BancoDados\\"+this.getClass().getSimpleName()+".json");
		
		writer.write(json);
		writer.close();
		
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	//metodo atualizar
	public void Atualizar(){
		
	try {
		
		var listaBD = Buscar();
		
		if(listaBD.contains(this)) {				
			
			int index = listaBD.indexOf(this);
			
			listaBD.set(index,this);
			
			Gson gson =  new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

			String json = gson.toJson(listaBD);
			
			FileWriter writer;
			
			writer = new FileWriter("BancoDados\\"+this.getClass().getSimpleName()+".json");
			
			writer.write(json);
			writer.close();	
			}
		} catch (IOException e) {
				e.printStackTrace();
		}		
	}	
	
	@Override
	public boolean equals(Object obj) {
		
	    if (obj instanceof Disciplina) {
	    	
	    	Disciplina disciplina = (Disciplina)obj;
	    	
	        if (disciplina.getID().contains(this.getID()))
	           return true;
	   }
	    return false;
	}
	
	@Override
	public String toString() {
		return String.format("Disciplina: %s\nCarga hor�ria: %sh",
        		this.Nome, this.CargaHoraria);
	}
}

