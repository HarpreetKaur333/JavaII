package Model;

import java.text.SimpleDateFormat;

public class Product {
	private String txtname ;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	   
    
    long millis=System.currentTimeMillis();  
    java.util.Date date=new java.util.Date(millis);  
    
	public Product(String name) {
		
		this.txtname = name;
	    System.out.println(date);  
	}
	
	public String getName() {
		return txtname;
	}
	public void setName(String name) {
		this.txtname = name;
	}
	
	@Override
	public String toString() {
		return " " + txtname +" "+ " " +   date+ "     ";
	}

} 
