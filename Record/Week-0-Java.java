//Week 0

//1. Program to Print "Hello World"

class hello_world
{
public static void main(String a[])
{
System.out.println("Hello World");
}
}
 
//2. Program to check if a number is prime or not.

import java.util.*;
public class prime
{
public static void main(String[] args)
{
int num=7;
int count=0;
for(int i=2;i<=num/2;i++)
{
if (num%i==0)
{
System.out.println("Not prime");
count++;
break;
}
}
if (count==0)
{
System.out.println("Prime");
}
}
}
 

//3. Program to print Fibonacci Series. 

class fibonacci
{
public static void main(String d[])
{
int a=0,b=1,c;
System.out.println(a);
System.out.println(b);
for(int i=2;i<10;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
 

//4. Program to check if a triangle is scalene, isosceles or equilateral.

class triangle
{
public static void main(String d[])
{
int a=6,b=6,c=10;
if(a==b && b==c && a==c)
{
System.out.println("Equilateral Triangle");
}
else if (a==b || a==c|| b==c)
{
System.out.println("Isosceles Triangle");
}
else
{
System.out.println("Scalene Triangle");
}
}
}
 

//5. Program to calculate simple interest.

class simple_interest
{
public static void main(String a[])
{
int p=1000,t=2,r=9,i;
i=p*t*r/100;
System.out.println("Interest is");
System.out.println(i);
}}

 

//6.Program to  swap two numbers.

class swap
{
public static void main(String d[])
{
int a=10,b=5;
System.out.print("a=");
System.out.println(a);
System.out.print("b=");
System.out.println(b);
int c;
c=a;
a=b;
b=c;
System.out.print("a=");
System.out.println(a);
System.out.print("b=");
System.out.println(b);
}
}