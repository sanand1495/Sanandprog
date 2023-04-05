/*Write a program to convert state of Float instance into byte, short, int, long, float and double.*/

public class ff {
    public static void main(String args[])
    {
    float i=2500.50f;
        Float i1=new Float(i);
        byte b= i1.byteValue();
        short s= i1.shortValue();
        int a=i1.intValue();
        long l=i1.longValue();
        float f= i1.floatValue();
        double d=i1.doubleValue();
System.out.println(b+" "+s+" "+a+" "+l+" "+f+" "+d);
        
    
}
}
