import java.util.Scanner;
public class digit5 {
public static void main (String[] args) 
{
int x,a,b,c,d,e,f,h,i;
Scanner s= new Scanner(System.in);
do {
System.out.println("Enter a 5 digit number ");
x = s.nextInt();
System.out.println("The entered number is " +x);


if (x>=10000 && x<=99999)
{
	System.out.println("The Entered number is a 5 digit number");
	//Number be 12345 = x
 a = x/10000;        // we get 1 = a
 b = x - (a*10000); // 12345 - 10000 = 2345 = b
 c = b/1000;        // 2345/1000 = 2 = c
 d = b - (c*1000);  // 2345 - 2000 = 345 = d
 e = d/100;         //345/100 = 3 = e
 f = d-(e*100);     // 345-300 = 45 =f
 h = f/10;         // 45/10 = 4 = h
 i = f- (h*10);    // 45-40 = i

 System.out.println("The 5 DIGITS in the given number are  : "+a+"    "+c+"    "+e+"    "+h+"    "+i );
}
else
{
	System.out.println("ERROR !!");
}


}
while (1==1);

}
	
}