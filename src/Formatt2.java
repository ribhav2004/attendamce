import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formatt2 extends JFrame implements ActionListener {
    private JButton studentDetailsButton, attendanceCheckButton, syllabusButton, teacherInputButton;
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Formatt2() {
        // Set up the frame
        setTitle("Main Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Home panel with buttons
        JPanel homePanel = new JPanel(new GridLayout(4, 1));
        studentDetailsButton = new JButton("Student Details");
        attendanceCheckButton = new JButton("Attendance Check");
        syllabusButton = new JButton("Syllabus");
        teacherInputButton = new JButton("Teacher Input");

        homePanel.add(studentDetailsButton);
        homePanel.add(attendanceCheckButton);
        homePanel.add(syllabusButton);
        homePanel.add(teacherInputButton);

        // Add action listeners to the buttons
        studentDetailsButton.addActionListener(this);
        attendanceCheckButton.addActionListener(this);
        syllabusButton.addActionListener(this);
        teacherInputButton.addActionListener(this);

        // Add panels to main panel
        mainPanel.add(homePanel, "Home");
        mainPanel.add(new AttendancePanel(), "Attendance");
        mainPanel.add(new TeacherInputPanel(), "TeacherInput");

        // Set the panel as the content pane
        setContentPane(mainPanel);

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
            cardLayout.show(mainPanel, "Attendance");
        } else if (e.getSource() == syllabusButton) {
            JOptionPane.showMessageDialog(this, "Syllabus Button Clicked");
        } else if (e.getSource() == teacherInputButton) {
            cardLayout.show(mainPanel, "TeacherInput");
        }
    }

    public static void main(String[] args) {
        new Formatt2();
    }
}
