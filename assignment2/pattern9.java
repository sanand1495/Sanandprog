class pattern9
{
public static void main(String args[])
{ 
int m=65;
for(int i=1;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
for(int k=0;k<i;k++)
{
System.out.print((char)(m+k)+" ");

}
System.out.println();
}
}
}

