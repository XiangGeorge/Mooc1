package Lecture_7;
import java.util.Scanner;
import java.util.ArrayList;

//Factorization

public class Assignment_1 {
	public static void main (String[] agrs){
		System.out.println("input a number, from 2 to 100000(included)");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<Integer> list2= new ArrayList<Integer>();
		//here should inculded one exceptation, learn how to do it
		list2 = result(num);
		System.out.print(list2);
		in.close();
		
	}
	
	public static ArrayList<Integer> result(int data) 
	{
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		double cte= Math.sqrt(data);
		if (cte<2) 
		{
			list2.add(data);
		}
		else 
		{
			int ctr=0;
			for (int i=2; i< (cte+1); i++) 
			{
				if (data%i == 0) 
				{
					int temp=data/i;
					list2=result(i);
					list3=result(temp);
					list2.addAll(list3);
					ctr -= 10;
				}
				ctr += 1;
				if (ctr == Math.floor(cte)) 
				{
					list2.add(data);
				}
			}
		}
		return list2;
		
	}

}
