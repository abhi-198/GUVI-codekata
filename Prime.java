import java.io.*;
import java.util.*;
class Prime {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,temp=1,b;
		a=sc.nextInt();
		for(int i=2;i<=a/2;i++)
		{
		    if(a%i==0)
		    {
		        temp=0;
		        break;
		    }
		}
		if(temp==1){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
		
	}
}
