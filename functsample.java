import java.util.*;
class Sample
{
Scanner sc=new Scanner(System.in);
int a,b,sum;
public static void main(String[] args)
{
Sample obj=new Sample();
obj.add();
}
void add()
{
System.out.println("enter a and b");
a=sc.nextInt();
b=sc.nextInt();
sum=a+b;
System.out.print(sum);
}
}