package fundamentals;

import java.util.Scanner;

/*
 *  There are 2 conditional statements
 *  
 *  1) if statements
 *  2) switch statements
 *  
 *  =============================================================================
 *  
 *  A) if statements : 
 *  
 *  - it checks the condition. Condition is evaluated to boolean value. True/False
 *  - if condition is true, then the if block is executed.
 *  - if condition is false, then else block is executed.
 *  
 *  
 *  
 *  1) Simple if:
 *  
 *  syntax : if(condition)
 *  		 {
 *  			//statement.
 *  		 }
 *  
 *  2) if/else :
 *  
 *  syntax : if(condition)
 *  		 {
 *  			//statement.
 *  		 }
 *  		 else
 *  		 {
 *  			//statement
 *  		 }
 *  
 * 3) nested if/else : 
 * 
 * syntax : if(condition)
 * 			{
 * 				if(condition)
 * 				{
 * 					//code.
 * 				}
 * 				else
 * 				{
 * 					//code.
 * 				}
 * 			}
 * 			else
 * 			{
 * 				if(condition)
 * 				{
 * 					//code
 * 				}
 * 				else
 * 				{
 * 					//code
 * 				}
 * 			} 
 * 
 * 	4) ladder if/else
 * 
 * 	syntax : if(condition)
 * 			 {
 * 				//code.
 * 			 }
 * 			 else if(condition)
 * 			 {
 * 				//code.
 * 			 }
 * 			 else if(condition)
 * 			 {
 * 				//code.
 * 			 }
 * 			 else
 * 			 {
 * 				//code.
 * 			 }
 * 
 * 
 * 
 * % -> Modulus Operator
 * 
 * - it returns the remainder.
 * 
 * 
 */


public class ConditionalDemo {
	
	public static void main(String[] args) {
		System.out.println("\n<----Conditional Statement Demo--->");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSimple If Demo\n");		
		//System.out.println("Enter Any Value : ");
		//int val = sc.nextInt();
		/*
		 * Positive or Negative
		 * 
		if(val>0)
		{
			System.out.println("Value Entered is +ve.");
		}
		else
		{
			System.out.println("Value Entered is -ve.");
		}
		*/
		
		/*
		 * Even or Odd.
		
		if(val%2==0)
		{
			System.out.println("It is Even Number.");
		}
		else
		{
			System.out.println("It is Odd Number.");
		}
		
		*/
		int a,b;
		
		System.out.print("Enter Value of A : ");
		a = sc.nextInt();
		System.out.print("Enter Value of B : ");
		b = sc.nextInt();
		System.out.println("\nA = "+a+", B = "+b);
		
		if(a>b)
		{
			System.out.println("\nA is Greater.");
		}
		else
		{
			System.out.println("\nB is Greater");
		}
		
		
	}

}
