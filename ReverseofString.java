import java.util.Scanner;

public class ReverseofString {

	public static void main(String[] args) {
	ReverseofString rev = new ReverseofString();
	Scanner Sc = new Scanner (System.in);
	System.out.println("Enter a String:");
	String str = Sc.nextLine();
	System.out.println("Reverse of a String is: "+rev.reverse(str));
	}

	private Object rev;

	private Object reverse(String s) {
		String rev = "";
		for(int j=s.length();j>0;--j) 
		{
			rev=rev+(s.charAt(j-1));
		}
		return rev;
	}	
	}


