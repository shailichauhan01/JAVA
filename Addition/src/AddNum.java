import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNum extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    public AddNum() {
        super("Add Numbers");

        l1 = new JLabel("First Value:");
        l2 = new JLabel("Second Value:");
        l3 = new JLabel("Result:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        b1 = new JButton("Add");

        setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);
        b1.addActionListener(this);

        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Ensures the application exits when the window is closed
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int x = Integer.parseInt(t1.getText());  // Corrected typo here
            int y = Integer.parseInt(t2.getText());  // Corrected typo here
            int sum = x + y;
            t3.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");  // Handles non-numeric input gracefully
        }
    }

    public static void main(String[] args) {
        new AddNum();
    }
}
