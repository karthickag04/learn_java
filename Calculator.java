import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    // Components
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;

    public Calculator() {
        // Set frame title and layout
        setTitle("AWT Calculator");
        setSize(400, 250);
        setLayout(null);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create components
        Label l1 = new Label("Number 1:");
        l1.setBounds(50, 50, 80, 20);
        add(l1);

        num1 = new TextField();
        num1.setBounds(140, 50, 200, 25);
        add(num1);

        Label l2 = new Label("Number 2:");
        l2.setBounds(50, 90, 80, 20);
        add(l2);

        num2 = new TextField();
        num2.setBounds(140, 90, 200, 25);
        add(num2);

        add = new Button("Add");
        add.setBounds(50, 130, 70, 30);
        add.addActionListener(this);
        add(add);

        subtract = new Button("Subtract");
        subtract.setBounds(130, 130, 70, 30);
        subtract.addActionListener(this);
        add(subtract);

        multiply = new Button("Multiply");
        multiply.setBounds(210, 130, 70, 30);
        multiply.addActionListener(this);
        add(multiply);

        divide = new Button("Divide");
        divide.setBounds(290, 130, 70, 30);
        divide.addActionListener(this);
        add(divide);

        Label l3 = new Label("Result:");
        l3.setBounds(50, 180, 80, 20);
        add(l3);

        result = new TextField();
        result.setBounds(140, 180, 200, 25);
        result.setEditable(false);
        add(result);

        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = num1.getText();
        String s2 = num2.getText();
        double a, b, res = 0;

        try {
            a = Double.parseDouble(s1);
            b = Double.parseDouble(s2);

            if (e.getSource() == add) {
                res = a + b;
            } else if (e.getSource() == subtract) {
                res = a - b;
            } else if (e.getSource() == multiply) {
                res = a * b;
            } else if (e.getSource() == divide) {
                if (b == 0) {
                    result.setText("Error: Division by zero");
                    return;
                }
                res = a / b;
            }

            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Error: Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
