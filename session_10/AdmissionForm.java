import java.awt.*;
import java.awt.event.*;

public class AdmissionForm extends Frame implements ActionListener {

    // Form elements
    Label lblName, lblAge, lblGender, lblCourse, lblEmail, lblMobile, lblAddress;
    TextField txtName, txtAge, txtEmail, txtMobile;
    TextArea txtAddress;
    Choice genderChoice, courseChoice;
    Button submitBtn;

    AdmissionForm() {
        setTitle("Admission Form");
        setSize(400, 500);
        setLayout(null);
        setResizable(false);

        // Labels and Fields

        lblName = new Label("Student Name:");
        lblName.setBounds(50, 50, 100, 20);
        add(lblName);

        txtName = new TextField();
        txtName.setBounds(180, 50, 150, 20);
        add(txtName);

        lblAge = new Label("Age:");
        lblAge.setBounds(50, 90, 100, 20);
        add(lblAge);

        txtAge = new TextField();
        txtAge.setBounds(180, 90, 150, 20);
        add(txtAge);

        lblGender = new Label("Gender:");
        lblGender.setBounds(50, 130, 100, 20);
        add(lblGender);

        genderChoice = new Choice();
        genderChoice.add("Male");
        genderChoice.add("Female");
        genderChoice.add("Other");
        genderChoice.setBounds(180, 130, 150, 20);
        add(genderChoice);

        lblCourse = new Label("Course:");
        lblCourse.setBounds(50, 170, 100, 20);
        add(lblCourse);

        courseChoice = new Choice();
        courseChoice.add("BCA");
        courseChoice.add("B.Sc");
        courseChoice.add("B.Com");
        courseChoice.add("BA");
        courseChoice.add("Other");
        courseChoice.setBounds(180, 170, 150, 20);
        add(courseChoice);

        lblEmail = new Label("Email:");
        lblEmail.setBounds(50, 210, 100, 20);
        add(lblEmail);

        txtEmail = new TextField();
        txtEmail.setBounds(180, 210, 150, 20);
        add(txtEmail);

        lblMobile = new Label("Mobile:");
        lblMobile.setBounds(50, 250, 100, 20);
        add(lblMobile);

        txtMobile = new TextField();
        txtMobile.setBounds(180, 250, 150, 20);
        add(txtMobile);

        lblAddress = new Label("Address:");
        lblAddress.setBounds(50, 290, 100, 20);
        add(lblAddress);

        txtAddress = new TextArea();
        txtAddress.setBounds(180, 290, 150, 60);
        add(txtAddress);

        // Submit Button
        submitBtn = new Button("Submit");
        submitBtn.setBounds(150, 370, 80, 30);
        submitBtn.addActionListener(this);
        add(submitBtn);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // On submit
        String name = txtName.getText();
        String age = txtAge.getText();
        String gender = genderChoice.getSelectedItem();
        String course = courseChoice.getSelectedItem();
        String email = txtEmail.getText();
        String mobile = txtMobile.getText();
        String address = txtAddress.getText();

        System.out.println("===== Admission Form Data =====");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Course  : " + course);
        System.out.println("Email   : " + email);
        System.out.println("Mobile  : " + mobile);
        System.out.println("Address : " + address);
        System.out.println("================================");
        
        // Optionally show popup
        Dialog d = new Dialog(this, "Submitted!", true);
        d.setLayout(new FlowLayout());
        d.setSize(200, 100);
        d.add(new Label("Form submitted successfully!"));
        Button ok = new Button("OK");
        ok.addActionListener(ev -> d.setVisible(false));
        d.add(ok);
        d.setLocationRelativeTo(this);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new AdmissionForm();
    }
}
