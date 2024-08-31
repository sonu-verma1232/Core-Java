package com.GUI;
import javax.swing.*;
import java.awt.*;
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
		add(btnsubmit);
	}
	
	public static void main(String[] args) {
		
		SwingDemo sd = new SwingDemo("My Swing Frame");
		sd.setVisible(true);
		
	}

}
