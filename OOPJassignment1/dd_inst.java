/*Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToLongBits() method along with methods of Long class).*/

public class dd_inst {
    public static void main(String args[])
    {
        double d= 25000.250;
        String str = Double.toString(d);
        Double d1= new Double(d);
        Double d2= Double.valueOf(str);
        long bi = Double.doubleToLongBits(d);
        String hex = Double.toHexString(d);
        System.out.println(d+" "+str+" "+d1+" "+d2+" "+bi+" "+hex);

    }
    
}
