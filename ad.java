import java.util.*;
class animal
{
void eat()
{
System.out.println("eating");
}}
class dog extends animal
{
void dog()
{
System.out.println("barking");
}}
class cat extends animal
{
void cat()
{
System.out.println("meowing");
}}
class hie
{
public static void main(String args[])
{
cat x=new cat();
x.cat();
x.eat();
dog y=new dog();
y.dog();
}}