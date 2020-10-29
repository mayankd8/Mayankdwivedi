import java.util.*;
class Q8
{
	public static void main(String args[])
{
	Scanner d= new Scanner(System.in);
	System.out.print("Enter priciple amount : ");
	float p=d.nextFloat();
	System.out.print("Enter rate of interest : ");
	float r=d.nextFloat();
	System.out.print("Enter time period : ");
	float t=d.nextFloat();

	float si=((p*r*t)/100);
	System.out.print("Simple interest is : "+si);


}
}