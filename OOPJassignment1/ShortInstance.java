/*14.Write a program to convert state of Short instance into byte, short, int, long, float and double.*/

public class ShortInstance {
    public static void main(String args[])
    {
        short s =123;
        Short b = new Short(s);
        byte a1 =b.byteValue();
        short a2= b.shortValue();
        int a3=b.intValue();
        long a4=b.longValue();
        float a5=b.floatValue();
        double a6=b.doubleValue();
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6);
    }
    
}
