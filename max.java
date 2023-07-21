import java.util.*;
class max
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int max;
System.out.println("Enter the no. of elements in the array : ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of the array : ");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the value of k : ");
int k=s.nextInt();
for(int i=0;i<=n-k;i++)
{
max=a[i];
for(int j=1;j<k;j++)
{
if(a[i+j]>max)
max=a[i+j];
}
System.out.print(max+" ");
}}}