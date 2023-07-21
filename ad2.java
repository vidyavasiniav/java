class animal
{
void eat()
{
System.out.println("eating");
}}
class dog extends animal
{
void bark()
{
System.out.println("barking");
}}
class cat extends dog
{
void meow()
{
System.out.println("meowing");
}}
class ad2
{
public static void main(String args[])
{
cat x=new cat();
x.meow();
x.bark();
x.eat();
}}