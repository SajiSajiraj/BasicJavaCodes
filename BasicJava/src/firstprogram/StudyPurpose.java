package firstprogram;

public class StudyPurpose {

	
    	int amountInSajisHand = 5000;
    	int  amountBorrow= 4000;
    	int  totalAmountInSaji = amountInSajisHand + amountBorrow;
    	
    	
    	int buyFruits = 1000;
    	int buyChiken = 2000;
    	int sajiMoneyWithdrwaBank = 3000;
    	
    	boolean A = true;
    	boolean B = false;
    	
    	public void getMoneyDetails()
    	{
    		
    		System.out.println("Total amount in Saji "+ totalAmountInSaji);
    		System.out.println("The amount Brorrow form another person is "+amountBorrow);
    		
    		if (buyFruits > buyChiken)
    		
    		{
    			System.out.println(A);
    			
    		}
    		
    		else
    		{
    			System.out.println(B);
    			
    		}
    	}
	 
    	
	public int totalAmountBalanceAfterPurchase()
	{
		
	
		
		System.out.println("The Balance amount From Saji is :" + (totalAmountInSaji - (buyChiken+buyFruits-sajiMoneyWithdrwaBank)));
		
		return totalAmountInSaji =0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudyPurpose object1 = new StudyPurpose();
		object1.getMoneyDetails();
	int amount =	object1.totalAmountBalanceAfterPurchase();
		
		System.out.println("Exmaple of returntype is "+amount);
		
	}

}
	