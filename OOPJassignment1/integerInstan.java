/*Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.*/

public class integerInstan {
    public static void main(String args[])
    {
        int i =300;
        String s=Integer.toString(i);
        System.out.println("String of int : "+s);
        Integer i1=new Integer(i);
        System.out.println("integer instance of int : "+i1);
        int i2= Integer.valueOf(s);
        System.out.println("integer inst of string inst : "+i2);
        String i3= Integer.toBinaryString(i);
        System.out.println("binary of int : "+i3);
        String oct=Integer.toOctalString(i);
        System.out.println("octal of int : "+oct);
        String hex=Integer.toHexString(i);
        System.out.println("hexadecimal of int : "+hex);

        


    }
    
}
