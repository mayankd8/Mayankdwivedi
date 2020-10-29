import java.util.*;
class Q4
{
	public static void main(String args [])
{
	Scanner sc=  new Scanner(System.in);
	byte a=sc.nextByte();
	byte b=sc.nextByte();
	
	byte c;
	c = (byte) (a + b);   //typecsating value of (a+b)	
	System.out.println(c);
}
}

/*
import java.util.Scanner;
class Q4

{
    public static void main(String[] args) 
    {
        byte a, b;
        int x, y, z;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first byte value:");
        a = s.nextByte(); //taking input from user  in byte variables
        x = a; 		  //storing "byte var" value in "int" variables
        System.out.print("Enter second byte value:");
        b = s.nextByte(); 
        y = b;
        z = x + y;	//adding two "int" variables
        System.out.println("Result:"+z);	//printing value of z
     }

}
*/