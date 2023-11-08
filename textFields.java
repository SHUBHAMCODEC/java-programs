import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Integer Division");
        JPanel panel = new JPanel(new GridLayout(3, 2));
        JTextField num1 = new JTextField(6);
        JTextField num2 = new JTextField(6);
        JTextField result = new JTextField(6);
        JButton divide = new JButton("Divide");
        panel.add(new JLabel("Num1:"));
        panel.add(num1);
        panel.add(new JLabel("Num2:"));
        panel.add(num2);
        panel.add(new JLabel("Result:"));
        panel.add(result);
        panel.add(divide);
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    result.setText(Integer.toString(n1 / n2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
