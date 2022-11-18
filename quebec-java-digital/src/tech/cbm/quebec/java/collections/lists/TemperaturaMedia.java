package tech.cbm.quebec.java.collections.lists;

public class TemperaturaMedia {
	
	public static void main(String[] args) {
		System.out.println("Favor informar a temperatura média dos 6 primeiros meses deste ano:");

		TemperaturaMediaController controller = new TemperaturaMediaController();
		controller.getDadosFromTerminal();
		
	}
}
