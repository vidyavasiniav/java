import java.util.*;
class aa
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==n/2||j==n/2)
{
System.out.print("0 ");
}
else
{
System.out.print("1 ");
}
}
System.out.println();
}}}