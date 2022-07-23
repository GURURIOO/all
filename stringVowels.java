package string;


import java.util.*;

public class stringVowels {
	static Scanner sc;
	public static void main(String[] args) {
	String vow="aeiou";
	char fie,sec;
	sc=new Scanner(System.in);
	System.out.println("enter an string:");
	String input=sc.next();
	int i=0;
	while(i<input.length()) {
		int j=0;
		while(j<vow.length()) {
			fie=input.charAt(i);
			sec=vow.charAt(j);
			if(fie==sec) {
				System.out.println(fie);
			}j++;
		}
		i++;
	}
	}

}
