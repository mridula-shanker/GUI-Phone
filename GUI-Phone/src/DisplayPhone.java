import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class DisplayPhone 
{

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(400,400,600,300);//X,Y,Width,Height
		myFrame.setLayout(null);
		
		JLabel nameLabel = new JLabel("Please enter your name here: ");
		nameLabel.setBounds(40,30,500,30);
		myFrame.add(nameLabel);
		
		JTextField name = new JTextField();
		name.setBounds(230,30,500,30);
		myFrame.add(name);
		
		JLabel phoneLabel = new JLabel("Please enter your phone number here: ");
		phoneLabel.setBounds(40,100,500,30);
		myFrame.add(phoneLabel);
		
		JTextField phone = new JTextField();
		phone.setBounds(270,100,500,30);
		myFrame.add(phone);
		
		JLabel dispName = new JLabel();
		dispName.setBounds(40,175,500,30);
		myFrame.add(dispName);
		
		JLabel dispNum = new JLabel();
		dispNum.setBounds(40,200,500,30);
		myFrame.add(dispNum);
		
		JButton command = new JButton("Set Info");
		command.setBounds(40,150,200,30);
		command.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						dispName.setText(name.getText());
						dispNum.setText(phone.getText());
						
					}
				});
		myFrame.add(command);
		
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


