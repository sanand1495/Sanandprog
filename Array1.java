import java.util.Scanner;
class Array1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr= new int[5];
for(int i=0;i<5;i++)
{
System.out.println("Enter element:");
arr[i]=sc.nextInt();
}
for(int j:arr)
{System.out.println(j);
}
}
}
