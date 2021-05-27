import java.math.BigInteger;


public class BigIntCalc {

    //======================================BitInteger Algorithm====================================
    //
    //==============================================================================================

    public static BigInteger multiplication(String number1, String number2)
    {

        BigInteger largeNum = new BigInteger(number1);
        BigInteger anotherLargeNum = new BigInteger(number2);
        largeNum = largeNum.multiply(anotherLargeNum);

        return largeNum;
    }

    //======================================Manual Multiplication Alogorithm========================
    //
    //==============================================================================================

    public static String basicMultiplication(int number1[], int number2[]) {
       
        int result[] = new int[number1.length + number2.length - 1];
        for (int i = number2.length - 1; i >= 0; i--) {
            for (int j = number1.length - 1; j >= 0; j--) {
                result[i + j] += number2[i] * number1[j];
            }
        }
       
        for (int k = result.length - 1; k > 0; k--) {
            int remainingNum = result[k] / 10;
            result[k - 1] += remainingNum;
            result[k] = result[k] % 10;
        }

        StringBuffer resultStr = new StringBuffer();
        for (int m = 0; m < result.length; m++) {
            resultStr.append(result[m]);
        }
        return resultStr.toString();
    }

    //======================================Method for comparing these 2 algorithms=================
    //
    //==============================================================================================

    public static boolean compare(Object al1, Object al2)
    {
        if (al1.toString().equals(al2))
        {
            return true;
        }
        else return false;
    }


}
