import java.util.*;
class qua
{
void quad()
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
}}
class para extends qua
{
void parall()
{
Scanner s1=new Scanner(System.in);
int b=s1.nextInt();
int h=s1.nextInt();
System.out.println("Area of parallelogram : ");
System.out.println(b*h);
}}
class rec extends qua
{
void rect()
{
Scanner s2=new Scanner(System.in);
int l=s2.nextInt();
int b=s2.nextInt();
System.out.println("Area of rectangle : ");
System.out.println(l*b);
}}
class sq extends qua
{
void sqr()
{
Scanner s3=new Scanner(System.in);
int a=s3.nextInt();
System.out.println("Area of square : ");
System.out.println(a*a);
}}
class area2
{
public static void main(String args[])
{
para p=new para();
p.parall();
rec r=new rec();
r.rect();
sq s=new sq();
s.sqr();
}}