package firstprogram;
 // we use the return type for return a value in a method and calling the method in a main function.
public class ReturnTypes {
 
 int TotalAmount = 5000;
 short PurchaceAmount = 4000;
 long BalanceAmount = TotalAmount - PurchaceAmount;
 
 public long  getTotalAmount() // void is inbuilt return type and its don't return any value so we use the data type as a return type 
 
 {
	  
	 System.out.println("The Purchase Amount  Is =" + PurchaceAmount);
	 return BalanceAmount;  // return type for return a method value , we want to return the particular variable by return keyword 
	 
	 
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ReturnTypes object1 = new ReturnTypes();
		long Amount = object1.getTotalAmount(); // by using return type want to mention the data type and also create a object 
		System.out.println(Amount);
		
	}

}
