
package jcomboitemlistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;




public class Main extends JFrame {
    
    private Container c;
    private JLabel gender , subjct;
    private JRadioButton mb , fb ,shb ;
    private ButtonGroup bg1 ;
    private JTextArea tr ;
    /*public Main()
    {
        InitComponant();
    }*/
    
    public Main()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        gender = new JLabel("Gender: ");
        gender.setBounds(20,30, 100,20);
        gender.setForeground(Color.red);
        c.add(gender);
        mb = new JRadioButton("MALE");
        mb.setBounds(130,30,100, 20);
        mb.setForeground(Color.red);
        mb.setBackground(Color.pink);
        c.add(mb);
        fb = new JRadioButton("FEMALE");
        fb.setBounds(130,50,100, 20);
        fb.setForeground(Color.red);
        fb.setBackground(Color.pink);
         c.add(fb);
        shb = new JRadioButton("SHMALE");
        shb.setBounds(130,70,100, 20);
        shb.setForeground(Color.red);
        shb.setBackground(Color.pink);
        c.add(shb);
        
        bg1.add(mb);
        bg1.add(fb);
        bg1.add(shb);
        
        Handler handler = new Handler();
        mb.addItemListener(handler);
        fb.addItemListener(handler);
        shb.addItemListener(handler);
        
        tr = new JTextArea();
        tr.setBounds(20,100,200,80);
        tr.setForeground(Color.blue);
        tr.setBackground(Color.green);
        c.add(tr);
    }
    class Handler implements ItemListener
    {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(mb.isSelected())
            {
               tr.setText("YOU'VE SELECTED MALE");
            }
            else if(fb.isSelected())
            {
                tr.setText("YOU'VE SELECTED FEMALE");
            }
            else if(shb.isSelected())
            {
                tr.setText("YOU'VE SELECTED SHEMALE");
            }
        }
        
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setBounds(400,300,300,450);
        m.setResizable(false);
    }
  
}
