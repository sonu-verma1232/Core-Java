package com.GUI;

import java.awt.*;
import java.awt.event.*;

public class Calculation extends Frame implements ActionListener,WindowListener{
	
	private Label lblnum1, lblresult;
	private TextField txtnum1, txtresult;
	private Button btnSqrt, btnsqr, btnceil, btnfloor;
	private Font font;
	private Color clr;
	
	Calculation(){
		
		this.addWindowListener(this);
		setBackground(Color.cyan);
		setSize(600, 400);
		setTitle("Calculation Frame");
		setLayout(new FlowLayout());
	    font = new Font("Arial", Font.ITALIC, 20);
	    clr = new Color(120,120,120);
	    setForeground(clr);
	    
	    makeComponent();
		
	}
	
	public void makeComponent() {
		lblnum1 = new Label("Enter number ");
		lblnum1.setFont(font);
		add(lblnum1);
		
		txtnum1 = new TextField(5);
		txtnum1.setFont(font);
		add(txtnum1);
		
		lblresult = new Label("Result ");
		lblresult.setFont(font);
		add(lblresult);
		
		txtresult = new TextField(4);
		txtresult.setFont(font);
		add(txtresult);
		
		btnSqrt = new Button("Sqrt");
		btnSqrt.addActionListener(this);
		btnSqrt.setFont(font);
		add(btnSqrt);
		
		btnsqr = new Button("Square");
		btnsqr.addActionListener(this);
		btnsqr.setFont(font);
		add(btnsqr);
		
		btnceil = new Button("Ceil");
		btnceil.addActionListener(this);
		btnceil.setFont(font);
		add(btnceil);
		
		btnfloor = new Button("Floor");
		btnfloor.addActionListener(this);
		btnfloor.setFont(font);
		add(btnfloor);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String caption = ae.getActionCommand();
		String num1 = txtnum1.getText();
		double n1 = Double.parseDouble(num1);
		double result = 0.0;
		
		if(caption.equalsIgnoreCase("sqrt")) {
			result = Math.sqrt(n1);
		}
		else if (caption.equalsIgnoreCase("Square")) {
			result = n1*n1;
		}
		
		else if(caption.equalsIgnoreCase("ceil")){
			result = Math.ceil(n1);
		}
		else {
			result = Math.floor(n1);
		}
		
		txtresult.setText(String.valueOf(result));
	}
	
	public static void main(String[] args) {
		
		Calculation c = new Calculation();
		c.setVisible(true);
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
