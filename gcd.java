import java.util.*;
public class gcd {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the value of a:");
		int a=scan.nextInt();
		System.out.println("enter the value of b:");
		int b=scan.nextInt();
		if (a!=b) {
			if (a > b) {
				int div = b;
				while (0 < 1) {
					if (a % div == 0 && b % div == 0) {
						System.out.println("the gcd of " + a + " and " + b + " is " + div);
						break;
					} else {
						div--;
					}
				}
			}
			if (b > a) {
				int div = a;
				while (0 < 1) {
					if (a % div == 0 && b % div == 0) {
						System.out.println("the gcd of " + a + " and " + b + " is " + div);
						break;
					} else {
						div--;
					}
				}
			} 
		}
		else {
			System.out.println("the gcd is"+a);
		}
	}

}
