import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        JButton btn_start = new JButton("PAGE START");
        btn_start.setMinimumSize(new Dimension(300, 100)); // najmanja velicina elementa
        btn_start.setPreferredSize(new Dimension(300, 100)); // velicina koju biste zeleli
        btn_start.setMaximumSize(new Dimension(300, 100)); // najveca velicina elementa
        frame.add(btn_start, BorderLayout.PAGE_START);

        /*
        JButton btn_center = new JButton("CENTER");
        frame.add(btn_center, BorderLayout.CENTER);
         */
        JPanel center_frame = new JPanel();
        center_frame.setLayout(new BorderLayout());
        center_frame.add(new JButton("INNER 1"), BorderLayout.LINE_START);
        center_frame.add(new JButton("INNER 2"), BorderLayout.LINE_END);
        frame.add(center_frame, BorderLayout.CENTER);

        JButton btn_left = new JButton("LINE START");
        frame.add(btn_left, BorderLayout.LINE_START);

        JButton btn_right = new JButton("LINE END");
        frame.add(btn_right, BorderLayout.LINE_END);

        JButton btn_bottom = new JButton("PAGE END");
        frame.add(btn_bottom, BorderLayout.PAGE_END);

        frame.setVisible(true);
    }
}
