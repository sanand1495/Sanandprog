/*Pass integer, float and double value from command line.
 Parse it appropriately and perform arithmetic operations (+,-,*,/) on it. Here you can you switch case.*/

 import java.util.Scanner;

public class parses {
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        System.out.println("enter the in");
        int i = sc.nextInt();
        System.out.println("enter the float");
        float f = sc.nextFloat();
        System.out.println("enter the double");
        double d = sc.nextDouble();
        System.out.println("enter thr choice:");
        String c = sc.next();
        switch(c){
            case "+":
            {
                double sum1 = (float)i+f;
                double sum2 = (double)i+d;
                double sum3 = (double)f+d;
                System.out.println(sum1+"  "+sum2+"  "+sum3);
                break;
            }
            case "-":
            {
                double diff1 = f-(float)i;
                double diff2 = d-(double)i;
                double diff3 = d-(double)f;
                System.out.println(diff1+"  "+diff2+"  "+diff3);
                break;
            }
            case "*":
            {
                double mul1= f*(float)i;
                double mul2= d*(double)i;
                double mul3= d*(double)f;
                System.out.println(mul1+"  "+mul2+"  "+mul3);
                break;
            }
            case "/":
            {
                double div1=f/(float)i;
                double div2=d/(double)i;
                double div3=d/(double)f;
                System.out.println(div1+"  "+div2+"  "+div3);
                 break;
            }
        }


    }
}
