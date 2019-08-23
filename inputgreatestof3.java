import java.util.*;
class greatest
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter r,s,t");
double r=sc.nextInt();
double s=sc.nextInt();
double t=sc.nextInt();
if(r>s)
{
if(r>t)
System.out.println("greatest no= "+r);
else
System.out.println("greatest no= "+t);
}
else
{
if(s>t)
System.out.println("greatest no= "+s);
else
System.out.println("greatest no= "+t);
}
}
}