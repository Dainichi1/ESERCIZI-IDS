package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;

public class WindowsCheckbox implements Checkbox { // Classe `WindowsCheckbox` che implementa `Checkbox`.

    @Override
    public void paint() { // Metodo `paint` per rappresentare la checkbox.
        System.out.println("You have created WindowsCheckbox."); // Messaggio che indica la creazione della checkbox Windows.
    }
}