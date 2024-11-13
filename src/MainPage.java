import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame implements ActionListener {
    private JButton studentDetailsButton, attendanceCheckButton, syllabusButton;

    public MainPage() {
        // Set up the frame
        setTitle("Main Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        // Create buttons
        studentDetailsButton = new JButton("Student Details");
        attendanceCheckButton = new JButton("Attendance Check");
        syllabusButton = new JButton("Syllabus");

        // Add buttons to the frame
        add(studentDetailsButton);
        add(attendanceCheckButton);
        add(syllabusButton);

        // Add action listeners to the buttons
        studentDetailsButton.addActionListener(this);
        attendanceCheckButton.addActionListener(this);
        syllabusButton.addActionListener(this);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == studentDetailsButton) {
            JOptionPane.showMessageDialog(this, "Student Details Button Clicked");
        } else if (e.getSource() == attendanceCheckButton) {
            JOptionPane.showMessageDialog(this, "Attendance Check Button Clicked");
        } else if (e.getSource() == syllabusButton) {
            JOptionPane.showMessageDialog(this, "Syllabus Button Clicked");
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}

