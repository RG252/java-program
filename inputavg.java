import java.util.*;
class Marks
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter marks of 1st sub");
    int a =sc.nextInt();
    System.out.println("Enter marks of 2nd sub ");
    int b=sc.nextInt();
    System.out.println("Enter marks of 3rd sub");
    int c=sc.nextInt();
    System.out.println("Enter marks of 4th sub");
    int d=sc.nextInt();
    float e=a+b+c+d;
    float avg=e/4;
    System.out.println("Average="+avg);
    
    
    
    
   }
}
