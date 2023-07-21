import java.util.*;
abstract class sh
{
abstract void shape1();
}
class rectangle
{
void shape1()
{
Scanner s=new Scanner(System.in);
System.out.println("Length : ");
int l=s.nextInt();
System.out.println("Breath : ");
int b=s.nextInt();
System.out.println("Area of Rectangle : "+l*b);
}
}
class triangle extends rectangle
{
void shape1()
{
Scanner s=new Scanner(System.in);
System.out.println("Length : ");
int l=s.nextInt();
System.out.println("Breath : ");
int b=s.nextInt();
System.out.println("Height : ");
int h=s.nextInt();
System.out.println("Area of Triangle : "+0.5*l*b*h);
}
}
class circle extends triangle
{
void shape1()
{
Scanner s=new Scanner(System.in);
System.out.println("Radius : ");
int r=s.nextInt();
System.out.println("Area of Circle : "+3.14*r*r);
}}
class absshape
{
public static void main(String args[])
{
rectangle r=new rectangle();
triangle t=new triangle();
circle c=new circle();
r.shape1();
t.shape1();
c.shape1();
}
}


