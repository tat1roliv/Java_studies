package algoritmos2;

public class R5Java_Q8 {

	public static void main(String[] args) {
		
		//vetorA
		int [] vetorA = {1,2,3};
				
				
		//vetorB
		int [] vetorB = new int[vetorA.length];
				
		//varre vetorA e copia cada elemento para vetorB
		for (int i = 0; i< vetorA.length; i++) {
				vetorB[i] = vetorA[i];
				System.out.print(vetorB[i] + " ");
			}
		
		}		 
		
	}


