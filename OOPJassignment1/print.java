/*Write a program to accept and print full name as an argument from command line.*/

import java.util.Scanner;
public class print {
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        System.out.println("enter the full name");
          String str = sc.nextLine();
          System.out.println("String is : "+str);
    }
    
}
