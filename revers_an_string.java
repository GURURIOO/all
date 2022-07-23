package string;


import java.util.*;
public class revers_an_string {
	static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.println("enter an string to reverse : ");
		String input=sc.next(); 
		StringBuilder input1 = new StringBuilder();
		String rev="";
		char a;
		for(int i=0;i<input.length();i++) {
			a=input.charAt(i);
			rev=a+rev;
		}
		input1.append(rev);
		System.out.println(rev);
		System.out.println(input1.reverse().toString());
	}
}
