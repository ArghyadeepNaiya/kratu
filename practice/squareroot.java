import java.util.*;
import java.math.*;
class squareroot
{
    public static void main(String[] args) 
        {
        Scanner an=new Scanner(System.in);
        double num1,num2;
        System.out.println("enter the first number");
        num1=an.nextDouble();
        System.out.println("enter the second number");
        num2=an.nextDouble();
        if (num1<0)
        {
            System.out.println("Square of negative number can't be determined");
        }
        else
        {
            double output1=Math.sqrt(num1);
            System.out.println("The square root of "+num1+" is "+output1);
        }
        if (num2<0)
        {
            System.out.println("Square of negative number can't be determined");
        }
        else
        {
            double output2=Math.sqrt(num2);
            System.out.println("The square root of "+num2+" is "+output2);
        }
    }
}