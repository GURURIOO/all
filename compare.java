import java.util.*;
public class compare {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter 5 number: ");
		HashMap<Integer,Integer> map=new HashMap<>();
		int [] a=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			int count=1;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]&&i!=j) {
					count++;
				}
			}
			map.put(a[i],count);
		}
		for(Integer m : map.keySet() ){    
		    System.out.println(m+" "+map.get(m));    
		   }  
	}
}
