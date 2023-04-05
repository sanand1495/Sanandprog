/*Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string*/

public class convert_f {
    
    public static void main(String args[])
    {
        float i =300.05f;
        String s=Float.toString(i);
        System.out.println("String of float : "+s);
        Float i1=new Float(i);
        System.out.println("float instance of float : "+i1);
        float i2= Float.valueOf(s);
        System.out.println("float inst of string inst : "+i2);
        
        String hex=Float.toHexString(i);
        System.out.println("hexadecimal of float : "+hex);
    }
}
