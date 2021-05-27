import java.math.BigInteger;
import java.util.Scanner;

public class mainCalculation {


    public static String number1;
    public static String number2;
    public static int[] numberArr1;
    public static int[] numberArr2;

    public mainCalculation()
    {
    }

    public static void main(String[] args) {

        //Here you input 2 large numbers which are stored in string format
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number1: ");
        number1 = sc.nextLine();

        System.out.print("Please enter the number2: ");
        number2 = sc.nextLine();

        //Strings are transferred into Integer arrays
        numberArr1 = new int[number1.length()];
        numberArr2 = new int[number2.length()];

        for(int i = number1.length()-1; i >= 0; i--)
        {
            numberArr1[i] = number1.charAt(i) - '0';
        }
        for(int j = number2.length()-1; j >= 0; j--)
        {
            numberArr2[j] = number2.charAt(j) - '0';
        }

        //Created an object where I implement 2 different algorithms of calculation and provide them
        BigIntCalc result = new BigIntCalc();
        Measurement timeCheck = new Measurement();
        timeCheck.Start();
        System.out.println("Al1: The result of multiplication is: " + result.multiplication(number1, number2));
        timeCheck.Stop();
        System.out.println("Al1: Duration in micro second: " + timeCheck.GetDurationInMicroSec());

        timeCheck.Start();
        System.out.println("Al2: The result of multiplication is: " + result.basicMultiplication(numberArr1, numberArr2));
        timeCheck.Stop();
        System.out.println("Al2: Duration in micro second: " + timeCheck.GetDurationInMicroSec());

        BigInteger largeNum = new BigInteger(number1);
        BigInteger anotherLargeNum = new BigInteger(number2);
        timeCheck.Start();
        System.out.println("Al3: The result of multiplication is: " + result.multiplication0(largeNum, anotherLargeNum));
        timeCheck.Stop();
        System.out.println("Al3: Duration in micro second: " + timeCheck.GetDurationInMicroSec());

        //Checking if these 2 algorithms have the same result value
        System.out.println("checking algorithms... ");
        System.out.println("Comparing algorithms:" + result.compare(result.multiplication(number1, number2), result.basicMultiplication(numberArr1, numberArr2)));

    }
}

