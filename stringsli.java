import java.util.*;
public class stringsli {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter an string");
		String s=sc.nextLine();
		System.out.println("enter an number:");
		int l=sc.nextInt();
		int ii=0;
		for (int i = 0; i < s.length()/l; i++) {
			s+=" ";
			String c="";
			for (int j = 0; j < l; j++) {
				c+=s.charAt(ii++);
			}
			System.out.println(c);
		}
	}

}
