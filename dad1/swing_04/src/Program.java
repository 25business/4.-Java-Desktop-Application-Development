import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Konverter");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JTextField text_value = new JTextField();
        JLabel label_rsd = new JLabel("RSD");

        JRadioButton currency_1 = new JRadioButton("EUR", true);
        JRadioButton currency_2 = new JRadioButton("USD");
        JRadioButton currency_3 = new JRadioButton("CAD");
        ButtonGroup currencies = new ButtonGroup();
        currencies.add(currency_1);
        currencies.add(currency_2);
        currencies.add(currency_3);

        JButton button_convert = new JButton("Convert");

        button_convert.addActionListener(actionEvent -> {
            double value = Double.parseDouble(text_value.getText());
            if(currency_1.isSelected()) {
                double conversion = value / 117.5;
                JOptionPane.showMessageDialog(null,String.format("%f RSD => %f EUR", value,conversion));
            }
            if(currency_2.isSelected()) {
                double conversion = value / 103;
                JOptionPane.showMessageDialog(null,String.format("%f RSD => %f USD", value,conversion));
            }
            if(currency_3.isSelected()) {
                double conversion = value / 95;
                JOptionPane.showMessageDialog(null,String.format("%f RSD => %f CAD", value,conversion));
            }
        });


        text_value.setBounds(10,10,100,25);
        label_rsd.setBounds(110, 10, 50, 25);
        currency_1.setBounds(10,45, 150,25);
        currency_2.setBounds(10,80, 150,25);
        currency_3.setBounds(10,115, 150,25);
        button_convert.setBounds(10, 150, 100, 25);

        frame.add(text_value);
        frame.add(label_rsd);
        frame.add(currency_1);
        frame.add(currency_2);
        frame.add(currency_3);
        frame.add(button_convert);

        frame.setVisible(true);
    }
}
