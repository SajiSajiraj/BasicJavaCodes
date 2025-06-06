package firstprogram;



//b. NO ARGUMENT CONSTRUCTOR : NO ARGUMENTS PASSED FOR A CONSTRUCTOR, THIS IS NOT A DEFULT CONSTRUCTOR.
// It is also called NON PARAMETERIZED CONSTRUCTOR.
// IT WILL ALLOWS TO WRITE LOGIC WHEN OBJECT IS CREATED 


public class NoArgumentConstructor {
	
	
	
	
	int ID;
	String Name;
	
	public NoArgumentConstructor() {
		
		ID= 23223;
		Name = "SAJI";
		System.out.println("Data has Created: "+ID);
		
		
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	NoArgumentConstructor object1 = new NoArgumentConstructor();
    
	}

}
