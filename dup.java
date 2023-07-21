import java.util.*;
class dup
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    int count;
    a=a.toLowerCase();
    String[] b=a.split(" ");
    for(int i=0;i<b.length;i++)
    {
      count=1;
      for(int j=i+1;j<b.length;j++)
      {
        if(b[i].equals(b[j]))
        {
          count++;
          b[j]="0";
        }
      }
      if(count>1&&b[i]!="0")    
        System.out.println(b[i]);
    }  
  }
}