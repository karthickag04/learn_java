import java.awt.*;
import java.awt.event.*;

public class CalculatorFrame extends Frame {
    TextField display;
    StringBuilder expression;
    CalculatorLogic logic ;

    public CalculatorFrame(String title) {
        setTitle(title);
        setSize(300, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        expression = new StringBuilder();
        logic = new CalculatorLogic();

        display = new TextField();
        display.setBounds(20, 50, 260, 40);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        int x = 20, y = 110;
        ButtonHandler handler = new ButtonHandler(this);

        for (int i = 0; i < buttonLabels.length; i++) {
            Button btn = new Button(buttonLabels[i]);
            btn.setBounds(x, y, 60, 40);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(handler);
            add(btn);

            x += 70;
            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 50;
            }
        }

        Button clearBtn = new Button("C");
        clearBtn.setBounds(20, y, 260, 40);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 18));
        clearBtn.setBackground(Color.RED);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(handler);
        add(clearBtn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void updateDisplay(String text) {
        display.setText(text);
    }

    public String getCurrentExpression() {
        return expression.toString();
    }

    public void appendToExpression(String value) {
        expression.append(value);
    }

    public void clearExpression() {
        expression.setLength(0);
    }

    public String evaluateExpression() {
        return logic.evaluate(expression.toString());
    }
}