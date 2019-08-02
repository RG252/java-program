class Digits
{  
public static void main (String[] args)
{
int a=126;
int last=a%10;
int first=a/100;
int mid=a/10%10;
System.out.print("first digit="+first);
System.out.print(" second digit="+mid);
System.out.print(" last digit="+last);
}
}