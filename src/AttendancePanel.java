import javax.swing.*;
import java.awt.*;

public class AttendancePanel extends JPanel {
    public AttendancePanel() {
        setLayout(new BorderLayout());

        // Title label
        JLabel titleLabel = new JLabel("Student Attendance", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        // Table to display attendance
        String[] columnNames = {"Date", "Subject", "Attendance"};
        Object[][] data = {
                {"2024-11-11", "cse", "Present"},
                {"2024-11-21", "java", "Absent"},
                {"2024-11-12", "", "Present"},
                {"2024-11-32", "Biology", "Present"},
                // Add more rows as needed
        };

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Panel for student details
        JPanel detailsPanel = new JPanel(new GridLayout(2, 1));
        JLabel studentNameLabel = new JLabel("Name: John Doe");
        JLabel studentIdLabel = new JLabel("Student ID: 123456");
        detailsPanel.add(studentNameLabel);
        detailsPanel.add(studentIdLabel);
        add(detailsPanel, BorderLayout.SOUTH);
    }
}
