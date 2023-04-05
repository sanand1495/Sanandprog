/*Write a program to perform below operations on float type to get:
 a. The number of bits used to represent a float value 
 b. The number of bytes used to represent a float value 
 c. The minimum value a float 
 d. The maximum value a float*/

public class floating {
    public static void main(String args[])
    {
        float a= Float.SIZE;
        System.out.println("size of float in bits : "+a);
          float b=Float.BYTES;
          System.out.println("float in bytes : "+b);
          float c= Float.MIN_VALUE;
          System.out.println("min value of float : "+c);
          float d= Float.MAX_VALUE;
          System.out.println("max value of float : "+d);
  
    }
    
}
