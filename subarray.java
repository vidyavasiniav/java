import java.util.*;
class subarray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in the array : ");
int n=s.nextInt();
System.out.println("Enter the value : ");
int k=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of the array : ");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int mul;
int count=0;
for(int i=0;i<n;i++)
{
if(a[i]<k)
{
count++;
}
mul=a[i];
for(int j=i+1;j<n;j++)
{
mul=mul*a[j];
if(mul<k)
{
count++;
}
}
}
System.out.println(count);
}}