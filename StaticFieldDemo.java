
import java.util.*;
public class StaticFieldDemo
{	
	static int a;	
	public static void main(String args[])	
	{
		String s;		
		int b,c;		
		Scanner sc= new Scanner(System.in);		
		System.out.print("Enter a StaticField number");		
		s=sc.nextLine();		
		String[] field=s.split("\\s+");		
		a=Integer.parseInt(field[0]);		
		b=Integer.parseInt(field[1]);		
		c=Integer.parseInt(field[2]);		
		System.out.println("a1 = A [instanceField = "+b+", aStaticField = "+a+"]");		
		System.out.println("a2 = A [instanceField = "+c+", aStaticField = "+a+"]");		
		System.out.println("A.aStaticField = "+a);
        sc.close();			
	}
}