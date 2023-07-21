import java.util.*;
class arrayadd
{
public static void main(String srgs[])
{
int a[]={1,2,3,4,5};
int b[]={6,7,8,9,10};
int c[]=new int[5];
int i,j=5;
for(i=0;i<5;i++)
{
c[j-1]=b[i];
j=j-1;
}
for(i=0;i<5;i++)
{
int sum=a[i]+c[i];
System.out.print(sum+" ");
}}}

