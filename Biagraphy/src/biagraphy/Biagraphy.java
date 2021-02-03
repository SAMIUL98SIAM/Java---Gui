/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biagraphy;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Biagraphy extends JFrame {

    private Container color;
    private JLabel name , currbal , prevbl , totalbl ,imglbl ;
    private JTextField namet , currbalt , prevblt ;
    private JTextArea tr , totalblt; 
    private Font font,font2;
    private Cursor c ;
    private JButton login , reset;
    private JScrollPane scr;
    private JRadioButton ml,fml;
    private ButtonGroup bg , bg1;
    private JCheckBox cat,dog;
    private ImageIcon img;
    
    public Biagraphy()
    {
        initcomponant();
    }
     
    public void initcomponant()
    {
        img = new ImageIcon(getClass().getResource("abul.jpg"));
        color =this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.pink);
        font = new Font("Arial",Font.BOLD+Font.ITALIC,20);
        name= new JLabel("Enter your name: ");
        name.setBounds(40,50,200,40);
        name.setForeground(Color.red);
        name.setFont(font);
        color.add(name);
        
        namet = new JTextField();
        namet.setBounds(230,40,150,50);
        namet.setForeground(Color.blue);
        namet.setHorizontalAlignment(JTextField.CENTER);
        namet.setBackground(Color.CYAN);
        namet.setFont(font);
        color.add(namet);
        
        currbal = new JLabel("Current Balance: ");
        currbal.setBounds(40,100,200,40);
        currbal.setForeground(Color.red);
        currbal.setFont(font);
        color.add(currbal);
        
        currbalt = new JTextField();
        currbalt.setBounds(230,100,150,50);
        currbalt.setForeground(Color.blue);
        currbalt.setHorizontalAlignment(JTextField.CENTER);
        currbalt.setBackground(Color.CYAN);
        currbalt.setFont(font);
        color.add(currbalt);
        
        prevbl = new JLabel("Previous Balance: ");
        prevbl.setBounds(40,160,200,40);
        prevbl.setForeground(Color.red);
        prevbl.setFont(font);
        color.add(prevbl);
        
        prevblt = new JTextField();
        prevblt.setBounds(230,160,150,50);
        prevblt.setForeground(Color.blue);
        prevblt.setHorizontalAlignment(JTextField.CENTER);
        prevblt.setBackground(Color.CYAN);
        prevblt.setFont(font);
        color.add(prevblt);
        
        totalbl = new JLabel("Total Balance: ");
        totalbl.setBounds(40,215,200,40);
        totalbl.setForeground(Color.red);
        totalbl.setFont(font);
        color.add(totalbl);
        
        totalblt = new JTextArea();
        totalblt.setBounds(230,220,150,50);
        totalblt.setForeground(Color.blue);
        //totalblt.setHorizontalAlignment(JTextField.CENTER);
        totalblt.setBackground(Color.CYAN);
        totalblt.setFont(font);
        color.add(totalblt);
        
        
        font2 =  new Font("Arial",Font.PLAIN,13);
        ml = new JRadioButton("Male");
        ml.setBackground(Color.pink);
        ml.setBounds(20, 255, 100,20);
        ml.setFont(font2);
        color.add(ml);
        
        fml = new JRadioButton("FeMale");
        fml.setBackground(Color.pink);
        fml.setBounds(120, 255, 100,20);
        fml.setFont(font2);
        color.add(fml);
        
        bg = new ButtonGroup();
        bg.add(ml);
        bg.add(fml);
        
        
        cat = new JCheckBox("Cat");
        cat.setBackground(Color.pink);
        cat.setBounds(20, 275, 100,20);
        cat.setFont(font2);
        color.add(cat);
        
        dog = new JCheckBox("Dog");
        dog.setBackground(Color.pink);
        dog.setBounds(120, 275, 100,20);
        dog.setFont(font2);
        color.add(dog);
        
        bg1 = new ButtonGroup();
        bg1.add(cat);
        bg1.add(dog);
        
        
        
        
       
        //bg.add(ml);
        //bg.add(fml);
        
        
        c = new Cursor(Cursor.CROSSHAIR_CURSOR);
        login = new JButton("LOGIN");
        login.setBounds(400,30,100,50);
        login.setForeground(Color.blue);
        login.setCursor(c);
        login.setBackground(Color.black);
        login.setFont(font);
        color.add(login);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                totalblt.setText("");
                tr.setText("");
                String name = namet.getText();
                double cbal = Double.parseDouble(currbalt.getText());
                double pbal = Double.parseDouble(prevblt.getText());
                double tbl  = cbal+pbal;
                //String i = imglbl.getText();
                String scbal = String.valueOf(cbal);
                String spbal = String.valueOf(pbal);
                String stbal = String.valueOf(tbl);
                
                 if (name.isEmpty()||scbal.isEmpty()||spbal.isEmpty()||stbal.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null,"Please fill the all details");
                 }
                 else
                 {
                 totalblt.append(stbal);
                 tr.append("----------------WELCOME MR.SAMIUL------------");
                 tr.append("Name: "+name+"\n");
                 tr.append("Current Balance: "+scbal+"\n");
                 tr.append("Previous Balance: "+spbal+"\n");
                 tr.append("Total Balance: "+stbal+"\n");
               
                 if(ml.isSelected())
                 {
                     tr.append("Gender: Male");
                 }
                 else{
                     tr.append("Gender: FeMale");
                 }
                 
                 
                 if(cat.isSelected())
                 {
                     tr.append("Pets: Cat");
                 }
                 else
                 {tr.append("Pets: Dog");} 
                  
                 
                }
                 
                 
                
                  
              
                
              
            }
            
           }
        );
        
        
        
        reset = new JButton("RESET");
        reset.setBounds(400,100,100,50);
        reset.setForeground(Color.blue);
        reset.setCursor(c);
        reset.setBackground(Color.black);
        reset.setFont(font);
        color.add(reset);
         reset.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                               tr.setText("");
                               totalblt.setText("");
            }
         }
         );
        
        tr = new JTextArea();
        
        tr.setForeground(Color.red);
        tr.setBackground(Color.cyan);
        tr.setFont(font);
        tr.setLineWrap(true);
        tr.setWrapStyleWord(true);
        color.add(tr);
        
        scr = new JScrollPane(tr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scr.setBounds(25,410,500,250);
        color.add(scr);
        
        
        
        
    }
    
    public static void main(String[] args) {
     
        Biagraphy bio = new Biagraphy();
        bio.setVisible(true);
        bio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bio.setBounds(600,700,600,700);
        bio.setResizable(false);
        bio.setTitle("BIO DATA");
    }
    
}
