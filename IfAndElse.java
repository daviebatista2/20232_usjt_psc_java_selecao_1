import javax.swing.JOptionPane;

public class IfAndElse   {
    public static void main (String... args) {
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota!"));
        String message = grade < 70 ?  "Reprovado!" : "Aprovado!";

        JOptionPane.showMessageDialog(null, message);
    }
}