package string;

import java.util.*;

public class repedetString {
    static Scanner sc=new Scanner(System.in);
    static int o;
    static HashMap <Character,Integer>map=new HashMap<>();
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("enter an string :");
        String s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            o=0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)&&j!=i) {
                    System.out.println(s.charAt(i));

                    ++o;
                    }
            }
        }
        System.out.println(o);

    }
}
