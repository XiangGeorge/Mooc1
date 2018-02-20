package Lecture_7;
import java.util.Scanner;
import java.util.ArrayList;

//calculating perfect number

public class Assignement_2 {
	public static void main (String[] agrs){
		System.out.println("input a number, from 2 to 100000(included)");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		ArrayList<Integer> list_perfect= new ArrayList<Integer>();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		//here should inculded one exceptation, learn how to do it
		if (num1>num2) 
		{
			System.out.println("please put lower ranger first");
		}
		else if (num1==1 && num2==1) 
		{
			System.out.println('1');
		}
		else 
		{
			
			for (int i = num1; i<(num2+1); i++) 
			{
				int sum = 0;
				list2 = result(i);	
				for (int h = 0; h < list2.size(); h++) 
				{
					sum = sum + list2.get(h);
				}
				if (sum==i) 
				{
					list_perfect.add(i);
				}
			}
		
			System.out.println(list_perfect);
		}
		
		in.close();
		
	}
	
	public static ArrayList<Integer> result(int data) 
	{
		ArrayList<Integer> list2 = new ArrayList<Integer>();
			for (int i=1; i< data; i++) 
			{
				if (data%i == 0) 
				{
					list2.add(i);
				}
				
			}
		return list2;
	}

}
