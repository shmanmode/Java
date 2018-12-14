/*3. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/

import java.util.*;
class Temp
{
	public static void main(String[] args)
	{
		System.out.print("Input a degree in Fahrenheit : ");

		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * 5/9 ;

		System.out.println("Expected Output : ");
		System.out.println(fahrenheit+" degree Fahrenheit is equal to "+celsius+" in Celsius");
	}
}