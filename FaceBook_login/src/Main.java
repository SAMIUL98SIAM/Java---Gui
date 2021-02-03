import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private ImageIcon img1,img2;
    private Container color;
    private JLabel facebook,email,password ,pic1;
    private JTextField email1;
    private JPasswordField password1;
    private  Font font1 , font2 ,font3 ;
    public Main()
    {
        getImageicon();
        getContainer();
        getJLabel();
        getJtextfield();
    }

    public  void getImageicon()
    {
        img1 = new ImageIcon(getClass().getResource("F1.png"));
        this.setIconImage(img1.getImage());
        img2 = new ImageIcon(getClass().getResource("F3.png"));
    }

    public  void getContainer()
    {
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.BLUE);
        getJpasswordfield();
    }

    public void getJLabel()
    {
        font1 = new Font("Arial",Font.BOLD,33);
        facebook = new JLabel("Facebook");
        facebook.setBounds(12,15,178,50);
        facebook.setFont(font1);
        facebook.setForeground(Color.WHITE);
        facebook.setOpaque(true);
        facebook.setBackground(Color.BLACK);
        color.add(facebook);


        email = new JLabel("Email or Phone: ");
        email.setBounds(540,15,100,25);
        email.setForeground(Color.WHITE);
        color.add(email);

        password = new JLabel("Password: ");
        password.setBounds(730,15,100,25);
        password.setForeground(Color.WHITE);
        color.add(password);

        pic1 = new JLabel(img2);
        pic1.setBounds(100,400,600,600);
        color.add(pic1);
    }

    public  void getJtextfield()
    {
        font2 = new Font("Arial",Font.BOLD,14);
        email1 = new JTextField();
        email1.setBounds(540,45,150,30);
        email1.setFont(font2);
        email1.setForeground(Color.black);
        email1.setOpaque(true);
        email1.setBackground(Color.WHITE);
        color.add(email1);
        email1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String mail = email1.getText();
                if(mail.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"EMAIL FIELD IS EMPTY","Facbook",2,img1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"PLEASE FILL THE PASSWORD FIELD","Facbook",1,img1);
                }
            }

        });
    }

    public void getJpasswordfield()
    {
        font3 = new Font ("Arial",Font.BOLD,16);
        password1 = new JPasswordField();
        password1.setBounds(720,45,160,30);
        password1.setFont(font3);
        password1.setForeground(Color.black);
        password1.setOpaque(true);
        color.add(password1);
        password1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                String pass = password1.getText();
                if(pass.equals("2980sami"))
                {
                    JOptionPane.showMessageDialog(null,"FaceBook Login Successfully","Facebook",1,img1);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"INVALID PASSWORD","Facebook",2,img1);
                }
            }
        });
    }

    public static void main(String[] args) {
        Main jframe = new Main();
        jframe.setVisible(true);
        jframe.setBounds(900,700,900,800);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setTitle("Facebook");
    }
}
