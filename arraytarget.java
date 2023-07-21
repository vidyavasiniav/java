import java.util.*;
class arraytarget
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println();
		int target=s.nextInt();
		int i,j;
		int num=0;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==target)
				{
					num=target;
				}
			}
		}
		if(target==num)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}