/*20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string*/

public class convert_L {
    public static void main(String args[])
    {
        long l = 12345;
        Long l1 = new Long(l);
        String s= l1.toString();
        Long l2= Long.valueOf(l);
        Long l3 = Long.valueOf(s);
        String s1= Long.toBinaryString(l);
        String s2 = Long.toOctalString(l);
        String s3 = Long.toHexString(l);
        System.out.println(l+" "+ s+" "+l2+" "+l3+" "+s1+" "+s2+" "+s3);



    }
    
}
