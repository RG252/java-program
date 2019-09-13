import java.util.*;
class students
{
public static void main(String[] args)
{
String[] names=new String[10];
int[] roll=new int[10];
char[] grade=new char[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("Enter name,rollno,grade");
names[i]=sc.next();
roll[i]=sc.nextInt();
grade[i]=sc.next().charAt(0);
}
for(int j=0;j<10;j++)
{
System.out.println("Student"+j+"rollno"+roll[j]+"name "+names[j]+"grade"+grade[j]);
}
}
}