import javax.swing.*;
import java.awt.*;

public class Program_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.setLayout(new GridBagLayout());

        var c1 = new GridBagConstraints();
        c1.gridx = 0;
        c1.gridy = 0;
        JButton btn1 = new JButton("Button 1");
        frame.add(btn1, c1);

        var c2 = new GridBagConstraints();
        c2.gridx = 1;
        c2.gridy = 0;
        //c2.ipadx = 50;
        c2.insets = new Insets(100, 50, 0 , 0);
        JButton btn2 = new JButton("Button 2");
        frame.add(btn2, c2);

        frame.setVisible(true);
    }
}
