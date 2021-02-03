import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Account extends JFrame {
    private JLabel name,accountNo , current_balance , dispose_balance , total_balance ,Gen;
    private JTextField nametext , accnotext , currtext , distxt  ;
    private Container color ;
    private Font font , font1 ,font2;
    private  ImageIcon img ;
    private JTextArea info ,totaltxt ;
    private JButton  showInfo, totalBl ;
    private JRadioButton m,f ;
    private ButtonGroup bg ;
    public Account()
    {
        img = new ImageIcon(getClass().getResource("Acc.png"));
        this.setIconImage(img.getImage());
        color = this.getContentPane();
        color.setLayout(null);
        color.setBackground(Color.cyan);
        font = new Font("Arial",Font.ITALIC+ Font.BOLD,15);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setBounds(500,700,500,600);
        this.setResizable(false);
        Gen = new JLabel("Gender: ");
        Gen.setBounds(10,10,60,20);
        Gen.setForeground(Color.RED);
        color.add(Gen);

        m = new JRadioButton("MELE");
        m.setBackground(Color.RED);
        m.setBounds(100,10,100,25);
        m.setFont(font1);
        color.add(m);

        f = new JRadioButton("FEMELE");
        f.setBounds(220,10,100,25);
        f.setBackground(Color.RED);
        f.setFont(font1);
        f.setSelected(true);
        color.add(f);

        bg.add(m);
        bg.add(f);


        name = new JLabel("NAME: ");
        name.setBounds(30,60,250,30);
        name.setBackground(Color.RED);
        name.setFont(font);
        color.add(name);

        accountNo = new JLabel("ACCOUNT NO: ");
        accountNo.setBounds(30,120,250,30);
        accountNo.setForeground(Color.RED);
        accountNo.setFont(font);
        color.add(accountNo);

        current_balance = new JLabel("CURRENT BALANCE: ");
        current_balance.setBounds(30,180,250,30);
        current_balance.setForeground(Color.RED);
        current_balance.setFont(font);
        color.add(current_balance);

        dispose_balance = new JLabel("DEPOSITE BALANCE: ");
        dispose_balance.setBounds(30,245,250,30);
        dispose_balance.setForeground(Color.RED);
        dispose_balance.setFont(font);
        color.add(dispose_balance);

        total_balance = new JLabel("TOTAL BALANCE: ");
        total_balance.setBounds(30,340,250,30);
        total_balance.setForeground(Color.RED);
        total_balance.setFont(font);
        color.add(total_balance);

        font2 = new Font("Arial",Font.ROMAN_BASELINE,14);
        nametext = new JTextField("");
        nametext.setBounds(215,60,200,30);
        nametext.setForeground(Color.RED);
        nametext.setOpaque(true);
        nametext.setForeground(Color.black);
        nametext.setFont(font2);
        color.add(nametext);

        accnotext = new JTextField();
        accnotext.setBounds(215,120,200,30);
        accnotext.setForeground(Color.RED);
        accnotext.setOpaque(true);
        accnotext.setForeground(Color.black);
        accnotext.setFont(font2);
        color.add(accnotext);


        currtext = new JTextField();
        currtext.setBounds(215,180,200,30);
        currtext.setForeground(Color.RED);
        currtext.setOpaque(true);
        currtext.setForeground(Color.black);
        currtext.setFont(font2);
        color.add(currtext);

        distxt = new JTextField();
        distxt.setBounds(215,245,200,30);
        distxt.setForeground(Color.RED);
        distxt.setOpaque(true);
        distxt.setForeground(Color.black);
        distxt.setFont(font2);
        color.add(distxt);

        totalBl = new JButton("Total Balance");
        totalBl.setBounds(300,280,150,50);
        totalBl.setForeground(Color.RED);
        totalBl.setOpaque(true);
        totalBl.setForeground(Color.black);
        totalBl.setFont(font2);
        color.add(totalBl);
        /*totalBl.addActionListener(new ActionListener()
                                  {
                                      public void actionPerformed(ActionEvent e)
                                      {
                                          String o1 = currtext.getText();
                                          String o2 = distxt.getText();
                                          if(o1.isEmpty() || o2.isEmpty())
                                          {
                                              JOptionPane.showMessageDialog(null,"You didnt write Current value or Text valuue");
                                          }
                                          else
                                          {
                                              totaltxt.setText("");
                                              double currbl = Integer.parseInt(currtext.getText());
                                              double disbl = Integer.parseInt(distxt.getText());
                                              double t1 = currbl+disbl;

                                               String C = String.valueOf(currbl);
                                               String C1 = String.valueOf(disbl);
                                              String S1 = String.valueOf(t1);


                                              totaltxt.append(S1);
                                          }


                                          
                                      }
                                  }
        );*/

        totaltxt = new JTextArea();
        totaltxt.setBounds(215,340,200,30);
        totaltxt.setForeground(Color.RED);
        totaltxt.setOpaque(true);
        totaltxt.setForeground(Color.black);
        totaltxt.setFont(font2);
        color.add(totaltxt);



        showInfo = new JButton("INFORMATION");
        showInfo.setBounds(100,280,150,50);
        showInfo.setForeground(Color.black);
        showInfo.setOpaque(true);
        showInfo.setBackground(Color.RED);
       // showInfo.setCursor(cursor);
        color.add(showInfo);
        showInfo.addActionListener(new ActionListener()
                                    {

                                        public void actionPerformed(ActionEvent e)
                                        {
                                            String i1 = nametext.getText();
                                            String i2 = accnotext.getText();
                                            String i33 = distxt.getText();
                                            String i34 = currtext.getText();
                                            if(i1.isEmpty()||i2.isEmpty()||i34.isEmpty()||i33.isEmpty())
                                            {
                                                JOptionPane.showMessageDialog(null,"PLEASE FILL THE WHOLE BOX");
                                            }
                                            else {
                                                info.setText("");
                                                totaltxt.setText("");

                                         /*   String i3 =  currtext.getText();
                                            String i4 = distxt.getText();*/
                                            int n1 = Integer.parseInt(currtext.getText());
                                            int n2 = Integer.parseInt(distxt.getText());
                                            int n3 = n1+n2;
                                            int N7 = n1+n2;
                                            String Nn1 = String.valueOf(n1);
                                            String Nn2 = String.valueOf(n2);
                                            String Nn3 = String.valueOf(N7);

                                            info.append("ACCOUNT OWNER NAME: "+i1+"\n");
                                            info.append("ACCOUNTANT OWNER ID: "+i2+"\n");
                                            info.append("HIS/HER CURRENT BALANCE: "+Nn1+" $DOLLAR\n");
                                            info.append("HIS/HER DISPOSE BALANCE: "+Nn2+" $DOLLAR\n");
                                            info.append("TOTAL CASH: "+n3+" $DOLLAR\n");
                                            totaltxt.append(""+N7);
                                            }

                                        }
                                    });

        font = new Font("Arial",Font.ITALIC,19);
        info = new JTextArea();
        info.setBounds(10,380,450,200);
        info.setFont(font1);
        info.setForeground(Color.black);
        info.setOpaque(true);
        info.setBackground(Color.green);
        color.add(info);




    }



    public static void main(String[] args) {
        Account account =  new Account();

    }
}
