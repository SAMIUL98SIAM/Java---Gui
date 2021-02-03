package jfframe;


import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
 
  public class Jfram1 extends JFrame
  {
      private ImageIcon img1,img2,img3;
      private Container color;
      private Font font1,font2;
      private JLabel pic1, pic2, first_name,last_name,pass;
      private JTextField text1,text2,login;
      
      public Jfram1()
      {
          setImageicon();
          setContainer();
          setJlabel();
          setJtexfield();
      }
      
      public void setImageicon()
      {
          img1 = new ImageIcon(getClass().getResource("Cal.png"));
          this.setIconImage(img1.getImage());
          img2 = new ImageIcon(getClass().getResource("Freddie.png"));
          img3 = new ImageIcon(getClass().getResource("F_1.png"));
      }
      
      public void setContainer()
      {
          color = this.getContentPane();
          color.setLayout(null);
          color.setBackground(Color.pink);
      }
      
      public void setJlabel()
      {
          font1 = new Font("Arial",Font.BOLD+Font.ITALIC,14);
          pic1 = new JLabel(img2);
          pic1.setBounds(60,15,250,250);
          color.add(pic1);
          
          pic2 = new JLabel(img3);
          pic2.setBounds(360,15,250,250);
          color.add(pic2);
          
          first_name = new JLabel("Enter your first name: ");
          first_name.setBounds(60,300,180,50);
          first_name.setFont(font1);
          first_name.setForeground(Color.CYAN);
          first_name.setOpaque(true);
          first_name.setBackground(Color.red);
          color.add(first_name);
          
          last_name = new JLabel("Enter your first name: ");
          last_name.setBounds(60,400,180,50);
          last_name.setFont(font1);
          last_name.setForeground(Color.CYAN);
          last_name.setOpaque(true);
          last_name.setBackground(Color.red);
          color.add(last_name);
          
          pass = new JLabel("Enter your password to login: ");
          pass.setBounds(60,550,230,60);
          pass.setFont(font1);
          pass.setForeground(Color.yellow);
          pass.setOpaque(true);
          pass.setBackground(Color.blue);
          color.add(pass);
 
      }
      
      public void setJtexfield()
      {
          font2 = new Font("Arial",Font.HANGING_BASELINE+Font.ITALIC,15);
          text1 = new JTextField();
          text1.setBounds(250, 300,150,50);
          text1.setFont(font2);
          text1.setHorizontalAlignment(JTextField.CENTER);
          text1.setForeground(Color.GREEN);
          text1.setBackground(Color.blue);
          color.add(text1);
          
          text2 = new JTextField();
          text2.setBounds(250, 400,150,50);
          text2.setFont(font2);
          text2.setHorizontalAlignment(JTextField.CENTER);
          text2.setForeground(Color.GREEN);
          text2.setBackground(Color.blue);
          color.add(text2);
          text2.addActionListener(new ActionListener()
                 {
                    public void actionPerformed(ActionEvent e)
                     {
                         String name = text2.getText();
                        if(name.isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,"YOU didnt nothing");
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null,"Last name is: "+name,"Information",2);
                        }
                     }
                 });
          
          login = new JTextField();
          login.setBounds(320, 550,159,60);
          login.setFont(font2);
          login.setHorizontalAlignment(JTextField.CENTER);
          login.setForeground(Color.black);
          login.setBackground(Color.red);
          color.add(login);
          login.addActionListener(new ActionListener()
                 {
                    public void actionPerformed(ActionEvent e)
                     {
                         String pass = login.getText();
                        if(pass.equals("2980abul"))
                        {
                            JOptionPane.showMessageDialog(null,"Successeflly entry","Login",-1,img3);
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null,"Invalid","Login",2);
                        }
                     }
                 });
      }
      
      public static void main(String[] args) {
          Jfram1 j1 = new Jfram1();  
          j1.setVisible(true);
          j1.setDefaultCloseOperation(EXIT_ON_CLOSE);
          j1.setBounds(900,700,900,900);
          j1.setResizable(false);
          j1.setTitle("Samiul Hoque Profile");
      }
  }

