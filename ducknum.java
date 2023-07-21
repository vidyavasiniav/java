import java.util.*;
class main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Input:");
		String s1=s.next();
		int len=s1.length();
		if(s1.charAt(0)=='0')
		{
			System.out.println("Not a duck NUmber");
		}
		else
		{
			System.out.println("Duck Number");
		}
	}
}
