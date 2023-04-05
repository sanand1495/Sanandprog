class BooleanToString
{
    public static void main(String args[])
    {
        boolean b= true;
        String str = String.valueOf(b);
        System.out.println("boolean to string ="+str);
   Boolean res = Boolean.valueOf(b);
   System.out.println("Boolean instance="+res);
   String s="False";
   boolean b2= Boolean.parseBoolean(s);
   Boolean b1= Boolean.valueOf(s);
   System.out.println("String to boolean= "+b2);
   System.out.println("String to boolean instance= "+b1);
    

    }
}