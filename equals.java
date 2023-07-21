import java.util.*;
class equals
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("size of first array");
int n=s.nextInt();
System.out.println("size of second array");
int m=s.nextInt();
int a[]=new int[n];
int b[]=new int[m];
System.out.println("enter the elements of first array");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("enter the elements of second array");
for(int i=0;i<m;i++)
{
b[i]=s.nextInt();
}
if(a.length==b.length)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}}}
