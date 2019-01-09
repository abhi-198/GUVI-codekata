import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		int power=1;
		for(int i=0;i<b;i++)
		{
		    power*=a;
		}
		System.out.print(power);
		
	}
}
