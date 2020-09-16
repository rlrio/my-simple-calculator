import exceptions.CalculatorException;
import org.junit.Assert;
import org.junit.Test;

public class SimpleCalculatorTest {

    @Test
    public void addition() {
        SimpleCalculator addTest = new SimpleCalculator("1", "5");
        double additionResult = addTest.addition(addTest);
        Assert.assertEquals(6.0, additionResult, 0.01);
    }

    @Test
    public void subtraction() {
        SimpleCalculator subTest = new SimpleCalculator("8", "5");
        double subtractionResult = subTest.subtraction(subTest);
        Assert.assertEquals(3, subtractionResult, 0.01);
    }

    @Test
    public void multiplication() {
        SimpleCalculator multTest = new SimpleCalculator("7", "5");
        double multiplicationResult = multTest.multiplication(multTest);
        Assert.assertEquals(35, multiplicationResult, 0.01);
    }

    @Test
    public void division() {
        SimpleCalculator divTest = new SimpleCalculator("10", "2");
        double divisionResult = divTest.division(divTest);
        Assert.assertEquals(5, divisionResult, 0.01);
    }

    @Test(expected = CalculatorException.class)
    public void divisionByZeroTest() {
        SimpleCalculator divTest = new SimpleCalculator("10", "0");
        divTest.division(divTest);
    }

    @Test(expected = CalculatorException.class)
    public void valueIsNotNumber() {
        SimpleCalculator testNotNumber = new SimpleCalculator("word", "1");
    }

}