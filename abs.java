import java.util.*;
class abs
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the no of elements in an array : ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements : ");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.println("Enter the pos of value to be found : ");
int m=s.nextInt();
System.out.println("The position is : ");
for(int i=0;i<n;i++)
{
if(a[i]==m)
{
System.out.println(i);
}}}}