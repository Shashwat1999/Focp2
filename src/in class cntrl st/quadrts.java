import java.util.Scanner;
class prog21{
	public static void main (String[] args)
	{
	int a,b,c;
	 double r1,r2,d;
	Scanner user= new Scanner (System.in);
	System.out.println("The given quadratic equation is of type ax^2 + bx +c");
	System.out.println ("Enter the value of a");
	a = user.nextInt();
	System.out.println ("Enter the value of b");
	b = user.nextInt();
	System.out.println ("Enter the value of c");
	c = user.nextInt();
	System.out.println ("The given quadratic equation is : "+a+"x^2+" +b+ "x +" +c) ;
    d= b*b - (4*(a*c)); 
	if (d>0)
	{
	System.out.println("The roots are real and unequal");
	r1= (-b+ Math.sqrt(d))/2*a;
	r2= (-b- Math.sqrt(d))/2*a;
	System.out.println("The first root of equation  ="+r1);
	System.out.println("The second root of equation=" +r2);

	}
	else if (d==0)
	{
	System.out.println("The roots of the equation are real and equal");
	r1=(-b + Math.sqrt(d))/2*a;
	System.out.print("The  roots of equation are  = (+)/(-)"+r1);
	

	}
	else
	{System.out.println("The roots are imaginary");}
	}
} 