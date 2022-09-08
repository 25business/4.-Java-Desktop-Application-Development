import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColorAction implements ActionListener {
    private JLabel labela;

    public ChangeColorAction(JLabel labela) {
        this.labela = labela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        labela.setBackground(Color.PINK);
    }
}
