import java.util.*;
class digit
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
while(a>9)
{
int sum=0;
while(a>0)
{
sum=sum+a%10;
a=a/10;
}
a=sum;
}
System.out.println(a);
}}
