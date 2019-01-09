import java.io.*;
import java.util.*;

class ArmsIn {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,s,temp,b=0;
		a=sc.nextInt();
		s=sc.nextInt();
		
		for(int i=a+1;i<s;i++){
		    temp=i;
		    b=0;
		    while(temp!=0)
		{
		    b+=Math.pow(temp%10,3);
		    temp=temp/10;
		}
		if(i==b){
		    System.out.print(i+" ");
		}
		}
		
	}
}
