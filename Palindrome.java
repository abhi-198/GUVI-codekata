import java.io.*;
import java.util.*;
class Palindrome {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,rev=0,temp,b;
		a=sc.nextInt();
		temp=a;
		while(temp!=0)
		{
		    b=temp%10;
		    rev=(rev*10)+b;
		    temp=temp/10;
		}
		if(a==rev){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
		
	}
}
