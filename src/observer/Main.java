package observer;

import java.util.Observable;

import javax.swing.JFrame;

import adapter2.ShowPacientTableGUI;
import domain.Covid19Pacient;
import factory.FactorySympton;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient pacient1 = new	Covid19Pacient("aitor",	35, new FactorySympton());
		new	PacientObserverGUI	(pacient1);
		new	PacientSymptomGUI	(pacient1);
		new PacientThermometerGUI (pacient1);
		JFrame gui1 = new ShowPacientTableGUI(pacient1);
		gui1.setPreferredSize(new java.awt.Dimension(300, 200));
		gui1.setVisible(true);
		
		Covid19Pacient pacient2 = new	Covid19Pacient("aitor",	35, new FactorySympton());
		new	PacientObserverGUI	(pacient2);
		new	PacientSymptomGUI	(pacient2);
		new PacientThermometerGUI (pacient2);
		JFrame gui2 = new ShowPacientTableGUI(pacient2);
		gui2.setPreferredSize(new java.awt.Dimension(300, 200));
		gui2.setVisible(true);
	}
}
