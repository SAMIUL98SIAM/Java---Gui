
package jfframe;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.Font;

public class JframDemo extends JFrame {
    private ImageIcon img ;
    private Container color;
    private JLabel nameLabel,ansNameLabel,passLabel,passLabel1 ;
    private Font f;
    JframDemo()
    {
         getImageicon();
         getContainer();
         getJlabel();
    }
    
    public void getImageicon()
    {
        img = new ImageIcon(getClass().getResource("Cal.png"));
        this.setIconImage(img.getImage());
    }
    public void getContainer()
    {
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.pink);
    }
    public void getJlabel()
    {
        f = new Font("Arial",Font.ITALIC,14);
        nameLabel = new JLabel("Enter your name: ");
        nameLabel.setBounds(50, 20, 200, 60);
        nameLabel.setFont(f);
        nameLabel.setForeground(Color.blue);
       nameLabel.setOpaque(true);
        nameLabel.setBackground(Color.red);
        nameLabel.setToolTipText("My name is Siam");
        color.add(nameLabel);
        String s = nameLabel.getToolTipText();
        ansNameLabel = new JLabel(s);
        ansNameLabel.setBounds(50, 90, 200, 60);
        ansNameLabel.setFont(f);
        ansNameLabel.setForeground(Color.red);
        ansNameLabel.setOpaque(true);
        ansNameLabel.setBackground(Color.blue);
        color.add(ansNameLabel);
        passLabel = new JLabel("Enter your password: ");
        passLabel.setBounds(50, 160, 200, 60);
        passLabel.setFont(f);
        passLabel.setForeground(Color.red);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.blue);
        passLabel.setToolTipText("Pasword is 1111");
        color.add(passLabel);
        String s1 = passLabel.getToolTipText();
        passLabel1 = new JLabel(s1);
        passLabel1.setBounds(50,230,200,60);
        passLabel.setFont(f);
        passLabel.setForeground(Color.red);
       passLabel1.setOpaque(true);
        passLabel.setBackground(Color.blue);
        color.add(passLabel1);
    }
            
    public static void main(String[] args) {
        JframDemo jframe =  new JframDemo();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setBounds(400, 400,400, 400);
        jframe.setResizable(false);
 
    }
    
}
