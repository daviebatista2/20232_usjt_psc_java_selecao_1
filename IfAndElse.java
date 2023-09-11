import javax.swing.JOptionPane;

public class IfAndElse   {
    public static void main (String[] args) {
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua nota!"));

        if  (grade < 70) {
            JOptionPane.showMessageDialog(null, "Reprovado!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Aprovado!");
        };
    }
}