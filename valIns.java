import java.util.Scanner;
public class valIns {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}
		System.out.println("enter the index to delete:");
		int in=scan.nextInt();

		for(int i=in;i<n-1;i++){
			a[i]=a[i+1];
		}
		for(int i=0;i<n-1;i++){
			System.out.println("the value in the array "+a[i]);
		}

	}
}
