import javax.swing.JOptionPane;

public class Switch {
    public static void main (String[] args) {
        var grade = "";
        
            grade = JOptionPane.showInputDialog("Digite a sua nota!");
            switch(grade)   {
                case "1":
                    JOptionPane.showMessageDialog(null, "Oh não! Faremos melhor na próxima :(");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Dê seu feedback para que possamos melhorar. :(");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Obrigado pelo feedback! Esperamos atendê-lo melhor na próxima!");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Ficamos felizes que gostou! Volte sempre!");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Muito obrigado! Ficamos contentes que gostou de nosso serviço!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Insira uma nota válida!");
        }
    }
}
