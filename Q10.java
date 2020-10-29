import java.util.*;
class Q10
{
	public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Fahrenheit temp : ");
	float f=sc.nextFloat();
	float c=(5*(f-32)/9);
	
	System.out.println("temperature is : "+c);
}
}