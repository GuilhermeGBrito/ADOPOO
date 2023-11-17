package ADO;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ExemploJFrameJPanel {
    public static void main(String[] args) {
        // Cria uma instância do JFrame personalizado
        SwingUtilities.invokeLater(() -> {
            new MeuJFrame();
        });
    }
}