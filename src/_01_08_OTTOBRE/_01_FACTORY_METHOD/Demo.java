package _01_08_OTTOBRE._01_FACTORY_METHOD;


// Classe Demo che contiene il punto di ingresso dell'applicazione.
// Determina quale tipo di dialogo creare in base al sistema operativo e esegue la logica dell'applicazione.
public class Demo {
    private static Dialog dialog;

    // Metodo main, punto di ingresso dell'applicazione.
    public static void main(String[] args) {
        // Configura il tipo di dialogo in base al sistema operativo.
        configure();
        // Esegue la logica principale dell'applicazione.
        runBusinessLogic();
    }

    // Metodo per configurare l'istanza di Dialog.
    // In base al sistema operativo, assegna a dialog un'istanza di WindowsDialog o HtmlDialog.
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 11")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    // Metodo che esegue la logica principale dell'applicazione.
    // Renderizza la finestra di dialogo con il pulsante.
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
