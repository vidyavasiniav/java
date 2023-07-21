import java.util.*;
class abs1
{
abstract void ab();
}
class abs2
{
void ab()
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
}}
class abs3 extends abs2
{
void ab()
{
System.out.println("Enter the pos of value to be found : ");
int m=s.nextInt();
System.out.println("The position is : ");
for(int i=0;i<n;i++)
{
if(a[i]==m)
{
System.out.println(i);
}}}}
class abstract
{
public static void main(String args[])
{
abs1 a=new abs3();
a.ab();
}}