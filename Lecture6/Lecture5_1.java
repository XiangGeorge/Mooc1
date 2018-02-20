import java.util.ArrayList;
import java.util.Scanner;
public class Lecture5_1 {
	public static void main(String[] args) 
	{
		System.out.println("please enter a line of English, ends with '.'");
		Scanner in = new Scanner(System.in);
		String line= in.next();
		
		ArrayList<Integer> list = new ArrayList<Integer>();  
		while (!line.substring((line.length()-1)).equals(".")) 
		{
			int s=0;
			s=line.length();
			list.add(s);
			line=in.next();
		}	
		list.add((line.length()-1));
		System.out.println(list);
		in.close();
		
		
	
		
		
		
	}
	

}
