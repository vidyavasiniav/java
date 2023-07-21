import java.util.*;
class rectangle
{
void display1()
{
System.out.println("rectangle");
Scanner a=new Scanner(System.in);
int l=a.nextInt();
int b=a.nextInt();
System.out.println("area of rectangle "+l*b);
}}
class triangle
{
void display2()
{
System.out.println("triangle");
Scanner s=new Scanner(System.in);
int base=s.nextInt();
int height=s.nextInt();
System.out.println("area of triangle "+0.5*base*height);
}} 
class circle
{
void display3()
{
System.out.println("circle");
Scanner c=new Scanner(System.in);
double PI=3.14;
int r=c.nextInt();
System.out.println("area of circle "+PI*(r*r));
}
}
class area
{
public static void main(String args[])
{
rectangle r=new rectangle();
triangle t=new triangle();
circle ci=new circle();
r.display1();
t.display2();
ci.display3();
}}