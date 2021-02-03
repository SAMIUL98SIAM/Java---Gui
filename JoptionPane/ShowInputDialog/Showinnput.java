import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.util.Scanner;

public class Showinnput
{
   public static void main(String[] args)
   {
	   Scanner obj = new Scanner(System.in);
	   int N = obj.nextInt() ;
	   if(N==1)
	   {
		  String name =  JOptionPane.showInputDialog("ENTER THE NAME: ") ;
		  JOptionPane.showMessageDialog(null,("MY NAME IS: "+name));
	   }
	   if(N==2)
	   {
		  String name =  JOptionPane.showInputDialog("ENTER THE NAME: ") ;
		  JOptionPane.showMessageDialog(null,("MY NAME IS: "+name));
	   }
	   if(N==3)
	   {
		  //ImageIcon img1 = new ImageIcon("Siam.png");
		  String f_name =  JOptionPane.showInputDialog(null,"ENTER THE FIRST NAME: ","FIRST_NAME",-1) ;
		  String l_name =  JOptionPane.showInputDialog(null,"ENTER THE LAST NAME: ","LAST_NAME",-1) ;
		  String full = f_name +" " + l_name ;
		  JOptionPane.showMessageDialog(null,("MY NAME IS: "+full),"INFORMATION",-1);
	   }
	   if(N==4)
	   {
		  ImageIcon img1 = new ImageIcon("Siam.png");
		  String f_name =  JOptionPane.showInputDialog(null,"ENTER THE FIRST NAME: ","FIRST_NAME",-1) ;
		  String l_name =  JOptionPane.showInputDialog(null,"ENTER THE LAST NAME: ","LAST_NAME",-1) ;
		  String full = f_name + l_name ;
		  JOptionPane.showMessageDialog(null,("MY NAME IS: "+full),"INFORMATION",-1,img1);
	   }
	   
   }
}
//