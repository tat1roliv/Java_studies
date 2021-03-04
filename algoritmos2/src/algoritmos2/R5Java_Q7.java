package algoritmos2;

public class R5Java_Q7 {
		
		
	public static void main(String[] args) {
		//vetorA
		int [] vetorA = {1,3,4,2,5,8,7,6,9,12,15};
		
		//vetorB
		int [] vetorB = new int[11];
		
		//varre vetorA e verifica se é impar cada elemento
		for (int i = 0; i< vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[i] = vetorA[i];
			}
			else {
				vetorB[i] = (vetorA[i]) * 2;
			}
		System.out.print(vetorB[i] + " ");
		}		 
		
	}

}
