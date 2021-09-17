/**
 * 
 */
package swingGUI;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
;/**
 * @author Sonal
 *
 */
public class JButtonA   {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButtonA jba= new JButtonA();
	}

  JButtonA()
		{
	  JFrame jf=new JFrame("HELLO");
	  jf.setLayout(null);
			JButton bt1=new JButton("Yes");
			JButton bt2=new JButton("No");
			jf.add(bt1);
			jf.add(bt2);
			jf.setSize(390,390);
			jf.setVisible(true);
			jf.setLayout(null);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			bt1.setBounds(70,200,70,30);
			bt2.setBounds(210,200,70,30);
		
       bt1.addActionListener(new ActionListener() {
      
      public void actionPerformed(ActionEvent e) 
      {
          if(e.getActionCommand()=="Yes")
          {
              bt1.setText("No");
          }
          if(e.getActionCommand()=="No"){
              bt2.setText("Yes");
         }
      }
       });
      bt2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
              if(e.getActionCommand()=="No")
              {
                  bt1.setText("Yes");
              }
              if(e.getActionCommand()=="Yes")
              {
                  bt2.setText("No");
              }
          }
      });
          
      
			
			
			
	
			
		}

}//END CLASS
