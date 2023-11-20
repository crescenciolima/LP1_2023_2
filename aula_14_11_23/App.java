import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame("Titulo da janela");
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JButton but = new JButton("Primeiro Botao");
        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Funcionou");
                JOptionPane.showMessageDialog(null, "Botão clicado!");
            }
        });
        JLabel texto = new JLabel("Hello Graphical User Interface");
        JPanel painel = new JPanel();
        painel.add(but);
        janela.getContentPane().add(painel);
        painel.add(texto);
        janela.pack();
        janela.setVisible(true);
    }
}
