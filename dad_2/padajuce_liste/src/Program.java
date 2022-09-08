import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Padajuce liste");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        String[] cities = new String[] {
          "New York",
          "Amsterdam",
          "Lisabon"
        };

        JComboBox<String> cities_combo = new JComboBox<>(cities);
        cities_combo.setBounds(10,10,200,25);
        cities_combo.addItem("Moscow");
        cities_combo.setSelectedIndex(2);
        //cities_combo.setEditable(true);

        JButton button_choice = new JButton("Choose");
        button_choice.setBounds(10,40,100,25);
        button_choice.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(null,
                    "You chose: " + cities_combo.getSelectedItem());
        });

        frame.add(cities_combo);
        frame.add(button_choice);
        frame.setVisible(true);
    }
}
