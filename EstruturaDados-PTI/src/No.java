public class No { 
	
   private long id;  
   private No esq; 
   private No dir; 
   
   //construtor no
   public No(long id, No esq, No dir){ 
      this.id = id; 
      this.esq = esq; 
      this.dir = dir;  
   } 
   
   //getters setters
   public long getId() { 
	   return this.id; 
   } 
   public No getEsq() { 
	   return esq; 
   } 
   public No getDir() { 
	   return dir; 
   }

	public void setEsq(No esq) {
		this.esq = esq;
	}
	
	public void setDir(No dir) {
		this.dir = dir;
	} 
   
   
   
   
} 