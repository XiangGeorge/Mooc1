package Lecture4;
import java.util.Scanner;
public class Lecture4_2 {
	public static void main(String[] args)
	{
		System.out.println("please input a number, from -100000 to 100000");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while ( n>100000 || n< -100000 ) 
		{
			System.out.println("please reput your number");
			n = in.nextInt();
		}
		if (n<0) 
		{
			System.out.print("fu"+' ');
		}
		if (n%10==0) 
		{
			n=Math.abs(n);
			int m=n;
			int h=0;
			while (n !=0 ) 
			{
				h=n;
				n=n/10;
			} 
			String[] name = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
			System.out.print(name[h]);
			m=m/10;
			while (m != 0) 
			{
				System.out.print(' '+"ling");
				m=m/10;
			}
		}
		else 
		{
			read_number(Math.abs(n));
		}
//		int [] number_=new int[10];
//		number_[0]=1;
//		number_[1]=2;
//		System.out.println(number_);
		
		in.close();
		
	}
	
	public static void read_number(int num)
	{
		int m;
		int ctr = num;
		int number = 0;
		while (num != 0) 
		{
			int h;
			h=num%10;
			num=num/10;
			number=10*number+h;
		}
		String[] name = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
		do 
		{
			m=number%10;
			System.out.print(name[m] + ' ');
			ctr=ctr/10;
			number=number/10;
			
		}while(ctr>0);
	}

}
