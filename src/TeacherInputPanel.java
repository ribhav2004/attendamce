import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherInputPanel extends JPanel implements ActionListener {
    private JTextField studentIdField, dateField, subjectField;
    private JRadioButton presentRadioButton, absentRadioButton;
    private JButton submitButton;

    public TeacherInputPanel() {
        setLayout(new GridLayout(5, 2));

        // Create input fields and labels
        add(new JLabel("Student ID:"));
        studentIdField = new JTextField();
        add(studentIdField);

        add(new JLabel("Date (YYYY-MM-DD):"));
        dateField = new JTextField();
        add(dateField);

        add(new JLabel("Subject:"));
        subjectField = new JTextField();
        add(subjectField);

        // Radio buttons for attendance
        ButtonGroup attendanceGroup = new ButtonGroup();
        presentRadioButton = new JRadioButton("Present");
        absentRadioButton = new JRadioButton("Absent");
        attendanceGroup.add(presentRadioButton);
        attendanceGroup.add(absentRadioButton);

        add(new JLabel("Attendance:"));
        JPanel radioPanel = new JPanel();
        radioPanel.add(presentRadioButton);
        radioPanel.add(absentRadioButton);
        add(radioPanel);

        // Submit button
        submitButton = new JButton("Submit");
        add(submitButton);
        submitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve data from the fields
        String studentId = studentIdField.getText();
        String date = dateField.getText();
        String subject = subjectField.getText();
        String attendance = presentRadioButton.isSelected() ? "Present" : "Absent";

        // Display the collected data (for demonstration purposes)
        JOptionPane.showMessageDialog(this, "Student ID: " + studentId + "\nDate: " + date +
                "\nSubject: " + subject + "\nAttendance: " + attendance);
    }
}
