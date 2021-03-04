package algoritmos2;

public class R5Java_Q9 {
	
	public static void main(String[] args) {
		
		//vetorA
		int [] vetorA = {10,20,30};
				
				
		//vetorB
		int [] vetorB = {1,2,3};
		
		//vetorC
		int [] vetorC = new int[vetorA.length];
				
		//varre vetorA e copia cada elemento para vetorB
		for (int i = 0; i< vetorA.length; i++) {
				vetorC [i] = vetorB[i] + vetorA[i];
				System.out.print(vetorC[i] + " ");
			}
		
		}		 
		
}
