import java.util.*;
class inputarray
{
public static void main(String[] args)
{
int[] arr=new int[5];
String[] str=new String[5];
boolean[] boo=new boolean[5];
double[] doub=new double[5];
char[] cha=new char[5];
long[] lon=new long[5];
short[] sho=new short[5];
byte[] by=new byte[5];
float[] flo=new float[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
System.out.println("Enter numbers");
arr[i]=sc.nextInt();
}
{
System.out.print("the array of numbers is ");
for(int i=0;i<5;i++)
{
System.out.print(arr[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter string");
str[i]=sc.next();
}
{
System.out.print("the array of string is ");
for(int i=0;i<5;i++)
{
System.out.print(str[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter boolean");
boo[i]=sc.nextBoolean();
}
{
System.out.print("the array of boolean is ");
for(int i=0;i<5;i++)
{
System.out.print(boo[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter double");
doub[i]=sc.nextDouble();
}
{
System.out.print("the array of double is ");
for(int i=0;i<5;i++)
{
System.out.print(doub[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter character");
cha[i]=sc.next().charAt(0);
}
{
System.out.print("the array of characters is ");
for(int i=0;i<5;i++)
{
System.out.print(cha[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter long");
lon[i]=sc.nextLong();
}
{
System.out.print("the array of long is ");
for(int i=0;i<5;i++)
{
System.out.print(lon[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter short");
sho[i]=sc.nextShort();
}
{
System.out.print("the array of short is ");
for(int i=0;i<5;i++)
{
System.out.print(sho[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter byte");
by[i]=sc.nextByte();
}
{
System.out.print("the array of bytes is ");
for(int i=0;i<5;i++)
{
System.out.print(by[i]+" ");
}
}
System.out.println();
for(int i=0;i<5;i++)
{
System.out.println("Enter float");
flo[i]=sc.nextFloat();
}
{
System.out.print("the array of float is ");
for(int i=0;i<5;i++)
{
System.out.print(flo[i]+" ");
}
}

}
}
