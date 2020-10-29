import java.util.*;
class Q7
{
	public static void main(String args[])
{	
	Scanner z = new Scanner(System.in);
	System.out.print("Enter your subject1 marks :");
	int a=z.nextInt();
	System.out.print("Enter your subject2 marks :");
	int b=z.nextInt();
	System.out.print("Enter your subject3 marks :");
	int c=z.nextInt();
	System.out.print("Enter your subject4 marks :");
	int d=z.nextInt();
	System.out.print("Enter your subject5 marks :");
	int e=z.nextInt();
	
	System.out.print("Enter total marks :");
	float f=z.nextFloat();

	float res=(((a+b+c+d+e)/f)*100);
	System.out.print("Percentage Mraks ="+res+"%");
}
}