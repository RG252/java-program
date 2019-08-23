import java.util.*;
class powerr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
double r=sc.nextInt();
double sq=r*r;
double cube=r*r*r;
double sqrt=Math.sqrt(r);
double cbrt=Math.cbrt(r);
System.out.println("square of no= "+sq);
System.out.println("squareroot of no= "+sqrt);
System.out.println("cube of no= "+cube);
System.out.println("cuberoot of no= "+cbrt);
}
}