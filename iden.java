import java.util.*;
class iden
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int i;
int j;
boolean flag=true;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println();
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
if(a[i][j]==1)
{
flag=true;
}
}
else
{
flag=false;
}
}}
if(flag)
{
System.out.println("It is an identity matrix");
}
else
{
System.out.println("It is not an identity matrix");
}
}}