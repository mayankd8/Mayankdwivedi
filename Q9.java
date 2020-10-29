import java.util.*;
class Q9
{
	public static void main(String args[])
{	int d,y,m,day;
	Scanner s =new Scanner(System.in);
	d=s.nextInt();	
	y=d/365;

	d=d%365;
	System.out.println("Number of years: "+y);
	
	m=d/30;
	d=d%30;
	System.out.println("Number of months: "+m);
	
	day=d;
	System.out.println("Number of days: "+day);

		
}
}