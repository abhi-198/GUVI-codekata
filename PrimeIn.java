import java.io.*;
import java.util.*;
class PrimeIn {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,temp=1,b;
		a=sc.nextInt();
		b=sc.nextInt();
		for(int j=a+1;j<b;j++)
		{
		    temp=1;
		for(int i=2;i<=j/2;i++)
		{
		    if(j%i==0)
		    {
		        temp=0;
		        break;
		    }
		}
		if(temp==1){
		    System.out.print(j+" ");
		}
		}
		
	}
}
