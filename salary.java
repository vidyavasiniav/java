import java.util.*;
class salary
{
void addsalary()
{
int x;
if(x<500)
{
System.out.println("Add salary: "+(x+50));
}}
void addwork()
{
int x;
int y;
if(y>6)
{
System.out.println("Salary for extra work : "+(x+5));
}}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
salary sr=new salary();
System.out.println("Salary : ");
int x=s.nextInt();
System.out.println("working hours per day : ");
int y=s.nextInt();
sr.addsalary();
sr.addwork();
}}