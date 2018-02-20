package Lecture3;

import java.util.Scanner;

public class Lecture3_2 {
	
	public static void main(String[] args) 
	{
		System.out.println("please input your number, range: (0, 100000): ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int i = 1;
		int sum = 0;
		if ( a > 0 ) 
		{
			for ( ; a>0 ; i++) 
			{
			    int b = a%10;
			    if ( (b % 2 == 0 && i % 2 == 0 ) || ( b % 2 != 0 && i % 2 != 0)) 
			    {
			    	    sum = (int) (sum + Math.pow(2, ( i - 1 )));
			    }
			    a = a/10;
			    
			}
		}
		else 
		{
			System.out.println("fuck off");
		}
		System.out.println("this is the number requied: " + sum);
		in.close();
	}

}
