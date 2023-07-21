import java.util.*;
class numnum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n*n;
		int sum=0;
		int digit=0;
		int q=m;
		while(m>0)
		{
			digit++;
			m=m/10;
		}
System.out.println(digit);
		int x=(int)Math.pow(10,(digit/2));
		while(q>0)
		{
			sum=sum+(q%x);
			q=q/x;
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

