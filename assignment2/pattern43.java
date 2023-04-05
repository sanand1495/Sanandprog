class pattern43
{
public static void main(String args[])
{
for (int i = 6; i >= 1; i--) {
            
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = i; j <= 6; j++) {
                if(j==i||j==6||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            
            System.out.println();
}
}
}
