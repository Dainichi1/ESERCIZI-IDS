package _01_08_OTTOBRE._01_FACTORY_METHOD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Classe WindowsButton che implementa l'interfaccia Button.
// Rappresenta un pulsante per un'applicazione desktop Windows.
public class WindowsButton implements Button {

    // Dichiarazione dei componenti dell'interfaccia grafica.
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    // Metodo per renderizzare il pulsante e altri elementi sulla UI.
    public void render() {
        // Imposta la chiusura dell'applicazione alla chiusura della finestra.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea un'etichetta con il testo "Hello World!"
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126)); // Colore di sfondo dell'etichetta
        label.setFont(new Font("Dialog", Font.BOLD, 44)); // Font dell'etichetta
        label.setHorizontalAlignment(SwingConstants.CENTER); // Centra il testo

        // Imposta il layout del pannello e aggiunge l'etichetta al pannello.
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);

        // Chiama il metodo onClick per configurare il pulsante di uscita.
        onClick();

        // Aggiunge il pulsante di uscita al pannello.
        panel.add(button);

        // Imposta le dimensioni della finestra e la rende visibile.
        frame.setSize(320, 200);
        frame.setVisible(true);

        // Richiama onClick per assicurarsi che il pulsante sia configurato correttamente.
        onClick();
    }

    // Metodo che definisce l'azione da eseguire quando si clicca sul pulsante.
    // Crea un pulsante "Exit" che chiude l'applicazione quando cliccato.
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false); // Nasconde la finestra
                System.exit(0); // Termina l'applicazione
            }
        });
    }
}

