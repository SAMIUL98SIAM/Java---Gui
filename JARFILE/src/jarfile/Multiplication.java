
package jarfile;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Multiplication extends JFrame {
     
    private ImageIcon img ;
    private Container color ;
    private JLabel nl , ilbl ;
    private JTextField tf ;
    private JButton mul , clear ;
    private JTextArea tr;
    private Cursor cursor ;
    private Font f1 , f2 ;
     
    public Multiplication()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1 = new Font("Arial",Font.BOLD+Font.ITALIC,14);
        img = new ImageIcon(getClass().getResource("M.png"));
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.pink);
        ilbl =  new JLabel(img);
        ilbl.setBounds(10,15,400,300);
        color.add(ilbl);
        
        nl = new JLabel("ENTER THE NUMBER FOR MULTPLICATION TABLE: ");
        nl.setBounds(20,330, 360, 30);
        nl.setForeground(Color.red);
        nl.setFont(f1);
        color.add(nl);
        
        tf = new JTextField();
        tf.setBounds(390, 330,100, 40);
        tf.setForeground(Color.cyan);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.black);
        tf.setFont(f1);
        color.add(tf);
        
        
        cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
        mul = new JButton("MULTIPLY X ");
        mul.setBounds(390,40,126,50);
        mul.setForeground(Color.red);
        mul.setBackground(Color.green);
        mul.setFont(f1);
        mul.setCursor(cursor);
        color.add(mul);
        f2 = new Font("Arial",Font.TRUETYPE_FONT,17);
        mul.addActionListener(new ActionListener()
                {
                   
                    public void actionPerformed(ActionEvent e)
                    {
                        
                        //
                        //String file = tr.getText();
                        String file1 = tf.getText();
                        if(file1.isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,"YOU DIDN'T WRITE THE NUMBER");
                        }
                        else {
                            tr.setText("");
                            int num = Integer.parseInt(tf.getText());
                        for (int i = 1; i <= 10; i++) {
                            int mul = num*i ;
                            
                            String m = String.valueOf(mul);
                            String n = String.valueOf(num);
                            String ic = String.valueOf(i);
                            tr.append(n+" X "+ic+" = "+m+"\n");
                            //tr.append(n+" X "+ic+" = "+m+"\n");
                        }
                        }
                        
                        
                    }
                }
        );
        
        clear = new JButton("CLEAR");
        clear.setBounds(405,150,110,50);
        clear.setForeground(Color.red);
        clear.setBackground(Color.green);
        clear.setFont(f1);
        clear.setCursor(cursor);
        color.add(clear);
        clear.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        tr.setText("");
                        tf.setText("");
                    }
                }
        );
        
        
        tr = new JTextArea();
        tr.setBounds(10,400,300,490);
        tr.setForeground(Color.black);
        tr.setFont(f2);
        tr.setBackground(Color.green);
        color.add(tr);
    }
     
    
   /* public void getIamgeicon()
    {
        
    }
    
    public void Contain()
    {
        
    }
    
    public void getJall()
    {*/
        
        
    
    

    
   
    
}
