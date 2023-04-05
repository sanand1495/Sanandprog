/*Write a program to perform below operations on int type to get: 
a. The number of bits used to represent a integer value 
b. The number of bytes used to represent a integer value 
c. The minimum value a integer 
d. The maximum value a integer
*/
public class Integerget {
    public static void main(String args[])
    {
        int a= Integer.SIZE;
      System.out.println("size of int in bits : "+a);
        int b=Integer.BYTES;
        System.out.println("int in bytes : "+b);
        int c= Integer.MIN_VALUE;
        System.out.println("min value of int : "+c);
        int d= Integer.MAX_VALUE;
        System.out.println("max value of int : "+d);


    }
    
}
