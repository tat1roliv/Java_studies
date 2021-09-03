
public class ContaCorrente {
	
	
	//atributos
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	//construtores
	public ContaCorrente() {
	}
	
	public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}
	
	//metodos
	public boolean realizarSaque(double quantiaASacar){
	        
	        //tem saldo na conta
	        if (saldo >= quantiaASacar){
	            saldo -= quantiaASacar;
	            return true;
	        } else { //n�o tem saldo na conta
	            if (especial) {
	                //verificar se o limite especial tem saldo
	                double limite = limiteEspecial + saldo;
	                if (limite >= quantiaASacar){
	                    saldo -= quantiaASacar;
	                    return true;
	                } else {
	                    return false;
	                }
	            } else {
	                return false; //n�o � especial e n�o tem saldo suficiente
	            }
	        }    
	    }
	    
	    public void depositar(double valorDepositado){
	        
	        saldo += valorDepositado;
	    }
	    
	    public void consultarSaldo(){
	        System.out.println("Saldo atual da conta = " + saldo); 
	    }
	    
	    public boolean verificarUsoChequeEspecial(){
	        return saldo < 0;
	    }

	//getters && setters
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public boolean isEspecial() {
		return this.especial;
	}
	
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteEspecial() {
		return this.limiteEspecial;
	}
	
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
