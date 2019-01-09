import java.io.*;
import java.util.*;
class Odd {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a%2!=0)
		{
		    a=a+1;
		}
		for(int i=a+1;i<b;i=i+2)
		{
		    System.out.print(i+" ");
		}
	
	}
}
