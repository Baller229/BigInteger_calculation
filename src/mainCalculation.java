import java.util.Scanner;
import java.math.BigInteger;

public class mainCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number1: ");
        String num1 = sc.nextLine();

        System.out.print("Please enter the number2: ");
        String num2 = sc.nextLine();

        System.out.println( "Big Number1: " + num1 );
        System.out.println("Big Number2: " + num2 );

        BigIntCalc result = new BigIntCalc();
        result.multiplication(num1, num2);


    }
}

