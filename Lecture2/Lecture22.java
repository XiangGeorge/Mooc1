package Lecture2;

import java.util.Scanner;

public class Lecture22 {
	
	public static void main (String[] args) 
	{
		System.out.println("please the number, from 11(included) to 44(included): ");
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = a%10;
		int c = (a - a%10)/10;
		switch ( b ) 
		{
		    case 1 :
		    	    System.out.print("unreadable, ");break;
		    case 2 :
		    	    System.out.print("barely unreadable, ");break;
		    case 3:
		    	    System.out.print("readable with difficulty, ");break;
		    case 4:
		    	    System.out.print("pratically readable, ");break;
		    	default:
		    		System.out.print("error");
		}
		switch ( c ) 
		{
		    case 1:
		    	    System.out.print("Faint signals, barely perceptible");break;
		    case 2:
		    	    System.out.print("Very weak signals");break;
		    case 3:
		    	    System.out.print("Weak signals");break;
		    case 4:
		    	    System.out.print("Fair signals");break;
		    	default:
		    		System.out.print("error");
		}
		in.close();
	}

}
