import javax.swing.*;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel label_username = new JLabel("Username");
        JLabel label_password = new JLabel("Password");
        JTextField text_username = new JTextField();
        JPasswordField text_password = new JPasswordField();
        JCheckBox check_rememberMe = new JCheckBox("Remember me");
        JButton button_login = new JButton("Login");

        label_username.setBounds(10,10, 150, 20);
        text_username.setBounds(10, 35, 150, 20);
        label_password.setBounds(10, 60, 150, 20);
        text_password.setBounds(10, 85, 150, 20);
        check_rememberMe.setBounds(10, 105, 150, 20);
        button_login.setBounds(10, 135, 100, 20);

        button_login.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(null,
                    String.format("""
                            You entered:
                            Username: %s
                            Password: %s
                            Remember me? %s""",
                            text_username.getText(),
                            Arrays.toString(text_password.getPassword()),
                            (check_rememberMe.isSelected() ? "Yes" : "No") ));
        });

        frame.add(label_username);
        frame.add(label_password);
        frame.add(text_username);
        frame.add(text_password);
        frame.add(check_rememberMe);
        frame.add(button_login);
        frame.setVisible(true);
    }
}
