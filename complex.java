import java.util.*;
class complex
{
void display()
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("sum or diff or product");
String b=s.next();
if(b.equals("sum"))
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(i==0&&j==0)
{
System.out.print(a[0][0]+a[1][0]+"+");
}
if(i==0&&j==1)
{
System.out.print((a[0][1]+a[1][1])+"i");
}
}
}
}
if(b.equals("diff"))
{
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(i==0&&j==0)
{
System.out.print(a[0][0]-a[1][0]+"+");
}
if(i==0&&j==1)
{
System.out.print((a[0][1]-a[1][1])+"i");
}
}
}
}
if(b.equals("product"))
{
System.out.print(((a[0][0]*a[1][0])-(a[0][1]*a[1][1]))+"+"+((a[0][1]*a[1][0])+(a[0][0]*a[1][1]))+"i");
}
}
public static void main(String[] args){
complex c=new complex();
c.display();
}
}