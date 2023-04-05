/*Write a program to convert state of Integer instance into byte, short, int, long, float and double.*/

public class Convert_int {
    public static void main(String args[])
    {
        int i=2500;
        Integer i1=new Integer(i);
        byte b= i1.byteValue();
        short s= i1.shortValue();
        int a=i1.intValue();
        long l=i1.longValue();
        float f= i1.floatValue();
        double d=i1.doubleValue();
System.out.println(b+" "+s+" "+a+" "+l+" "+f+" "+d);
        


    }
    
}
