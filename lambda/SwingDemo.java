package com.lambda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;


public class SwingDemo extends JFrame
{
	private JTextField txtname;
	private JButton btnsubmit;
	
	public SwingDemo(String title)
	{
		
		setTitle(title);
		setSize(500,400);
		setLayout(new FlowLayout());
		txtname = new JTextField(10);
		add(txtname);
		btnsubmit = new JButton("Submit");
		
		
		
		// Lambda expression
		
		ActionListener a=(ap)->{
			String name = txtname.getText();
			JOptionPane.showMessageDialog(this, "Hello "+name);
		};
		btnsubmit.addActionListener(a);
		
		
		
		add(btnsubmit);
	}
	
	public static void main(String[] args) {
		
		SwingDemo sd = new SwingDemo("My Swing Frame");
		sd.setVisible(true);
		
	}

}
