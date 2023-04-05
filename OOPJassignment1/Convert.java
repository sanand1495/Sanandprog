/*Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.*/

public class Convert {
    public static void main(String args[])
    {
        short s =123;
        Short b = new Short(s);
        String s1 = b.toString();
        System.out.println(s1);
        System.out.println(b);
        short a = Short.valueOf(s1);
        System.out.println(a);
        


    }
    
}
