
import java.util.*;
public class printSmallCapNum {
	static Scanner sc;
	public static void main(String[] args) {
		char c;
		int a;
		sc = new Scanner(System.in);
		System.out.println("enter an string :");
		String input = sc.next();
		String cap="",smal="",num="",simb="";
		for(int i=0;i<input.length();i++) {
			c=input.charAt(i);
			a=c;
			if(a>64&&a<91) {
				cap+=c;
			}
			else if(a>96&&a<123) {
				smal+=c;
			}
			else if(a>47&&a<58) {
				num+=c;
			}else {
				simb+=c;
			}
		}
		System.out.println("CAPITAL LETTER :"+cap+"\n");
		System.out.println("SMALL LETTER :"+smal+"\n");
		System.out.println("NUMBER LETTER :"+num+"\n");
		System.out.println("SYMBOL :"+simb+"\n");
	}

}
