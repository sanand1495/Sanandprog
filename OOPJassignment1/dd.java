/*Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value 
b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double*/

public class dd {
    public static void main(String args[])
    {

    double a= Double.SIZE;
      System.out.println("size of double in bits : "+a);
        int b=Double.BYTES;
        System.out.println("double in bytes : "+b);
        double c= Double.MIN_VALUE;
        System.out.println("min value of double : "+c);
        double d= Double.MAX_VALUE;
        System.out.println("max value of double : "+d);
}
}
