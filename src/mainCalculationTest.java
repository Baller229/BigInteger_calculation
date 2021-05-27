import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainCalculationTest {
    static String testResult = "137174210013717420998628257899862825790";
    static String testNum1 = "12345678901234567890";
    static String testNum2 = "11111111111111111111";
    static int[] testArr1 = new int[testNum1.length()];
    static int[] testArr2 = new int[testNum2.length()];


    @Test
     void BigIntTest()
    {
        assertEquals(testResult, BigIntCalc.multiplication(testNum1, testNum2));
    }

    @Test
    void BasicMultiplicationTest()
    {
        for(int i = testNum1.length()-1; i >= 0; i--)
        {
            testArr1[i] = testNum1.charAt(i) - '0';
        }
        for(int j = testNum2.length()-1; j >= 0; j--)
        {
            testArr2[j] = testNum2.charAt(j) - '0';
        }
        assertEquals(testResult, BigIntCalc.basicMultiplication(testArr1, testArr2));
    }

}