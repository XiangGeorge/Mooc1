package Lecture2;

import java.util.Scanner;

public class Lecture2 {

	public static void main (String[] args) 
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Please input Beijing Time: ");
		int BjTime = in.nextInt();
		int m = BjTime%10;
		int h = (BjTime%100 - BjTime%10)/10;
		int n = (BjTime - BjTime%100)/100;
	//	System.out.print((0-8)%24);
		if (n > 8)
		{
			System.out.print("UCL时间为：" + (n-8) + h + m);
		}
		else
		{
			System.out.print("UCL的时间为: " + (24-Math.abs(n-8)) + h + m );
		}
		
		in.close();
		
	}
}
