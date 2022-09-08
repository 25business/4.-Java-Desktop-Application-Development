import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Padajuce liste 2");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Person[] people = new Person[] {
          new Person(1, "John", "Smith", 27),
          new Person(2, "Jane", "Lilith", 25),
          new Person(3, "Mark", "Hoarst", 31)
        };

        JComboBox<Person> people_combo = new JComboBox<>(people);
        people_combo.setBounds(10,10,200,25);

        JButton button_age = new JButton("Get age");
        button_age.setBounds(10, 40, 100, 25);

        button_age.addActionListener(actionEvent -> {
            Person person = (Person)people_combo.getSelectedItem();
            JOptionPane.showMessageDialog(null,
                    String.format("%s %s is %d old.",
                            person.getFirst_name(),
                            person.getLast_name(),
                            person.getAge()));
        });

        frame.add(people_combo);
        frame.add(button_age);
        frame.setVisible(true);
    }
}
