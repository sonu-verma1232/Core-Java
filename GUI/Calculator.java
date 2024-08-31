package com.GUI;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener , WindowListener
{
	
	private TextField txtnum1, txtnum2, txtresult;
	private Label lblnum1, lblnum2, lblresult;
	private Button btnadd, btnsub, btnmulti, btndiv;
	private Color clr;
	private Font font;
	
	public Calculator()
	{
		
		this.addWindowListener(this); // register the Listener with Frame
		// first this  as a Source(Frame)
		//  second this  a class object which implements listener
		
		
		setBackground(Color.LIGHT_GRAY);
		setSize(600, 400);
		
	//	System.out.println("In Constructor ");
		
		setTitle("CalculationFrame");
		
	//    FlowLayout f1 = new FlowLayout()	;
		
		setLayout(new FlowLayout());    //  set the frameLayout as flowLayout
	//  using runtime polymorphism with Interface LayoutManaget is an Interface
		
		clr = new Color(100,100,200);
		setForeground(clr);  // it is used to set color of all component
		
		font = new Font("Arial", Font.BOLD, 20);
		
		createComponent();
	}
	
	public void createComponent()
	{
		lblnum1 = new Label("Enter Number1");
		lblnum1.setFont(font);
		add(lblnum1);
		
		
		
		txtnum1 = new TextField(4);
		add(txtnum1);
	//	add(txtnum1, BorderLayout.SOUTH);   // text field gets added into frame in South Region
		
		lblnum2 = new Label("Enter Number2");
		lblnum2.setFont(font);
		add(lblnum2);
		txtnum2 = new TextField(4);
		add(txtnum2);
		
		lblresult = new Label("Result");
		lblresult.setFont(font);
		lblresult.setForeground(Color.YELLOW);  //  it set color individual
		
		add(lblresult);
		txtresult = new TextField(4);
		add(txtresult);
		
		btnadd = new Button("Add");
		
		// here, runtime polymorphism with this keyword is used
		
		btnadd.addActionListener(this);  // register the listener with add button
		btnadd.setFont(new Font("Calibri",Font.ITALIC, 20));
		add(btnadd);
		
		btnsub = new Button("Subtract");
		btnsub.addActionListener(this);  // register the listener with subtract button
		btnsub.setFont(new Font("Arial", Font.ITALIC | Font.BOLD , 20));
		add(btnsub);
		
		btnmulti = new Button("Multiply");
		btnmulti.addActionListener(this);  // register the listener with multiply button
		add(btnmulti);
		
		btndiv = new Button("Divide");
		btndiv.addActionListener(this);  // register the listener with divide button
		add(btndiv);
	}
	
	public void actionPerformed(ActionEvent ae) // it gives additional information related to event.
	{
		// System.out.println("Button is being clicked");
		 String caption = ae.getActionCommand();
		// System.out.println(caption);
		 
		 
		 
		 String num1 = txtnum1.getText();  // fetch the value from TextField
		 String num2 = txtnum2.getText();
		 double n1 = Double.parseDouble(num1);
		 double n2 = Double.parseDouble(num2);
		 double result = 0.0;
		 if(caption.equalsIgnoreCase("add"))
		 {
			 result = n1+n2;
		 }
		 else if(caption.equalsIgnoreCase("subtract"))
		 {
			 result = n1-n2;
		 }
		 else if(caption.equalsIgnoreCase("multiply"))
		 {
			 result = n1*n2;
		 }
		 else 
		 {
			 result = n1/n2;
		 }
		 
		 
		 
		 
		 
		 String res = String.valueOf(result);  // it converts double to String
		 txtresult.setText(res);
		 
		 // txtresult.setText(String.valueOf(result));
		 
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		Calculator c = new Calculator();
		
		c.setVisible(true);
		
		
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
         this.dispose();  // to close the Frame
         
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
