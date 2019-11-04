
package march272019;

public class Constructorr {

	Constructorr()
	{
		System.out.println("Test deaful contructor");
		
	}  
 
	public static void main(String args[]){  
  
		Constructorr b=new Constructorr();  
		
		System.out.println("Test deaful contructor");
		
		
	}  
	}







/*A constructor is a special method that is used to initialize a newly created object and is called just after the memory is allocated for the object. 
 * It can be used to initialize the objects to desired values or default values at the time of object creation. It is not mandatory for the
 *  coder to write a constructor for a class.

If no user-defined constructor is provided for a class, compiler initializes member variables to its default values.

numeric data types are set to 0
char data types are set to null character(‘\0’)
reference variables are set to null

Rules for creating a Java Constructor
It has the same name as the class
It should not return a value not even void */
