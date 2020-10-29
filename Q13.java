
import java.util.*;
class Q13
{
	public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();

	if(a>b && a>c)
	{
	   System.out.println("Greatest number is : "+a);
	}
	else if(b>c)
	{

	   System.out.println("Greatest number is : "+b);  
	}
      
	else
	{
	   System.out.println("Greatest number is : "+c);
	}

}
}

/*{
	
	public static void main(String args[])
{
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	
	int d= c>(a>b?a:b)?c:(a>b?a:b);
	{
		System.out.println("Greater number is :"+d);
	}	
	
}

}*/





















