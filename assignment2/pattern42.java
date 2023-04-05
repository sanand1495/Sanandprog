class pattern42
{public static void main(String args[])
	{
for(int i=6;i>=1;i--)
{
for( int j=1;j<=6;j++)
{
if(j==1 || j==i || (i==6 && i!=j))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}
