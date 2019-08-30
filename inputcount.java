import java.util.*;
class count
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
int countt=0;
while(number!=0)
{
number=number/10;
countt++;
}
System.out.println("The count is:"+countt);
}
}