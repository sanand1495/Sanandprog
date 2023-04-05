class bytetostring
{
    public static void main(String args[])
    {
        byte b =23;
        String str = Byte.toString(b);
        System.out.println("byte to string="+str);
        Byte c = Byte.valueOf(b);
        System.out.println("byte to byte instance ="+ c);
        Byte a= Byte.valueOf(str);
        System.out.println("String to byte instance: "+a);

    }
}