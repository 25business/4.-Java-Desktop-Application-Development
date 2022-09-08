import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeTextAction implements ActionListener {
    private JLabel labela;
    private JTextField textField;

    public ChangeTextAction(JLabel labela, JTextField textField) {
        this.labela = labela;
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.labela.setText(this.textField.getText());
    }
}
