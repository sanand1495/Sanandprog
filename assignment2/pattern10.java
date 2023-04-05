class pattern10
{
public static void main(String args[])
{
int m=70;
for(int i=1;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int k=i;k>0;k--)
{
System.out.print((char)(m-k)+" ");
}
System.out.println();
}
}
}
