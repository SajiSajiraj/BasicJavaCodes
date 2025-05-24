package firstprogram;

// Wrapper Class || Object || Method Creations

public class WrapperClassMethodObjectCreations {

	
	static int A = 4;
	int id= 55989;
    String accounterName = "SAJI";
	Integer accountBalance = 500; // Wrapper Class
	
	public void getBalance() {
		
		System.out.println("The Balance Amount is: " +accountBalance);
		System.out.println("The holder name: " +accounterName);
		System.out.println("The account  number: " +id);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WrapperClassMethodObjectCreations object1 = new WrapperClassMethodObjectCreations();
		 object1.getBalance();
		 System.out.println(A);
	}

}
