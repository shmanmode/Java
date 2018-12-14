package Shapes;
import java.util.*;

public class Triangle
{
	
	public int  area()
	{
	System.out.print("Enter the Height of Triangle : ");
	System.out.print("Enter the Base of Triangle : ");
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		double b = sc.nextDouble();
		double a = (h*b)/2;
	//double b = 4*edge;

	System.out.println("Area of Triangle = "+a);
	//System.out.println("Enter Height = "+b);
	return 0;
}

}
