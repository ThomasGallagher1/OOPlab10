package ie.at.week10;

public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        int result = firstNum + secondNum;
        return result;
    }

    public int subtract(int firstNum, int secondNum)
    {
        int result = firstNum - secondNum;
        return result;
    }

    public float divide(int firstNum, int secondNum)
    {
        float result = firstNum / (float)secondNum;
        return result;
    }

    public int multiply(int firstNum, int secondNum)
    {
        int result = firstNum * secondNum;
        return result;
    }
}
