import java.util.Scanner;
public class prog23 {
public static void main (String[] args) 
{
float x,y,Y,X;
Scanner s= new Scanner(System.in);
do {
System.out.println("Enter a Decimal number");
x = s.nextFloat();
System.out.println("Enter another Decimal number");
y = s.nextFloat();
X= 0.3f*x;
Y= 0.3f*y;
if (X==Y)
{
	System.out.println("Numbers are Equal");
}
else
{
	System.out.println("Numbers are unequal");
}
}
while (1==1);
}
	
}