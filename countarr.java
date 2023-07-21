import java.util.*;
class countarr
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int count=0;
int i;
int j;
System.out.println("Enter the size of array: ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of array: ");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;i<n;i++)
{
if(a[i]==a[j])
{
count++;
}
}
}
System.out.println("Count : "+count);
System.out.println("duplicate elements");
for(i = 0; i < a.length; i++) {  
            for(j = i + 1; j < a.length; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
}}

