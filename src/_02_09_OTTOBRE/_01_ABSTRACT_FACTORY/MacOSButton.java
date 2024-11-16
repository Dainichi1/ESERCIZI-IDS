package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class MacOSButton implements Button { // Classe `MacOSButton` che implementa `Button`.
    @Override
    public void paint() { // Metodo `paint` per mostrare il bottone.
        System.out.println("Hai creato MacOSButton."); // Messaggio che indica la creazione del bottone MacOS.
    }
}
