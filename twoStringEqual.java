package string;

import java.util.Scanner;

public class twoStringEqual {
    static Scanner Sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter an string :");
        String a1=Sc.nextLine();
        System.out.println("enter an string :");
        String a2=Sc.nextLine();
        String g="good";
        for (int i = 0; i < a1.length(); i++) {
            if(a1.charAt(i)!=a2.charAt(i)){
                g="bad";
                break;
            }
        }
        if(g=="good"){
            System.out.println("the strings are equal ");
        }else{
            System.out.println("the strings are not equal ");
        }
    }
}
