package firstprogram;



//Constructor : it is a block of code that initializes the newly created object . {} - block of code

// 1. The constructor name must be same as its class name.
// 2. must don't have explicit return types
// cannot be abstract, static,final and synchronized
// Types of Constructor -1. Default 2. No Arguments 3. parameterized 

// a.DEFAULT CONSTRUCTOR : WE DONT PROVIDE ANY CONSTRUCTOR IN A CLASS, BUT COMPILER WILL PROVIDE ONE.
//                         BUT WE CAN'T SEE IT, IT WILL BE IN A CLASS FILE 
//                         IT PROVIDE THE DEFAULT VALUES TO THE OBJECT NULL,0 BASED ON THE DATA TYPES.
// WHEN WE DECLARE A VARIABLE AND CALL IN A MAIN METHOD BY CREATING AN OBJECT WITH OUT GIVING VARIABLE VALUE, THE CONSTRUCTOR WILL PROVIDE A DEFAULT VALUE TO THE VARIABLE.
// IS CALLED DEFAULT CONSTRUCTOR.

// b. NO ARGUMENT CONSTRUCTOR : NO ARGUMENTS PASSED FOR A CONSTRUCTOR, THIS IS NOT A DEFULT CONSTRUCTOR.
//                              IT WILL ALLOWS TO WRITE LOGIC WHEN OBJECT IS CREATED 

// c. PARAMETERIZED CONSTRUCTOR : (IT HAS ARGUMRNTS (PARAMETERS).




public class LearnConstructor {
	// DEFAULT CONSTRUTOR - we doesn't write any constructor, but compiler will provide one
	String a;
	int b;
	
	public static void main(String[] args) {
		
		LearnConstructor object1 = new LearnConstructor();
		
		System.out.println(object1.a);
		System.out.println(object1.b);
		
		
	}

}
