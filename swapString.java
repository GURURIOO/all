package string;

import java.util.Scanner;

/**
 * swapString
 */
public class swapString {
static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter an string ");
        String s1=sc.nextLine();
        System.out.println("enter an string ");
        String s2=sc.nextLine();
        int x=s1.length(),y=s2.length();
        s1=s1+s2;
        s2=s1.substring(0, x);
        s1=s1.substring(x, x+y);
        System.out.println("the swaped strings are :");
        System.out.println(s1);
        System.out.println(s2);
    }
}