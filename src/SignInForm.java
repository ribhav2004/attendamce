import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInForm extends JFrame implements ActionListener {
    private JTextField studentNameField, parentsNameField, addressField, emailField, semesterField;
    private JPasswordField passwordField;
    private JButton submitButton;

    public SignInForm() {
        // Set up the frame
        setTitle("Student Sign-In Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Create labels and text fields
        add(new JLabel("Student Name:"));
        studentNameField = new JTextField();
        add(studentNameField);

        add(new JLabel("Parents Name:"));
        parentsNameField = new JTextField();
        add(parentsNameField);



        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        add(new JLabel("Semester:"));
        semesterField = new JTextField();
        add(semesterField);

        // Create and add the submit button
        submitButton = new JButton("Submit");
        add(submitButton);

        // Add action listener to the button
        submitButton.addActionListener(this);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve data from the fields
        String studentName = studentNameField.getText();
        String parentsName = parentsNameField.getText();
        String address = addressField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String semester = semesterField.getText();

        // Display the collected data (for demonstration purposes)
        JOptionPane.showMessageDialog(this, "Student Name: " + studentName + "\nParents Name: " + parentsName +
                "\nAddress: " + address + "\nEmail: " + email + "\nPassword: " + password + "\nSemester: " + semester);
    }

    public static void main(String[] args) {
        new SignInForm();
    }
}
