/*Write a program to convert state of Long instance into byte, short, int, long, float and double.*/

public class long_inst {
    public static void main(String args[])
    {
        long g =2023;
        Long l = new Long(g);
        int i = l.intValue();
        byte b = l.byteValue();
        short s =l.shortValue();
        float f = l.floatValue();
        double d= l.doubleValue();
        System.out.println("byte= "+b);
        System.out.println("integer= "+i);
        System.out.println("short= "+s);
        System.out.println("long= "+l);
        System.out.println("float= "+f);
        System.out.println("double= "+d);


    }
    
}
