package string;
import java.util.Scanner;
public class stringPal {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter an string :");
		String input= sc.nextLine();
		String rev="";
		for(int i=input.length()-1;i>-1;i--){
			rev=rev+input.charAt(i);
		}
		System.out.println(rev);

	}
}
