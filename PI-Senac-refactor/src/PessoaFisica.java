import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.annotations.Expose;

public abstract class PessoaFisica extends Pessoa  {	

	//atributos
	@Expose private String CPF;
	
	@Expose private Date DataNascimento;
	
	//construtores
	public PessoaFisica(String nome, 
						String email, 
						String telefone, 
						Endereco endereco, 
						String cPF,
						Date dataNascimento) 
	{
		super(nome, email, telefone, endereco);
		CPF = cPF;
		DataNascimento = dataNascimento;
	}

	public PessoaFisica() {
		super();
	}
	
	
	//getters setters
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		return String.format("%s\n\nCPF: %s\nData de Nascimento: %s\n",
        		super.toString(), this.CPF, formato.format(this.DataNascimento));
	}
}
