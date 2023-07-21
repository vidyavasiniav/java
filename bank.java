import java.util.*;
class bankA
{
static int getbalance(int a)
{
return a;
}}
class bankB
{
static int getbalance(int b)
{
return b;
}}
class bankC
{
static int getbalance(int c)
{
return c;
}}
class bank
{
public static void main(String args[])
{
bankA s=new bankA();
int x=s.getbalance(1000);
bankB s1=new bankB();
int y=s1.getbalance(1500);
bankC s2=new bankC();
int z=s2.getbalance(2000);
System.out.println("bankA : "+x);
System.out.println("bankB : "+y);
System.out.println("bankC : "+z);
}}