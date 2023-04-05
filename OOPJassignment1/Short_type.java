/*12.Write a program to perform below operations on short type to get: 
a.The number of bits used to represent a short value 
b.The number of bytes used to represent a short value 
c. The minimum value a short 
d. The maximum value a short*/

public class Short_type {
    public static void main(String args[])
    {
        int a = Short.SIZE;
        System.out.println(a);
        int b = Short.BYTES;
        System.out.println(b);
        short c = Short.MIN_VALUE;;
        System.out.println(c);
        short d= Short.MAX_VALUE;;
        System.out.println(d);
    

    }
    
}
