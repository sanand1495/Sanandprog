/*11.Accept character from command line and perform below operations. 
Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and print it well as its code point. 
If it is in uppercase then convert it into lower case and print it well as its code point.*/


class Check{
    public static void main(String args[])
    { String name = args[0];
    char ch = name.charAt(index:0);

    boolean b1 = Character.isDigit(ch);
    if(b1==true){
    System.out.println(args[0]);
    System.out.println(" code point : "+name.codePointAt(index:0) );
    }
    else
    {
        boolean b2= Character.isLowerCase(ch);
        if(b2==true){
            char ch2= Character.toUpperCase(ch);
            System.out.println("converting the argument to uppercase : "+ch2);
            System.out.println("code point : "+ name.codePointAt(index:0) );

        }
        else {
            char ch3= Character.toLowerCase(ch);
            System.out.println("converting the argument to lower case : "+ch3);
            System.out.println("code point : "+ name.codePointAt(index:0) );
        }
    }

    }
}