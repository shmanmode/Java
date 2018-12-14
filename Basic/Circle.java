package Shapes;
import java.util.*;

public class Circle
{
	
	public int area()
	{
	System.out.print("Enter the radius pf circle : ");
	Scanner sc= new Scanner(System.in);
	double r = sc.nextDouble();
	double a = 3.15*r*r;
	double b = 2*3.14*r;
	System.out.println("Area os Circle= "+a);
	System.out.println("Circumference of Circle = "+b);
	return 0;
}

}
