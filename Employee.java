/**
 * 
 */
package swingGUI;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
/**
 * @author Sonal
 *
 */
public class Employee  {
	 
	 Employee ()
	{
	     JFrame jf=new JFrame();
		 jf.setLayout(null);//set Layout of Frame
		 jf. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jf.setSize(400,600);//set size of Frame
		 jf.setVisible(true);//set visibility of frame
		 JLabel title=new JLabel("Employee joining Form");

		//Labels
		 JLabel name=new JLabel("Name: ");
	        name.setBounds(40,120,100,30);
	        JLabel email=new JLabel("Email: ");
	        email.setBounds(40,160,100,30);
	        JLabel contact=new JLabel("Contact: ");
	        contact.setBounds(40,200,100,30);
	        JLabel add=new JLabel("Address: ");
	        add.setBounds(40,240,100,30);
	        JLabel deg=new JLabel("Degree: ");
	        deg.setBounds(40,370,200,30);

	        //text fields
	        JTextField nam=new JTextField();
	        nam.setBounds(150,120,200,30);
	        JTextField eml=new JTextField();
	        eml.setBounds(150,160,200,30);
	        JTextField con=new JTextField();
	        con.setBounds(150,200,200,30);
	        JTextArea address=new JTextArea();
	        address.setBounds(150,240,200,70);
	        JRadioButton male=new JRadioButton("Male");
	        JRadioButton female=new JRadioButton("Female");
	        male.setBounds(40,320,100,30);
	        female.setBounds(160,320,100,30);
	        String items[]={"BTech","B.A","MTech","B.Com"};
	        JcomboBox degree=new  JcomboBox(items);
	        degree.setBounds(160,370,200,30);
	        JButton submit=new JButton("Submit");
	        submit.setBounds(170,440,100,30);

	        jf.add(name);
	        jf.add(email);
	        jf.add(contact);
	        jf.add(add);
	        jf.add(deg);
	        jf.add(nam);
	        jf.add(eml);
	        jf.add(con);
	        jf.add(address);
	        jf.add(male);
	        jf.add(female);
	        jf.add(degree);
	        jf.add(title);
	        jf.add(submit);

		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Employee (); 
	}

 }

