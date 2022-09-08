import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My second window");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel label_question = new JLabel("What's your favorite programming language?");

        JRadioButton answer_1 = new JRadioButton("Java", true);
        JRadioButton answer_2 = new JRadioButton("Python");
        JRadioButton answer_3 = new JRadioButton("Javascript");
        ButtonGroup answers = new ButtonGroup();
        answers.add(answer_1);
        answers.add(answer_2);
        answers.add(answer_3);

        JButton button_submit = new JButton("Submit");
        button_submit.addActionListener(new SubmitAction(answers));

        /*
        button_submit.addActionListener(actionEvent -> {
            if(answer_1.isSelected()) {
                JOptionPane.showMessageDialog(null, "You chose: " + answer_1.getText());
            }
            if(answer_2.isSelected()) {
                JOptionPane.showMessageDialog(null, "You chose: " + answer_2.getText());
            }
            if(answer_3.isSelected()) {
                JOptionPane.showMessageDialog(null, "You chose: " + answer_3.getText());
            }
        });
         */

        label_question.setBounds(10,10,300, 25);
        answer_1.setBounds(10,45, 150,25);
        answer_2.setBounds(10,80, 150,25);
        answer_3.setBounds(10,115, 150,25);
        button_submit.setBounds(10, 150, 100, 25);

        frame.add(label_question);
        frame.add(answer_1);
        frame.add(answer_2);
        frame.add(answer_3);
        frame.add(button_submit);

        frame.setVisible(true);
    }
}
