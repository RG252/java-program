class Reverse
{  
public static void main (String[] args)
{
int a=53,rev=0;
System.out.print("before rev a="+a);
int rem=a%10;
int first=a/10;
rev=rem*10+first;
System.out.print("after rev rev="+rev);
}
}