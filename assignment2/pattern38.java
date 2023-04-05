class pattern38
{
public static void main(String args[])
{ int n=0;
for(int i=1;i<=9;i++)
{ 
for( int j=8;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(k);
}

for(int m=1;m<i;m++)
{
	System.out.print(n);
	n--;
}
n=i;
System.out.println();
}
}
}