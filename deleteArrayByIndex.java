import java.util.*;
public class deleteArrayByIndex {
//		public static int[] removeTheElement(int[] arr, int index)
//		{
//			int[] anotherArray = new int[arr.length -1];
//			for (int i = 0, k = 0; i < arr.length; i++) {
//				if (i == index) {
//					continue;
//				}
//				anotherArray[k++] = arr[i];
//			}
//			return anotherArray;
//		}
//		public static void main(String[] args) {
//			Scanner scan = new Scanner (System.in);
//			System.out.println("enter the size of the array :");
//			int a= scan.nextInt();
//			int arr[]=new int[a+1];
//			for(int i =0;i<a;i++){
//				arr[i]=scan.nextInt();
//			}
//			
//			System.out.println("enter the index of the element :");
//			int in= scan.nextInt();		
//			arr = removeTheElement(arr, in);
//			System.out.println("Resultant Array: "+ Arrays.toString(arr));
//		}
//	
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = scan.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("enter the index to del:");
		int ind=scan.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("enter the value for element "+i+":");
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.println("the element in array a "+a[i]);
			
		}
		for(int i=0,j=0;i<n;i++){
			if(i==ind){
				continue;
			}
			b[j++]=a[i];
			
		}
		System.out.println("");

		for(int i=0;i<n-1;i++){
			System.out.println("the element in array b "+b[i]);
			
		}


	}

}
