import java.util.*;
class array2d
{
public static void main(String[] args)
{
int row,col;
Scanner sc=new Scanner(System.in);
System.out.print("enter the no of rows and columns");
row=sc.nextInt();
col=sc.nextInt();
int[][] arr=new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.println("enter the no"+i+j);
arr[i][j]=sc.nextInt();
}
}
System.out.println("the 2d array is");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(arr[i][j]+"  ");

}
System.out.print("\n");
}
}
}