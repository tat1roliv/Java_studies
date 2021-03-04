package algoritmos2;

public class R5Java_Q11 {

	public static void main(String[] args) {
		int []vA = {1,3,5,9};
		int []vB = {2,4,6,8};
		int []vCC = criarVetor(vA, vB);
		for (int i = 0; i< vCC.length;i++){
			System.out.print(vCC[i] + "  ");
		}

	}
	
	static int [] criarVetor(int []vA, int []vB) {
		int[] vCC = new int[vA.length + vB.length];
		for (int i = 0; i<vA.length; i++) {
			vCC[i*2] = vA[i];
			vCC[i*2+1] = vB[i];
		}
		return vCC;

	}

}
