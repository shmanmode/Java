/*4. Write a Java program to implement fibonacci series.*/

import java.util.*;
class Fibo
{
	public static void main(String[] args)
	{
		System.out.print("Enter limit : ");

		Scanner sc = new Scanner(System.in);  // scan
		int no = sc.nextInt();

		int a = 0 , b = 1;

		for(int i=0 ; i<=no ; i++)
		{
			int fn = a+b;
			a = b;
			b = fn;
			System.out.print("\n"+fn+"\n");
		}
	}
}