package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class WindowsButton implements Button { // Classe `WindowsButton` che implementa `Button`.
    @Override
    public void paint() { // Metodo `paint` per mostrare il bottone.
        System.out.println("Hai creato WindowsButton."); // Messaggio che indica la creazione del bottone Windows.
    }
}
