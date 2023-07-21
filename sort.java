import java.util.*;
class numnum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n*n;
		int sum=0;
		int x;
		int y;
		if(m>0 && m<10000)
		{
			x=m%100;
			y=m/100;
			sum=x+y;
		}
		else
		{
			x=m%1000;
			y=m/1000;
			sum=x+y;
		}			
		if(sum==n)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}

