package Lecture4;

import java.util.Scanner;

public class Lecture4_1 {
	
	public static void main (String[] args) 
	{
		System.out.println("what is the range: ");
		System.out.println("PS:n<=m<=200");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int w = 1;
		int i = 0;
		int sum = 0;
		if ( n<=m && m <= 200 ) 
		{			
			// the major cycle
				OUT:
				for (; ; w=w+2) 
				{
					for (int h = 2 ; h <= ((int)(Math.sqrt(w))+1);) 
					{
						if (w%h ==0) 
						{
							continue OUT;
						}
						else 
						{
						    i=i+1;	
						    if ( i == n ) 
							{
							    break OUT;	
							}
						    else 
						    { 
						        continue OUT;
						    }
						} 
					}
			    }
		for ( ; n<=m ; ) 
		{
			sum = sum + w;
			w = w+2;
			n++;
			
		}
			
			System.out.print(w + " " + i + " " + n + "sum: " + sum);
		}
		
		in.close();
	}

}
