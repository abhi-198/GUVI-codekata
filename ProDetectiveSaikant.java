/*package whatever //do not write package name here */

import java.util.*;
class GFG {
    static Map<Integer,Integer> map = new HashMap<>();
    static long pattern(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            if(map.containsKey(n)){
                return map.get(n);
            }
            else{
                return pattern(n-1)+pattern(n-2);
            }
        }
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    long sum =0;
	    for(int i=0;i<n;i++){
	        sum+=pattern(sc.nextInt());
	    }
	    System.out.println(sum);
	}
}
