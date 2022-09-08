import javax.swing.*;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Konverter");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        String[] cities = new String[]{
                "Los Angeles", "New York", "Toronto", "Berlin",
                "Bern", "Paris", "Moscow", "Peking", "Tokyo"
        };
        JList<String> cities_list = new JList<>(cities);
        cities_list.setBounds(10,10, 200, 200);
        cities_list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton button_choose = new JButton("Choose");
        button_choose.setBounds(10, 205, 100, 25);
        button_choose.addActionListener( actionEvent -> {
            var selected_items = cities_list.getSelectedValuesList();
            String output = "";
            for(String item : selected_items) output += item + "\n";
            JOptionPane.showMessageDialog(null, "You chose:\n" + output);
        });

        frame.add(cities_list);
        frame.add(button_choose);
        frame.setVisible(true);
    }
}
