
public class TestaLampada {

	public static void main(String[] args) {
		
		lampada lampada = new lampada();
		
		lampada.modeloLampada = "A60";
		lampada.tensaoLampada = "Bivolt";
		lampada.potenciaLampada = 7;
		lampada.corLampada = "Branca";
		lampada.tipoLuz = "Led";
		lampada.garantiaMeses = 36;
		lampada.tipoAbajour = true;
		
		lampada.tiposLampada = new String[5];
		lampada.tiposLampada[0] = "Abajour";
		lampada.tiposLampada[1] = "LedWhite";
		
		lampada.ligar();
		
		System.out.println(lampada.modeloLampada);
		lampada.mostrarEstado();
		
		lampada.desligar();	
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		

	}

}
