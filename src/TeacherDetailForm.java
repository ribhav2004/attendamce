import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TeacherDetailForm extends JFrame implements ActionListener {
    private JTextField NMF;
    private JTextField EMF;
    private JTextField IDF;
    private JLabel JL1;
    private JPasswordField PASSF;
    private JTextField SMF;
    private JLabel JL4;
    private JLabel JL5;
    private JButton SUBMITButton;
    private JLabel JL2;
    private JLabel JL3;

    public TeacherDetailForm(){
     setTitle("Teacher Detail Form");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setSize(300,200);
     setVisible(true);
     setLocationRelativeTo(null);
     setLayout(new GridLayout(6,2));
     add(JL1);
     add(NMF);
     add(JL2);
     add(IDF);
     add(JL3);
     add(PASSF);
     add(JL4);
     add(SMF);
     add(JL5);
     add(EMF);
     add(SUBMITButton);
 }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = NMF.getText();
        String id=IDF.getText();
        String pswd= new String(PASSF.getPassword());
        String sub= SMF.getText();
        String eml=EMF.getText();

    }

    public static void main(String[] args) {
        TeacherDetailForm t= new TeacherDetailForm();
    }
}
