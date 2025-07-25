import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class AdvancedCalculator extends Frame implements ActionListener {
    TextField display;
    StringBuilder expression;

    public AdvancedCalculator() {
        setTitle("AWT Calculator");
        setSize(300, 400);
        setLayout(null);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        expression = new StringBuilder();

        display = new TextField();
        display.setBounds(20, 50, 260, 40);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display);

        // Buttons (Number Pad + Operations)
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        int x = 20, y = 110;
        for (int i = 0; i < buttonLabels.length; i++) {
            Button btn = new Button(buttonLabels[i]);
            btn.setBounds(x, y, 60, 40);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            add(btn);

            x += 70;
            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 50;
            }
        }

        // Clear Button
        Button clearBtn = new Button("C");
        clearBtn.setBounds(20, y, 260, 40);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 18));
        clearBtn.setBackground(Color.RED);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(this);
        add(clearBtn);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }


    
    public AdvancedCalculator(String title) {
        setTitle(title);
        setSize(300, 400);
        setLayout(null);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        expression = new StringBuilder();

        display = new TextField();
        display.setBounds(20, 50, 260, 40);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display);

        // Buttons (Number Pad + Operations)
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        int x = 20, y = 110;
        for (int i = 0; i < buttonLabels.length; i++) {
            Button btn = new Button(buttonLabels[i]);
            btn.setBounds(x, y, 60, 40);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            add(btn);

            x += 70;
            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 50;
            }
        }

        // Clear Button
        Button clearBtn = new Button("C");
        clearBtn.setBounds(20, y, 260, 40);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 18));
        clearBtn.setBackground(Color.RED);
        clearBtn.setForeground(Color.WHITE);
        clearBtn.addActionListener(this);
        add(clearBtn);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("=")) {
            try {
                String result = evaluateExpression(expression.toString());
                display.setText(result);
                expression = new StringBuilder(result); // Use result for next calculation
            } catch (Exception ex) {
                display.setText("Error");
                expression = new StringBuilder();
            }
        } else if (cmd.equals("C")) {
            expression.setLength(0);
            display.setText("");
        } else {
            expression.append(cmd);
            display.setText(expression.toString());
        }
    }

    // Simple expression evaluator (supporting +, -, *, /)
    public String evaluateExpression(String expr) {
        // Using JavaScript engine for simplicity
        try {
            javax.script.ScriptEngineManager mgr = new javax.script.ScriptEngineManager();
            javax.script.ScriptEngine engine = mgr.getEngineByName("JavaScript");
            Object result = engine.eval(expr);
            return result.toString();
        } catch (Exception e) {
            return "Error";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("choose  the option to run the calculator, /n/t1 for default title, /n/t2 for custom title: .... ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        if (choice == 1) {
            new AdvancedCalculator();
            
        } else if (choice == 2) {
            System.out.print("Enter the title for the calculator: ");
            String title = scanner.nextLine();
            new AdvancedCalculator(title);
        } else {
            System.out.println("Invalid choice. Exiting.");
            return;
        }
       
       
    }
}
