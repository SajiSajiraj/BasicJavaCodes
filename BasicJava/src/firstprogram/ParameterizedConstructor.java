package firstprogram;



//c. PARAMETERIZED CONSTRUCTOR : (IT HAS ARGUMRNTS (PARAMETERS).

public class ParameterizedConstructor {

	String car_Name;
	int car_Rate;
	// constructor
	public ParameterizedConstructor(String NameOfCar, int RateOfCar) {
		
		car_Name = NameOfCar;
		car_Rate = RateOfCar;
		
		System.out.println("THe name of car is  "+car_Name +"  and Rate of car is " +car_Rate);
		
	}
	
	//(we can write the code by two way by creating method also or doesn't creating methods, its our choice)
	//public void carDetails()

	//{
	//	System.out.println("THe name of car is  "+car_Name +"  and Rate of car is " +car_Rate);
		
	//}
	
	
	
	
	public static void main(String[] args) {
		
		ParameterizedConstructor object1 = new ParameterizedConstructor("Tata", 500000);
		//object1.carDetails();
		ParameterizedConstructor object2 = new ParameterizedConstructor("Benz", 70000);
		//object2.carDetails();
	}

}
