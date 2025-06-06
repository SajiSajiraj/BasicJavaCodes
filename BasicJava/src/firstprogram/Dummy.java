package firstprogram;

public class Dummy {
	
	
 String Car_name;
 String Car_Colur;
 
 Dummy(String BrandName, String ExteriorClour)
 {
	
	 Car_name = BrandName;
	Car_Colur =ExteriorClour;
	 
	 
	 
 }
 
 
 void carDetails()
 {
	 
	System.out.println("The car Brand name is " + Car_name+" & Clour of Car is " +Car_Colur); 
	 
 }
 
 public static void main (String [] args)
 {
	 
	 
	 Dummy object1 = new Dummy("Land Rover", "yellow");
	 object1.carDetails();
	 
	 Dummy object2 = new Dummy("Benz", "Red"); 
	 object2.carDetails(); 
	 
 }
 
 

}
