import javax.swing.JFrame;

public class StudentManageMent extends JFrame
{
    public static void main(String[] args) {
      StudentManageMent studentManageMent = new StudentManageMent();
        studentManageMent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentManageMent.setBounds(800,800,800,800);
        studentManageMent.setSize(780,780);
        studentManageMent.setLocationRelativeTo(null);
        studentManageMent.setTitle("Student List");
    }
}
