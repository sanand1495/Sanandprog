/*Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value 
c. The minimum value a long 
d. The maximum value a long*/

public class Long_type {
    public static void main(String args[])
    {
        int bits = Long.SIZE;
        int byt =Long.BYTES;
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;

System.out.println(bits+" "+byt+" "+min+" "+max);
    }
    
}
