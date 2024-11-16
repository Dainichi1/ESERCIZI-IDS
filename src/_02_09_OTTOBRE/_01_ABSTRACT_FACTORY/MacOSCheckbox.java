package _02_09_OTTOBRE._01_ABSTRACT_FACTORY;


public class MacOSCheckbox implements Checkbox { // Classe `MacOSCheckbox` che implementa `Checkbox`.

    @Override
    public void paint() { // Metodo `paint` per rappresentare la checkbox.
        System.out.println("You have created MacOSCheckbox."); // Messaggio che indica la creazione della checkbox MacOS.
    }
}
