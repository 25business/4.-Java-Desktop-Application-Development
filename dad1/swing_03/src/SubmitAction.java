import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitAction implements ActionListener {
    private ButtonGroup answers;

    public SubmitAction(ButtonGroup answers) {
        this.answers = answers;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       var tmp_answers = answers.getElements();
       while(tmp_answers.hasMoreElements()) {
           JRadioButton answer = (JRadioButton) tmp_answers.nextElement();
           if(answer.isSelected()) {
               JOptionPane.showMessageDialog(null, "You chose: " + answer.getText());
               break;
           }
       }
    }
}
