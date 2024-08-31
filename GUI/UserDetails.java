package com.GUI;
import java.awt.*;
import java.awt.event.*;

public class UserDetails extends Frame implements ActionListener , WindowListener {
	
	private Label lblnum1, lblnum2;
	private TextField txtnum1;
	private Button btn1;


	UserDetails() {
		
		this.addWindowListener(this);
     	setBackground(Color.CYAN);
		setSize(700,400);
		setLayout(null);
		setTitle("User Details");
		
		
		
		
		
		createComponent();
	}
	
	public void createComponent() {
		lblnum1 = new Label("Enter Your Name");
		lblnum1.setBounds(20, 50, 100, 30);
		add(lblnum1);
		
		txtnum1 = new TextField(30);
		txtnum1.setBounds(150, 50, 100, 30);
		add(txtnum1);
		
		lblnum2 = new Label("Name");
		lblnum2.setBounds(150,220 ,200,30);
		add(lblnum2);
		
		
		
		btn1 = new Button("Submit");
		btn1.addActionListener(this);
		btn1.setBounds(150, 120, 60, 30);
		add(btn1);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	
		
		String name = txtnum1.getText();
		
		lblnum2.setText("Hello, "+name);
		
		
	}
	
	public static void main(String[] args) {
		
		UserDetails ud = new UserDetails();
		
		ud.setVisible(true);  
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
