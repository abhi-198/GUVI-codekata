import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]= sc.nextInt();
		}
		int flag = 0;
		for(int i=1;i<n-1;i++){
		    int sum =0;
		    int avg =0;
		    for(int j=0;j<n;j++){
		        if(j<=i){
		            sum+=arr[j];
		        }
		        else{
		            avg+=arr[j];
		        }
		    }
		    if(sum/(n-i)==avg/(i)){
		        System.out.println("yes");
		        flag=1;
		        break;
		    }
		}
		if(flag==0){
		    System.out.println("no");
		}
	}
}
