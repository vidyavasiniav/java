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
System.out.println("Area of parallelogram : ");
System.out.println(x*y);
}}
class rec extends qua
{
void rect()
{
System.out.println("Area of rectangle : ");
System.out.println(x*y);
}}
class sq extends qua
{
void sqr()
{
System.out.println("Area of square : ");
System.out.println(x*x);
}}
class area2
{
public static void main(String args[])
{
para p=new para();
p.qua();
p.parall();
rec r=new rec();
r.rect();
sq s=new sq();
s.sqr();
}}