import java.io.*;
import java.util.*;

class Arms {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,temp,b=0;
		a=sc.nextInt();
		temp=a;
		while(temp!=0)
		{
		    b+=Math.pow(temp%10,3);
		    temp=temp/10;
		}
		if(a==b){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}
