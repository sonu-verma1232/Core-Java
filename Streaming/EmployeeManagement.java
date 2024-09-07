package com.Streaming;
import java.io.*;

public class EmployeeManagement {
	
	public void writeEmployeeObject()  throws IOException
	{
		
	 
		Employee e = new Employee();
		
		e.setName("Sonu");
		e.setDepartment("CSE");
		e.setSalary(6000000);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Employee.txt"));
		
		
		oos.writeObject(e);
		
		System.out.println("Employee object written. ");
		
		
		oos.close();
		
		
	}
	
	
	
	
	
	public void readEmployeeObject() 
	{
		
		ObjectInputStream  ois = null;
		
		try {
			
			
			ois = new ObjectInputStream(new FileInputStream("E:\\Employee.txt"));
			
			Employee emp = (Employee)ois.readObject();  // downcasting or narrow casting
			
			System.out.println("Employee name is "+emp.getName());
			System.out.println("Employee salary is "+emp.getSalary());
			System.out.println("Employee department is "+emp.getDepartment());
			
		}
		
		catch(IOException | ClassNotFoundException ie)
		{
			
			ie.printStackTrace();
			
		}
		
		finally {
			
			if(ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		EmployeeManagement em = new EmployeeManagement();
		
	//	em.writeEmployeeObject();
		
	em.readEmployeeObject();	
		
	}
	
	

}
