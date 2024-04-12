package ie.atu.week10;

import ie.at.week10.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calculator newCalc;
    @Test

   void testAdd()
   {
       newCalc = new Calculator();
       int result = newCalc.add(4,6);
       assertEquals(10,newCalc.add(4,6));
   }
    @Test

    void testSubtract()
    {
        newCalc = new Calculator();
        int result = newCalc.subtract(4,6);
        assertEquals(10,newCalc.subtract(4,6));
    }
    @Test
    void testDivide()
    {
        newCalc = new Calculator();
        float result = newCalc.divide(5,2);
        assertEquals(2.5,newCalc.divide(5,2));
    }
@Test
    void testMultiply()
    {
        newCalc = new Calculator();
        int result = newCalc.multiply(4,6);
        assertEquals(10,newCalc.multiply(4,6));
    }
}
