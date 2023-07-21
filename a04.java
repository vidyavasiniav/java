import java.util.*;
class a04
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
		for(int j=0;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[j]<a[k])
				{
					System.out.println(a[j]+"="+a[k]);
					break;
				}
			}
			if(a[j]==a[n-1])
			{
				System.out.println(a[j]+"=-1");
			}
		}
	}
}