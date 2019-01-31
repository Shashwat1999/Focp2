import java.util.Scanner;
class Vehicle
{
	 void display ()
	{
	System.out.println ("This is a Vehicle");
	}
}
class Car extends Vehicle
{
	 void display ()
	{
	System.out.println ("This is a car");
	}
}
class Bike extends Vehicle
{
	 void display ()
	{
	System.out.println ("This is a bike ");
	}
}
 class Lect7b
 {
 public static void main (String args[])
 {
 Scanner user= new Scanner (System.in);
 System.out.println ("Enter the number of tyres");
 int x = user.nextInt();
 Vehicle veh = new Vehicle();
 Car ca = new Car ();
 Bike bik = new Bike();
 switch (x)
 {
 	case 2 : 
 	bik.display();
 	break;
 	case 4:
 	 ca.display();
 	 break;
 	default:
 	veh.display();
 }
 }
 }
 