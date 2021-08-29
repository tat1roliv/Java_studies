import javax.swing.JOptionPane;

public class Faculdade {

	public static void main(String[] args) {
		
		Boletim B1 = new Boletim();
		Boletim B2 = new Boletim();
		
		B1.setNota(B1.calcular_media(10.0,3.0,8.0));
		B2.setNota(B2.calcular_media(5.0,6.5));
		
		System.out.println(B1.getNota());
		System.out.println(B2.getNota());
		
		double m_grad = B1.calcular_media(9.5, 4.7, 6.9);
		double m_pos = B2.calcular_media(7.4, 9.2);
		
		JOptionPane.showMessageDialog(null, "A média do aluno de graduação é " + m_grad + "\nA média do aluno de pós-graduação é " + m_pos, "BOLETIM", JOptionPane.PLAIN_MESSAGE);

	}
}