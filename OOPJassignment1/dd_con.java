/*Write a program to convert state of Double instance into byte, short, int, long, float and double.*/

public class dd_con {
    public static void main(String args[])
    {
        
        double i=2500.500;
        Double i1=new Double(i);
        byte b= i1.byteValue();
        short s= i1.shortValue();
        int a=i1.intValue();
        long l=i1.longValue();
        float f= i1.floatValue();
        double d=i1.doubleValue();
System.out.println(b+" "+s+" "+a+" "+l+" "+f+" "+d);
        
    }
}
