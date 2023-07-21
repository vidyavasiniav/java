import java.util.*;
class rectangle{
int length;
int breath;
void rect(){
System.out.println("Area of rectangle : "+length*breath);
}}
class square{
int a;
void sq(){
System.out.println("Area of square : "+a*a);
}}
class circle{
int r;
void cir(){
System.out.println("Area of circle : "+3.14*r*r);
}}
class area1{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
rectangle r1=new rectangle();
r1.length=s.nextInt();
r1.breath=s.nextInt();
r1.rect();
square s1=new square();
s1.a=s.nextInt();
s1.sq();
circle cr=new circle();
cr.r=s.nextInt();
cr.cir();
}}