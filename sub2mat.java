import java.util.*;
class add2array
{
public static void main(String[] args)
{
int row1,col1,row2,col2;
Scanner sc=new Scanner(System.in);
System.out.print("enter the no of rows and columns of 1st mat");
row1=sc.nextInt();
col1=sc.nextInt();
int[][] arr1=new int[row1][col1];
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
System.out.println("enter the no"+i+j);
arr1[i][j]=sc.nextInt();
}
}
System.out.print("enter the no of rows and columns of 2nd mat");
row2=sc.nextInt();
col2=sc.nextInt();
int[][] arr2=new int[row2][col2];
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
System.out.println("enter the no"+i+j);
arr2[i][j]=sc.nextInt();
}
}
if((row1==row2)&&(col1==col2))
{
int[][] arr3=new int[row1][col2];

System.out.println("the 2d subtraction array is");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col2;j++)
{
arr3[i][j]=arr1[i][j]-arr2[i][j];
System.out.print(arr3[i][j]+"  ");

}
System.out.print("\n");
}
}
else
System.out.println("the 2d subtraction is of array is not possible");
}
}