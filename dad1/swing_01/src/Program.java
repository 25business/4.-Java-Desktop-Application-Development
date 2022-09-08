import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My first GUI app");
        frame.setSize(300, 200);
        frame.setLocation(300,300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel labela = new JLabel("Ovo je neki tekst");
        labela.setBounds(10,10, 200, 25);
        labela.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        labela.setForeground(Color.RED);
        labela.setOpaque(true);
        labela.setBackground(Color.YELLOW);
        labela.setHorizontalAlignment(SwingConstants.RIGHT);

        JButton button = new JButton("Click me!");
        button.setBounds(10, 40, 100, 25);
        button.setFocusable(false);

        /*
        button.addActionListener( actionEvent -> {
            labela.setBackground(new Color(67, 244, 116));
        });
         */
        //button.addActionListener(new ChangeColorAction(labela));

        JTextField textField = new JTextField();
        textField.setBounds(10,70, 150, 25);

        button.addActionListener(new ChangeTextAction(labela, textField));

        frame.add(labela);
        frame.add(button);
        frame.add(textField);

        frame.setVisible(true);
    }
}
