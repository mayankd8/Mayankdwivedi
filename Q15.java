import java.util.*;
class Q15
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter your gender M/F : ");
		char a=sc.next().charAt(0); 	// method for reading char input from user 
		System.out.print("Enter age of person : ");	
		int  c=sc.nextInt();		// reading int value from user
		 
		if((c>=21)&&(a=='M'))		// checking if person age is i.e c>=21 and his/her gender 
		  {
			System.out.println("You are eligible for marriage");	
		  }
		
		else if((c>=18)&&(a=='F'))	// checking if person age is i.e c>=18 and his/her gender
		  {
			System.out.println("You are eligible for marriage");	
		  }
		else
		{
			System.out.println("You are not eligible for marriage");
		}
		
	}
}