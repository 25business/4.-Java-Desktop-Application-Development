import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Konverter");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JTextArea text_area = new JTextArea();
        text_area.setLineWrap(true);
        text_area.setBounds(10, 10, 200, 100);

        JPasswordField field_password = new JPasswordField();
        field_password.setEchoChar('•');
        field_password.setBounds(10, 110, 100, 25);

        JCheckBox checkBox = new JCheckBox("Option");
        checkBox.setBounds(10, 140, 100, 25);

        frame.add(text_area);
        frame.add(field_password);
        frame.add(checkBox);
        frame.setVisible(true);
    }
}
