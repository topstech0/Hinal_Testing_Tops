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
		//System.out.println("\nSimple If Demo\n");		
		//System.out.println("Enter Any Value : ");
		//int val = sc.nextInt();
		/*
		 * Positive or Negative
		 * 
		 * 
		 * 
		 * 1) Simple if and if/else Program.
		 * =====================================
		 * 
		 * Program 1) : Positive or Negative
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
		 * Program 2) : Even or Odd.
		 * 
		
		if(val%2==0)
		{
			System.out.println("It is Even Number.");
		}
		else
		{
			System.out.println("It is Odd Number.");
		}
		
		// 
		 * 
		 * Program 3) : Max of 2 No.s
		 * 
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
		*/
		
		/*
		 * Nested if/else :
		 * 
		 * Program : Max of 3 No.s
		 * 
		 
		
		int n1,n2,n3;
		
		System.out.print("Enter N1 : ");
		n1 = sc.nextInt();
		System.out.print("Enter N2 : ");
		n2 = sc.nextInt();
		System.out.print("Enter N3 : ");
		n3 = sc.nextInt();
		System.out.println("\nN1 = "+n1+", N2 = "+n2+", N3 = "+n3);
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("\nN1 is Greater");
			}
			else
			{
				System.out.println("\nN2 is Greater");
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("\nN2 is Greater");
			}
			else
			{
				System.out.println("\nN3 is Greater");
			}
				
		}
		
		*/
		
		/*
		 * Ladder if/else
		 * 
		 * Program : To Prepare a Student Grade Console Application.
		 * 
		 * 
		 
		
		int rollno,physics,chemistry,maths,total;
		String name;
		float percentage;
		
		System.out.print("\nEnter Roll No : ");
		rollno = sc.nextInt();
		System.out.print("Enter your Name : ");
		name = sc.next();
		System.out.print("Enter Physics Marks : ");
		physics = sc.nextInt();
		System.out.print("Enter Chemistry Marks : ");
		chemistry = sc.nextInt();
		System.out.print("Enter Maths Marks : ");
		maths = sc.nextInt();
		total = (physics+chemistry+maths);		
		percentage = ((float)total/3);
		System.out.println("\nTotal Marks (P+C+M) : "+total);
		System.out.println("Percentage : "+percentage);
		
		if(percentage>=75)
		{
			System.out.println("You have Distinction Class.");
		}
		else if(percentage>=60)
		{
			System.out.println("You have First Class.");
		}
		else if(percentage>=50)
		{
			System.out.println("You have Second Class.");
		}
		else if(percentage>=40)
		{
			System.out.println("You have Pass Class");
		}
		else
		{
			System.out.println("You are Fail!!!.");
		}
		*/
		
		/*
		 * Switch Statement : 
		 * 
		 * syntax :	
		 * 				switch(expression)
						{
							case value1: statement_1;
             							 break;
							case value2: statement_2;
             							  break;
							case value3: statement_3;
										  break;
						  	.
						  	.
						  	.
						  	case valuen: statement_n;
						  				 break;
						    default	   : statement;
						    		     break;
						}
						
				Program : Choice Calculator.		
						
		 */
		
				int a,b;
				System.out.print("\nEnter +ve Integer Value of A : ");
				a = sc.nextInt();
				System.out.print("Enter +ve Integer Value of B : ");
				b = sc.nextInt();
				System.out.println("\nA = "+a+", B = "+b);
				System.out.println("\nPress 1. for Addition.");
				System.out.println("Press 2. for Subtraction.");
				System.out.println("Press 3. for Multiplication.");
				System.out.println("Press 4. for Division.");
				
				int choice;
				System.out.print("\nEnter your choice from the above Menu ?\t ");
				choice = sc.nextInt();
				
				/*
				switch(choice)
				{
					case 1:System.out.println("\nAddition : "+(a+b));
					       break;
					case 2:System.out.println("\nSubtraction : "+(a-b));
						   break;
					case 3:System.out.println("\nMultiplication : "+(a*b));
						   break;
					case 4:System.out.println("\nDivision : "+((float)a/b));
						   break;
					default: System.out.println("\nInvalid Choice");
				}
				*/
				
				if(choice==1)
				{
					System.out.println("\nAddition : "+(a+b));
				}
				else if(choice==2)
				{
					System.out.println("\nSubtraction : "+(a-b));
				}
				else if(choice==3)
				{
					System.out.println("\nMultiplication : "+(a*b));
				}
				else if(choice==4)
				{
					System.out.println("\nDivision : "+((float)a/b));
				}
				else
				{
					System.out.println("\nInvalid Choice");
				}
		
		
		
	}

}
