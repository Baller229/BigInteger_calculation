import java.math.BigInteger;


public class BigIntCalc {

    public static BigInteger multiplication(String number1, String number2)
    {
        
        BigInteger largeNum = new BigInteger(number1);
        BigInteger anotherLargeNum = new BigInteger(number2);
        largeNum = largeNum.multiply(anotherLargeNum);
        System.out.println("The result of multiplication these nums is: " + largeNum);

        return largeNum;
    }
}