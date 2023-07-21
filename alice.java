import java.util.*;
class alice
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int count=0;
	System.out.println();
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println();
	for(int i=0;i<1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]!=a[j])
			{
				count++;
			}
		}
	}
	System.out.println(count++);
	}
}