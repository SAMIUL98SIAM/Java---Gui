import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JScrollBar.*;


public class Login extends JFrame {
    private ImageIcon img1 , img2 , img3 ;
    private Container color ;
    private JLabel username , password ;
    private JTextField usertField ;
    private JPasswordField passField;
    private JButton login , clear ;
    private JTextArea area ;
    private Font font1 , font2 ;
    private JScrollPane scroll ,scroll1;
    private Cursor cursor;
    private ScrollPane scrol;
    public Login()
    {
        getImageIcon();
        getContainn();
        getJTextfield_Pass_button();
    }

    public void getImageIcon()
    {
        img1 = new ImageIcon(getClass().getResource("Acc.png"));
        this.setIconImage(img1.getImage());


    }

    public void getContainn()
    {
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.cyan);
    }

    public void getJTextfield_Pass_button()
    {
        cursor = new Cursor(Cursor.N_RESIZE_CURSOR);
        font1 = new Font("Arial",Font.ITALIC+Font.BOLD,20);
        username = new JLabel("USERNAME: ");
        username.setForeground(Color.RED);
        username.setFont(font1);
        username.setBounds(15,55,150,30);
        color.add(username);
        password = new JLabel("PASSWORD: ");
        password.setForeground(Color.BLUE);
        password.setFont(font1);
        password.setBounds(15,140,150,30);
        color.add(password);

        usertField = new JTextField();
        usertField.setForeground(Color.RED);
        usertField.setFont(font1);
        color.add(usertField);
       
        usertField.setBounds(150,55,150,30);


        passField = new JPasswordField();
        passField.setFont(font1);
        passField.setForeground(Color.black);
        color.add(passField);
        passField.setBounds(150,140,150,35);
        color.add(passField);

        login  = new JButton("LOGIN");
        login.setBounds(50,280,100,40);
        login.setForeground(Color.GREEN);
        login.setOpaque(true);
        login.setBackground(Color.YELLOW);
        login.setCursor(cursor);
        color.add(login);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
              {
                 String l = usertField.getText();
                  String p = passField.getText();
                  if(l.equals("Samiul")&&p.equals("2980"))
                  {
                      JOptionPane.showMessageDialog(null, "You enter your account successfully", "Bank Account Login", 1);
                      dispose();
                      Account a1 = new Account();
                      a1.setVisible(true);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,"Invaild","Bank Account Login",1);
                  }
              }
        });
        clear  = new JButton("CLEAR");
        clear.setBounds(250,280,100,40);
        clear.setForeground(Color.GREEN);
        clear.setOpaque(true);
        clear.setBackground(Color.YELLOW);
        clear.setCursor(cursor);
        color.add(clear);
        clear.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e)
                 {
                     usertField.setText("");
                     passField.setText("");
                 }
        });

    }

    public static void main(String[] args)
    {

        Login login = new Login();
        login.setVisible(true);
        login.setBounds(400,400,500,500);
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        login.setResizable(false);
        login.setTitle("Bank Account Login!!!");
    }

}
