import javax.swing.*;
import java.awt.*;

public class Program_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JButton btn_1 = new JButton("Dugme 1");
        btn_1.setMinimumSize(new Dimension(Integer.MAX_VALUE, 30));
        btn_1.setPreferredSize(new Dimension(Integer.MAX_VALUE, 30));
        btn_1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        JButton btn_2 = new JButton("Dugme 2");
        frame.add(btn_1);
        frame.add(btn_2);

        frame.setVisible(true);
    }
}
