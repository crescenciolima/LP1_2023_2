import javax.swing.JOptionPane;

public class App_2 {
    public static void main(String[] args) throws Exception {
        String primeiroNumero = JOptionPane.showInputDialog("Primeiro Numero");
        String segundoNumero = JOptionPane.showInputDialog("Segundo Numero");
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + soma);

    }
}

