package Shapes;
import java.util.*;

public class Square
{
	
	public int area()
	{
	System.out.print("Enter the length of edge : ");
	Scanner sc= new Scanner(System.in);
	float edge = sc.nextFloat();
	float a = edge*edge;
	float b = 4*edge;
	System.out.println("Area os square= "+a);
	System.out.println("Enter Height = "+b);
	return 0;
}

}

