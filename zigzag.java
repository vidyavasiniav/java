import java.util.*;
class zigzag
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in the array : ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of the array : ");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for (int i=1;i<=n-2;i+=2) 
{
int temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
System.out.println(Arrays.toString(a));
}}