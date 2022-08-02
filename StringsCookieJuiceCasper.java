import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    boolean flag=true;
		    String ar[]=new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        ar[i]=sc.next();
		    }
		    if(ar[n-1].equals("cookie"))
		    {
		        flag=false;
		    }
		    else
		    {
    		    for(int i=0;i<n-1;i++)
    		    {
    		        if(ar[i].equals("cookie") && (!(ar[i+1].equals("juice"))))
    		        {
    		            flag=false;
    		            break;
    		        }
    		    }
		    }
    		
		    if(flag)
		    {
		        System.out.println("Yes, followed parents instructions");
		    }
		    else
		    {
		        System.out.println("No, Disobeyed -_- ");
		    }
	}
}
