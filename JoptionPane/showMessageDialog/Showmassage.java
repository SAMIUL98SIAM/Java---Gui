import javax.swing.*;
import java.util.*;
public class Showmassage
{
	public static void main(String[] args)
	{
		Scanner object = new Scanner(System.in) ;
		int N = object.nextInt();
		if(N==1)
	    {
			JOptionPane.showMessageDialog(null,"ERROR") ;
			
		}
		else if(N==2)
	    {
			JOptionPane.showMessageDialog(null,"ERROR","WARNING",JOptionPane.QUESTION_MESSAGE) ;
			
		}
		else if(N==3)
	    {
			ImageIcon img = new ImageIcon("Doggy.png") ;
			JOptionPane.showMessageDialog(null,"ERROR","WARNING",-1,img) ;
			
		}
	}
	 
}