package Lecture3;

import java.util.Scanner;

public class Lecture3 {
    public static void main (String[] agrs) 
    {
    	    System.out.println("please input your numbers, and end with -1: ");
    	    Scanner in = new Scanner(System.in);
    	    int a = in.nextInt();
    	    int odd = 0;
    	    int even = 0;
    	    while ( a != -1 )
    	    {
    	    	    if ( a%2 ==0 ) 
    	    	    {
    	    	    	    odd = odd + 1;
    	    	    }
    	    	    else 
    	    	    {
    	    	    	    even = even + 1;
    	    	    }
    	    	    a = in.nextInt();
    	    }
    	    System.out.print("Total amount of odd number: " + odd + " Total amount of even number: " + even);
    	    in.close();
    }
}
