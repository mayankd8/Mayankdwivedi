import java.util.*;
class Expression
{
	public void Expression1(int x)
	{
	 int y=x*x+3*x-7;
	  System.out.println(y);
	}
	

	public void Expression2(int x)
	{
	  int y=x++ + ++x;
	  System.out.println(x+" "+y);
	}

	public void Expression1(int x,int y)
	{
	 int z=x++ - --y - --x + x++;
	  System.out.println(x+" "+y+" "+z);
	}

	public void Expression1(boolean x,boolean y)
	{
	boolean z=x && y || !(x||y);
	System.out.println(x+" "+y+" "+z);	
	}

}

class Q3
{
	public static void main(String args[])
{
	Expression e= new Expression();

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter value of x :");
	int a=sc.nextInt();
	System.out.print("Enter value of y :");
	int b=sc.nextInt();
	System.out.print("Enter Boolean Input1 :");
	boolean c=sc.nextBoolean();
	System.out.print("Enter Boolean Input2 :");
	boolean d=sc.nextBoolean();

	e.Expression1(a);
	e.Expression2(a);
	e.Expression1(a,b);
	e.Expression1(c,d);
}

}