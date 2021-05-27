import java.util.Scanner;

public class mainCalculation {


    public static void main(String[] args) {


        //Here you input 2 large numbers which are stored in string format
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number1: ");
        String num1 = sc.nextLine();

        System.out.print("Please enter the number2: ");
        String num2 = sc.nextLine();

        //Strings are transferred into Integer arrays
         int[] numArr1 = new int[num1.length()];
         int[] numArr2 = new int[num2.length()];

        for(int i = num1.length()-1; i >= 0; i--)
        {
            numArr1[i] = num1.charAt(i) - '0';
        }
        for(int j = num2.length()-1; j >= 0; j--)
        {
            numArr2[j] = num2.charAt(j) - '0';
        }

        //Created an object where I implement 2 different algorithms of calculation and provide them
        BigIntCalc result = new BigIntCalc();
        Measurement timeCheck = new Measurement();
        timeCheck.Start();
        System.out.println("Al1: The result of multiplication is: " + result.multiplication(num1, num2));
        timeCheck.Stop();
        System.out.println("Al1: Duration in micro second: " + timeCheck.GetDurationInMicroSec());

        timeCheck.Start();
        System.out.println("Al2: The result of multiplication is: " + result.basicMultiplication(numArr1, numArr2));
        timeCheck.Stop();
        System.out.println("Al1: Duration in micro second: " + timeCheck.GetDurationInMicroSec());

        //Checking if these 2 algorithms have the same result value
        System.out.println("checking algorithms... ");
        System.out.println("Comparing algorithms:" + result.compare(result.multiplication(num1, num2), result.basicMultiplication(numArr1, numArr2)));

    }
}

