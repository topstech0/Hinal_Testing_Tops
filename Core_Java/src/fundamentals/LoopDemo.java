package fundamentals;

import java.util.Scanner;

/*
 * Loop : it is a process, where the task gets repeated again and again.
 * 
 * Loop contains 3 important facts
 * 
 * 1) Initialization
 * 2) Condition
 * 3) Updation
 * 
 * In Java, there are  3 types of Loop.
 * 
 * 1) while loop.
 * 2) do..while loop.
 * 3) for loop
 * 
 * ===========================
 * 
 * A) while loop :
 * 
 *  syntax:		
 *  			Initialization.
 *  
 *  			while(condition)
 *  			{
 *  				//statement
 *  				//updation
 *  			} 	
 * 
 *  - it is called as Entry Controlled Loop.
 *  - Because the condition is checked first, and then the statement is executed.
 *  - No semicolon after while condition
 * 
 * ===========================================
 * 
 * B) do..while loop.
 * 
 *  syntax : 
 *  
 *  		Initialization
 *  
 *  		do
 *  		{
 *  			statement
 *  			//updation
 *  		}
 *  		while(condition);
 * 
 * - it is called as Exit Controlled Loop.
 * - Because the statement is executed first and then the condition is checked after.
 * - It will execute the statement atleast once, even if the condition is false.
 * - Semicolon after condition.
 * 
 * ============================================
 * 
 * C) for loop 
 * 
 * syntax: 
 * 			for(initialization;condition;updation)
 * 			{
 * 				statement;	
 * 			}
 * 
 * 
 * 
 * 
 */


public class LoopDemo {
	
	public static void main(String[] args) {
	
		//int i=10; // Initialization
		
		/*
		 * 
		 * Program : While Loop Demo
		 * 
		 * 
		while(i<=1000)
		{
			System.out.println(i+". Hinal");
			i++;
		}
		*/
		
		/*
		 * Program : do..while demo
		 * ==============================
		 * 
		 
		do
		{
			System.out.println(i);
			i--;			
		}
		while(i>=1);
		*/
		
		/*
		 * Program : For Loop Demo
		 *  
		 
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		*/
		
		// WAJP to accept a no. from the user and display the table of it.
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number.");
		num = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
		}
				
		
		 
		
		
		
	}
	

}
