import java.math.*;
import java.util.*;
class max {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner an=new Scanner(System.in);
        System.out.println("enter the first number");
        num1=an.nextDouble();
        System.out.println("enter the second number");
        num2=an.nextDouble();
        System.out.println("enter the third number");
        num3=an.nextDouble();
        double num4=Math.max(num1,num2);
        double num5=Math.max(num1, num3);
        double num6=Math.max(num2,num3);
    }    
}
