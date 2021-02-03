package jfframe;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;

public class JfrrameDemo2 extends JFrame
{
    private ImageIcon img;
    private Container color ;
    private JLabel name,name1,pass,pass1;
    private Font font ;
    public JfrrameDemo2()
    {
        getImageicon();
        getContainer();
        getJlabel();
    }
    public void getImageicon()
    {
        img = new ImageIcon(getClass().getResource("Siam.png"));
        this.setIconImage(img.getImage());
    }
    public void getContainer()
    {
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.black);
    }
    public void getJlabel()
    {
        font = new Font("Arial",Font.ITALIC,14);
        name = new JLabel("Enter my name: ");
        name.setBounds(50, 20, 200, 60);
        name.setFont(font);
        name.setForeground(Color.red);
        name.setOpaque(true);
        name.setBackground(Color.blue);
        color.add(name);
        name.setToolTipText("My name is Siam");
        String s = name.getToolTipText();
        
        name1 = new JLabel(s);
        name1.setBounds(50,70,200,60);
        name1.setFont(font);
        name1.setForeground(Color.red);
        name1.setOpaque(true);
        name1.setBackground(Color.blue);
        color.add(name1);
                
        pass = new JLabel("Enter my pass: ");
        pass.setBounds(50, 180, 200, 60);
        pass.setFont(font);
        pass.setForeground(Color.red);
        pass.setOpaque(true);
        pass.setBackground(Color.blue);
        color.add(pass);
        pass.setToolTipText("My password is 1111");
        String s1 =pass.getToolTipText();
        
        pass1 = new JLabel(s1);
        pass1.setBounds(50,300,200,60);
        pass1.setFont(font);
        pass1.setForeground(Color.blue);
        pass1.setOpaque(true);
        pass1.setBackground(Color.MAGENTA);
        color.add(pass1);
    }
    public static void main(String[] args) {
        JfrrameDemo2 jframe  = new JfrrameDemo2();
        jframe.setVisible(true);
        jframe.setBounds(400,400,400,400);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jframe.setResizable(false);
    }
}
    
    

