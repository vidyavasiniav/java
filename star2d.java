import java.util.*;
class star2d
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println();

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==0&&j==0||i==0&&j==2||i==2&&j==0||i==2&&j==2)
{
System.out.print(a[i][j]+a[1][1]+" ");
}
if(i==1&&j==1)
{
System.out.print(a[i][j]+" ");
}
if(i==0&&j==1||i==1&&j==0||i==1&&j==2||i==2&&j==1)
{
System.out.print("*"+" ");
}
}
System.out.println();
}
}}
