import java.util.Scanner;
import java.math.*;
public class day55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //BIgInteger example
        System.out.print("Enter a number: ");
        BigInteger num1 = s.nextBigInteger();
        System.out.print("Enter another number: ");
        BigInteger num2 = s.nextBigInteger();
        BigInteger sum = num1.add(num2);
        System.out.println("The sum of the two numbers is: " + sum);
        

        //BigDecimal example
        System.out.print("Enter a number: ");
        BigDecimal num3 = s.nextBigDecimal();
        System.out.print("Enter another number: ");
        BigDecimal num4 = s.nextBigDecimal();
        BigDecimal product = num3.multiply(num4);
        System.out.println("The product of the two numbers is: " + product);
        s.close();
    }
}
