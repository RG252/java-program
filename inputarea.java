import java.util.*;
class Area
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter r");
double r=sc.nextInt();
double a=Math.PI*r*r;
double c=2*Math.PI*r;
System.out.println("area of circle= "+a);
System.out.println("perimeter of circle= "+c);
}
}