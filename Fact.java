import java.io.*;
import java.util.*;

class Fact {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,fact=1;
		a=sc.nextInt();
		while(a!=0)
		{
		    fact*=a;
		    a--;
		}
		System.out.println(fact);
		
	}
}
