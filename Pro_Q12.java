import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		while(q-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int sum=0;
		    for(int i=a-1;i<b;i++){
		        sum+=arr[i];
		    }
		    System.out.println(sum);
		}
		
	}
}
