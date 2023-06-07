package fundamentals;

import java.util.Scanner;

public class SecondTest {
	
	public static void main(String[] args) {
		
		int n1,n2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Value of N1 : ");
		n1 = sc.nextInt();
		System.out.print("Enter the Value of N2 : ");
		n2 = sc.nextInt();
		int add = (n1+n2);
		System.out.println("\n-----------Calculator---------------\n");
		
		System.out.println("Addition of N1 and N2 : "+add);
		int mul = (n1*n2);
		System.out.println("Multiplication of N1 and N2 : "+mul);
		int sub = (n1-n2);
		System.out.println("Subtraction of N1 and N2 : "+sub);
		float div = (n1/(float)n2);
		System.out.println("Division of N1 and N2 : "+div);
		
	}

}
