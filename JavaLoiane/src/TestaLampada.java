
public class TestaLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.setModeloLampada("A60");
		lampada.setTensaoLampada("Bivolt");
		lampada.setPotenciaLampada(7);
		lampada.setCorLampada("Branca");
		lampada.setTipoLuz("Led");
		lampada.setGarantiaMeses(36);
		lampada.setTipoAbajour(true);
		
		lampada.setTiposLampada(new String[5]);
		lampada.getTiposLampada()[0] = "Abajour";
		lampada.getTiposLampada()[1] = "LedWhite";
		
		lampada.ligar();
		
		System.out.println(lampada.getModeloLampada());
		lampada.mostrarEstado();
		
		lampada.desligar();	
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		

	}

}
