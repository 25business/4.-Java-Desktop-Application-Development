import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Labele
        JLabel label_x = new JLabel("x:");
        JLabel label_y = new JLabel("y:");
        JLabel label_result = new JLabel("Result:");

        //TextFields
        JTextField text_x = new JTextField();
        JTextField text_y = new JTextField();
        JTextField text_result = new JTextField();

        //Buttons
        JButton button_add = new JButton("+");
        JButton button_sub = new JButton("-");
        JButton button_mul = new JButton("*");
        JButton button_div = new JButton("/");

        // Pozicioniranje
        label_x.setBounds(10,10,30,20);
        text_x.setBounds(40,10,50,20);
        label_y.setBounds(10,40,30,20);
        text_y.setBounds(40,40,50,20);
        button_add.setBounds(40,70,50,20);
        button_sub.setBounds(100,70,50,20);
        button_mul.setBounds(160,70,50,20);
        button_div.setBounds(220,70,50,20);
        label_result.setBounds(10, 100, 80, 20);
        text_result.setBounds(100, 100, 50, 20);

        button_add.addActionListener(
                new CalculatorAction("+", text_x, text_y, text_result)
        );
        button_sub.addActionListener(
                new CalculatorAction("-", text_x, text_y, text_result)
        );
        button_mul.addActionListener(
                new CalculatorAction("*", text_x, text_y, text_result)
        );
        button_div.addActionListener(
                new CalculatorAction("/", text_x, text_y, text_result)
        );

        frame.add(label_x);
        frame.add(label_y);
        frame.add(label_result);
        frame.add(text_x);
        frame.add(text_y);
        frame.add(text_result);
        frame.add(button_add);
        frame.add(button_sub);
        frame.add(button_mul);
        frame.add(button_div);


        frame.setVisible(true);
    }
}
