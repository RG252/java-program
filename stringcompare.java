import java.lang.*;
class hello
{
public static void main(String []args)
{
String s1="ACE";
String s2=new String("ACE");
String s3=s1.toLowerCase();
System.out.println(s3);
String s4=s3.toUpperCase();
System.out.println(s4);
char c=s4.charAt(1);
System.out.println(+c);
int b=s4.compareTo(s3);
if(b>0||b<0)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}

}
}