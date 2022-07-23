package string;
import java.util.Scanner;
public class numWordsInString {
	static Scanner sc=new Scanner(System.in);
	static String [] ann;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter an string :");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++){
			ann=s.split(" ");
		}
		int g=0;
		for (String c : ann) {
			if(c.equals("")){
				continue;
			}else{
			g++;}
		}
		System.out.println(g);
	}	
}