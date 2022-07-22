import java.util.Scanner;
public class ajai {

	public static void main(String[] args) {
		Scanner ni= new Scanner(System.in);
		int arr[]=new int[100];
		int a=ni.nextInt();
		int b=7;
		for(int i=0;i<a;i++){
			arr[i]=ni.nextInt();
		}
		for(int i=a;i>=0;i--){
			if(i==2){	
				arr[i]=b;
				break;
			}else{
				arr[i]=arr[i-1];
			}
		}
		for(int i=0;i<a+1;i++){
			System.out.println(arr[i]);
		}
    
	}

}
