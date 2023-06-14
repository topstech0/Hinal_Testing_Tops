package fundamentals;

/*Nested Loop:
 * 
 * syntax : 	for(initialization;condition;updation)
 * 				{
 * 					for(initialization;condition;updation)
 * 					{
 * 						//statement
 * 					}
 * 				}
 * 
 * 
 */

public class NestedLoop {

	public static void main(String[] args) {
		
		
		//Pattern 1
		/*
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		

		//Pattern 2
		/*
		for(int i=1;i<=10;i++)
		{
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		

		//Pattern 3 -Pyramid :
		
		for(int i=1;i<=10;i++)
		{
			for(int sp=1;sp<=10-i;sp++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
