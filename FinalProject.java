//Anthony Irizarry, Programmer
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.reflect.*;
public class FinalProject extends JFrame implements ActionListener{

	
	//GUI declarations
	  JLabel l1, l2, l3,l4, l5,l6,l7,l8,l9,l10, l11,l12,l13,l14,l15,l16;
	  JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14; 
	  JTextField t1, t2, t3,t4,t5;
	  JCheckBox c1, c2, c3,c4, c5;
	  JRadioButton j1, j2, j3, j4;
	  
	  
	  	Container contentPane = getContentPane();
		JPanel pnl = new JPanel();
		JPanel grid = new JPanel(new GridLayout(6,2));

		public FinalProject()
		{
			 b3 = new JButton("Ritz-Carlton");
			 b4 = new JButton("Comfort Inn");
			 b5 = new JButton("Hyatt");
			 b6 = new JButton("The View Hotel");
			 b7 = new JButton("Grand Hotel");
			 b8 = new JButton("Plaza Hotel");
			 b9= new JButton("Chicago, IL");
			 b10= new JButton("Madison, WI");
			 b11= new JButton("Los Angeles, CA");
			 b12= new JButton("Sussex, UK");
			 b13= new JButton("Mackinac, MI");
			 b14= new JButton("New York, NY");
			 
			 l1 = new JLabel(" Number of Days Reserved:  ");
			 l2 = new JLabel(" Date Reserved (DD/MM/YYYY):  ");
			 l3 = new JLabel(" Number of Rooms: ");
			 //l4= new JLabel("  ");
			 l5 = new JLabel("Total: ");
			 l6 = new JLabel("Choose Your hotel: ");
			 
			 l7= new JLabel("Pick Your City: ");
			 l8 = new JLabel(" ");
			 l9 = new JLabel(" ");
			 l10 = new JLabel(" ");
			 l11 = new JLabel(" ");
			 l12 = new JLabel(" ");
			 l13 = new JLabel(" ");
			 l14 = new JLabel(" ");
			 l15 = new JLabel(" ");
			 l16 = new JLabel(" ");
		    b2 = new JButton("EXIT");
		    t1 = new JTextField(10);
		    t2 = new JTextField(10);
		    t3 = new JTextField(10);
		    t4= new JTextField(" ");
		    t5= new JTextField(10);		    
			b1 = new JButton("Compute");			
			c1= new JCheckBox("Senior");
			c2= new JCheckBox("Student");
			c3= new JCheckBox("Corporate");
			c4= new JCheckBox("Birthday");
			c5= new JCheckBox("None");
			 add(l6);
			 add(b3);
			 add(b4);
			 add(b5);
			 add(b6);
			 add(b7);
			 add(b8);
			 
			 add(l10);
			 add(l11);
			 add(l12);
			 
			 add(l7);
			 add(b9);
			 add(b10);
			 add(b11);
			 add(b12);
			 add(b13);
			 add(b14);

			 add(l8);
			 add(l13);
			 add(l14);
		    add(l1);
		    add(t1);

		    add(l2);
		    add(t2);
		   // add(l15);
		    add(l3);
		    add(t3);			
		    add(l5);
		    add(t5);	
		    add(c1);
		    add(c2);
		    add(c3);
		    add(c4);
		    add(c5);

		    add(b1);
		    add(b2);	
		    
		    //Button action listeners
		    b1.addActionListener(this);
		    b2.addActionListener(e -> System.exit(0));
		    b3.addActionListener(this);
			 b4.addActionListener(this);
			 b5.addActionListener(this);
			 b6.addActionListener(this);
			 b7.addActionListener(this);
			 b8.addActionListener(this);
			 b9.addActionListener(this);
			 b10.addActionListener(this);
			 b11.addActionListener(this);
			 b12.addActionListener(this);
			 b13.addActionListener(this);
			 b14.addActionListener(this);
			 
			 
			 //Checkbox action listeners
			 c1.addActionListener(this);
			 c2.addActionListener(this);
			 c3.addActionListener(this);
			 c4.addActionListener(this);
			 c5.addActionListener(this);
			 
			 
			 
			 
		    
			 setSize(750,400);
		    setLayout(new GridLayout(7,7));
		}
		
public String paymentMethod() {
	String method= " ";
	
	 j1 = new JRadioButton("Paypal");
	 j2 = new JRadioButton("Credit Card");
	 j3 = new JRadioButton("Cash (Pay on site)");
	 j4 = new JRadioButton("Gift Certificate");
	
	 add(j1);
	 add(j2);
	 add(j3);
	 add(j4);
	 
	//Payment Selection
	 
	 if(j1.isSelected()) {
		 method= "Paypal Selected";
	 }
	 else if(j2.isSelected()) {
		 method= "Credit Card Selected";
	 }
	 else if(j3.isSelected()) {
		 method= "Cash Selected";
	 }
	 else if(j4.isSelected()) {
		 method= "Gift Certificate Selected";
	 }
	 
	setSize(200,300);
    setLayout(new GridLayout(1,4));
   return method;
}
		
		double roomPrice=0;
		 double subTotal=0;
		 double tax=0;
		double Total=0;
		double discount=0;
public void actionPerformed(ActionEvent ae)
  {

	
	
	try {
	float days,rooms;
	String b;
    days = Float.parseFloat(t1.getText());
    b = t2.getText();
    
    rooms= Float.parseFloat(t3.getText());
    
    //Tax Calculations
   if(ae.getSource() == b9) {
	   tax=.09;
	   System.out.println("Tax= 9%");
   }
   else if(ae.getSource() == b10) {
	   tax=.07;
	   System.out.println("Tax= 7%");
   }
   else if(ae.getSource() == b11) {
	   tax=.10;
	   System.out.println("Tax= 10%");
   }
   else if(ae.getSource() == b12) {
	   tax=.01;
	   System.out.println("Tax= 1%");
   }
   else if(ae.getSource() == b13) {
	   tax=.06;
	   System.out.println("Tax= 6%");
   }
   else if(ae.getSource() == b14) {
	   tax=.08;
	   System.out.println("Tax= 8"+ "%");
   }
   
   
 
  
	   //Checkbox conditional statements
	   if(ae.getSource() == c1) {
		   discount=.20;
		   System.out.println("Discount = 20%");
	   }
	   else if (ae.getSource() == c2) {
		   discount=.10;
		   System.out.println("Discount = 10%");
	   }
	   else if (ae.getSource() == c3) {
		   discount=.25;
		   System.out.println("Discount = 25%");
	   }
	   else if (ae.getSource() == c4) {
		   discount=.15;
		   System.out.println("Discount = 15%");
	   }
	  
	  
   //Roomprice Calcs
    if(ae.getSource() == b3)
    {
    	roomPrice=350; 	
    	System.out.println("Price of the Room = $350.00");
    }
    else if(ae.getSource() == b4){
    	roomPrice=141;	
    	System.out.println("Price of the Room = $141.00");
    }
	 else if(ae.getSource() == b5){	 
		 roomPrice=150;
		 System.out.println("Price of the Room = $150.00");
	    }
	 else if(ae.getSource() == b6){
		 roomPrice=61;
		 System.out.println("Price of the Room = $61.00");
	 }
	 else if(ae.getSource() == b7){ 
		 roomPrice=380;
		 System.out.println("Price of the Room = $380.00");
	 }
	 else if(ae.getSource() == b8){ 
		 roomPrice=800;
		 System.out.println("Price of the Room = $800.00");
	 } 
    
    
    double almostTotal=0;
    //Compute
    if(ae.getSource() == b1) 	
    {
    	roomPrice = roomPrice==0?1:roomPrice;
    	//tax = tax==0?1:tax;
    	subTotal=days*rooms*roomPrice;
    	almostTotal=(subTotal*tax)+subTotal; 
    	Total=almostTotal-(almostTotal*discount);
    }
    else 
    	return;
    System.out.println("Date Reserved: "+ b);
	   
   System.out.println("Subtotal (No tax or discount): $"+subTotal);
 
   System.out.println("Total: $"+Total);
    t5.setText(String.valueOf(Total));
    }
    catch(Exception e)
	{
    	JOptionPane.showMessageDialog(null,  "Please Fill in the days reserved and rooms alloted first");
    }
	
  }
	public static void main(String[] args) {
		//Arrays 
		int Customernum []= {1,2,3,4,5,6};
		String Hotel []= {"Ritz-Carlton","Comfort Inn","Hyatt","The View Hotel","Grand Hotel","Plaza Hotel"};
		String HotelLoc []= {"Chicago, IL","Madison, WI","Los Angeles, CA","Sussex, UK","Mackinac, MI","New York, NY"};
		String RoomAcc []= {"Double Bed","Single Bed","Suite","Single Bed","Double Bed","10 suites"};

		double cost[]= {350,141,150,61,380,800};
		double taxa[]= {.09,.07,.10,.01,.06,.08};
	

	String message = "Welcome to the Northwoods Hotel Reservation System";
	JOptionPane.showMessageDialog(null,  message,
			"Welcome", JOptionPane.PLAIN_MESSAGE);
	//Dialog Boxes
	String str = 
			JOptionPane.showInputDialog(null, "Enter Your Username: ");
	str = 
			JOptionPane.showInputDialog(null, "Enter Your Password: ");

	str= JOptionPane.showInputDialog(null, "Enter Your Payment Method (Credit Card, Paypal, Cash, Gift Certificate):  ");
	
    
	System.out.println("************RECEIPT*************");
    FinalProject b = new FinalProject();
   
   
    b.setVisible(true);
    b.setLocation(200, 200);
    System.out.println("Payment Method: " + str);
    System.out.println("************RECEIPT*************");
	}
}
		
	
	

