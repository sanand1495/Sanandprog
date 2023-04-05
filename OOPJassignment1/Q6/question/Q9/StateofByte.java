//Write a program to convert state of Byte instance into byte, short, int. long, float and double.



class state
{
    public static void main(String args[])
    {
       byte b= 111;
       Byte bb = new Byte(b);;
       byte b1 =bb.byteValue();;
       int b2=bb.intValue();;
       long b3=bb.longValue();
       float b4=bb.floatValue();
       double b5=bb.doubleValue();;
       System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5);;
    }
}