package arquiteturaSingleton_aula3;

public class ObjetoSingleton {
	
	          private static ObjetoSingleton objetoSingleton;
	
	          private ObjetoSingleton() {
	              System.out.println("ObjetoSingleton criado com sucesso");
	          }
	
	          public static synchronized ObjetoSingleton getInstance() {
	             if(objetoSingleton == null) {
	                 objetoSingleton = new ObjetoSingleton();
	             }
	             return objetoSingleton;
	         }
	      
	         @Override
	         public Object clone() throws  CloneNotSupportedException{
	            	throw new CloneNotSupportedException();
	          }
	
	
}
