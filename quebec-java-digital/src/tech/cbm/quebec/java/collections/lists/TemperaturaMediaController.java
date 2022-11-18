package tech.cbm.quebec.java.collections.lists;

import java.util.Locale;
import java.util.Scanner;

public class TemperaturaMediaController {

	public void getDadosFromTerminal() {

		try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US);) {
			System.out.println("Temperatura média em Janeiro:");
			double temperaturaMediaJaneiro = scanner.nextDouble();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
