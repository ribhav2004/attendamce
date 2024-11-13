import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GmailLoginForm extends JFrame implements ActionListener {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public GmailLoginForm() {
        // Set up the frame
        setTitle("Gmail Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Create labels and text fields
        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        // Create and add the login button
        loginButton = new JButton("Login");
        add(loginButton);

        // Add action listener to the button
        loginButton.addActionListener(this);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve data from the fields
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Display the collected data (for demonstration purposes)
        JOptionPane.showMessageDialog(this, "Email: " + email + "\nPassword: " + password);
    }

    public static void main(String[] args) {
        new GmailLoginForm();
    }
}

