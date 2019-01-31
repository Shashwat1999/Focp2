class Circle 
{
	double Radius ;
	String Color;
	Circle ()
	{
	this.Radius=1.0;
	this.Color="red";
	}
	Circle (double r)
	{
	this.Radius=r;
	}
	Circle (double r , String col)
	{
	this.Radius=r;
	this.Color=col;
	}
	public double getRadius ()
	{
	return Radius;
	}
	
	public void setRadius (double r)
	{
	this.Radius=r;
	}
	public String getColor ()
	{
		return Color;
	}
	public void setColor( String col)
	{
	this.Color=col;
	}
	public double getArea( )
	{
		double area= 3.14*Radius*Radius;
		return area;
	}

}
 class Cylinder extends Circle
 {
      double Height;
      Cylinder()
      {
      	this.Height=1.0;
      }
      Cylinder(double r)
      {
      	this.Radius=r;

      }
      Cylinder(double r,double h)
      {
      	this.Radius=r;
      	this.Height=h;
      }
      Cylinder ( double r,double h,String col)
      {
      	this.Radius=r;
      	this.Height=h;
      	this.Color=col;
      }
      public double getHeight()
      {
      	return Height;
      }
      public void setHeight( double h)
      {
        this.Height=h;
      }
      public double getVolume ()
      {
      	double volume =(super.getArea())*Height;
      	return volume; 
      }
 }
 class Lecture7
 {
 	public static void main (String args [])
 	{
 		Cylinder cy = new Cylinder();
 		
 		//cy.setRadius(2);
 		//cy.setHeight(5);
 		//cy.setColor("red");
 		System.out.println( "volume="+cy.getVolume()+"\ncolor:"+cy.getColor());
 	}
 }