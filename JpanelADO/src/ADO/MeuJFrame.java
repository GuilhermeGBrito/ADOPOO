package ADO;

import javax.swing.JFrame;

class MeuJFrame extends JFrame {
    public MeuJFrame() {
        setTitle("Exemplo JFrame e JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um novo JPanel personalizado
        MeuJPanel meuJPanel = new MeuJPanel();

        // Adiciona o JPanel ao JFrame
        add(meuJPanel);

        // Configura o tamanho do JFrame
        setSize(300, 300);

        // Torna o JFrame visível
        setVisible(true);
    }
}
