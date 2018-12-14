/*
2.Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.util.*;
class Rectangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width = ");
		double width = sc.nextDouble();

		 System.out.print("Enter Height = ");
                double height = sc.nextDouble();

			double area=width*height;
 			double perimeter= 2*(width+height);
		
		System.out.println("\nArea is "+width+" * "+height+" = "+area);
		System.out.println("\nperimeter is 2 * ("+width+" + "+height+") = "+perimeter);



}

}
