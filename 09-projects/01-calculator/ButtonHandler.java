import java.awt.event.*;

public class ButtonHandler implements ActionListener {
    CalculatorFrame frame;

    public ButtonHandler(CalculatorFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                String result = frame.evaluateExpression();
                frame.updateDisplay(result);
                frame.clearExpression();
                frame.appendToExpression(result);
                break;
            case "C":
                frame.clearExpression();
                frame.updateDisplay("");
                break;
            default:
                frame.appendToExpression(command);
                frame.updateDisplay(frame.getCurrentExpression());
        }
    }
}