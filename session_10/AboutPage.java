import java.awt.*;
import java.awt.event.*;

public class AboutPage extends Frame implements ActionListener {

    AboutPage() {
        // Set frame title and layout
        setTitle("Trymeyourself - About");
        setSize(1200, 600);
        setLayout(null);
        setResizable(true);

        // Add a heading label
        Label heading = new Label("About This Application", Label.CENTER);
        heading.setBounds(50, 50, 300, 30);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        add(heading);

        // Add a multi-line description using TextArea
        TextArea description = new TextArea(
            "This application is designed for demonstration purposes.\n" +
            "It uses Java AWT components to build a simple GUI.\n\n" +
            "Created by: Your Name\nVersion: 1.0", 
            5, 40, TextArea.SCROLLBARS_BOTH);
        description.setBounds(50, 100, 300, 100);
        description.setEditable(false);
        add(description);

        // Add a Close button
        Button closeBtn = new Button("Close");
        closeBtn.setBounds(160, 220, 80, 30);


        closeBtn.addActionListener(this);
        add(closeBtn);
        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose(); // Close the window when "Close" is clicked
    }

    public static void main(String[] args) {
        new AboutPage();
    }
}
