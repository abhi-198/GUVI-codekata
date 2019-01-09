import java.io.*;
import java.util.*;
class Even {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		if(a%2!=0)
		{
		    a=a+1;
		}
		else
		{
		    a=a+2;
		}
		for(int i=a;i<b;i=i+2)
		{
		    System.out.print(i+" ");
		}
	
	}
}
