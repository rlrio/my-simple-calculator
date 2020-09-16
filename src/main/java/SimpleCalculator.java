import exceptions.CalculatorException;

public class SimpleCalculator {
    private Double value1;
    private Double value2;

    public SimpleCalculator(String value1, String value2) {
        try {
            if (value1 == null || value2 == null) throw new CalculatorException("One or both values are empty.");
            this.value1 = Double.parseDouble(value1);
            this.value2 = Double.parseDouble(value2);
        }catch (Exception e) {
            throw new CalculatorException("One or both values are not numbers.");
        }
    }

    public Double addition(SimpleCalculator simpleCalculator) {
        return simpleCalculator.value1 + simpleCalculator.value2;
    }

    public Double subtraction(SimpleCalculator simpleCalculator) {
        return simpleCalculator.value1 - simpleCalculator.value2;
    }

    public Double multiplication(SimpleCalculator simpleCalculator) {
        return simpleCalculator.value1 * simpleCalculator.value2;
    }

    public Double division(SimpleCalculator simpleCalculator) {
        if (simpleCalculator.value2 == 0) throw new CalculatorException("It is impossible to divide by zero!");
        return simpleCalculator.value1 / simpleCalculator.value2;
    }

}
