import java.util.*;
import java.lang.*;
 public class ex 
{
	public static void main(String args [])
	{try
		{
	Scanner user = new Scanner(System.in);
	int n ,m,result;
	System.out.println("Enter numerator");
	n= user.nextInt();
	System.out.println("Enter denominator");
	m= user.nextInt();
	result=n/m;
	System.out.println (result);
	}catch(ArithmeticException e)
	{
	System.out.print(e);
	System.out.println("Rest of the code....");
	}
}
}