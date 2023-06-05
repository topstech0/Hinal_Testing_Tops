package fundamentals;

/*
 * Data-types : There are multiple data-types in Java.
 * 
 * Types     Size        Class
 * 
boolean		1 bit		Boolean
char		1 byte		Character
byte		1 byte		Byte
short		2 byte		Short
int	    	4 byte		Integer
long		8 byte		Long
float		4 byte		Float
double		8 byte		Double
 * 
 * =======================================================================================
 * 
 * Variables : it is a name at memory location, which stores data of multiple types
 * 				and 1 value at a time.
 * 			 
 * 
 * e.g int a;
 * 
 * int -> data-type
 * a -> variable-name
 * 
 * 
 * Rules  : 
 * 
 * 1) First Character should not be a digit.
 * 		
 * 	e.g : legal : a12
 * 		 illegal : 1a2;
 * 
 * 2) It will not store more than 1 value.
 * 
 * 	e.g : legal : int a=23;
 * 		 illegal: int a=12,23; 
 * 
 * 3) No blank space is allowed within the name.
 * 
 * 	e.g : String first name;
 * 
 * 4) No Special Character is allowed, except _
 * 
 * e.g legal : int a_b;
 * 	
 * 	  iilegal : int a$b;
 * 
 * 5) Variable name is Case-Sensitive, because it follows ascii rule.
 * 
 * ascii : (American Standard Code for Information Interchange)
 * 
 * a is different and A is different.
 * 
 * 
 * Output Print :   
*  
*  - To print on the Console 
 * 
 * syntax : 
 * 
 * System.out.println("dfdsf");
 * 
 * 
 */

public class FirstTest {
	
	public static void main(String[]args)
	{
		int A=47, c=43,d=42,e=23;
		int b = 41;
		
		System.out.println("Hello, Welcome to Core Java.");		
		System.out.println("At Tops Tech.");
		System.out.println("Value of A : "+A);
		System.out.println("Value of B : "+b);
		
		
	}

}
