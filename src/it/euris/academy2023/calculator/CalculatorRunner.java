package it.euris.academy2023.calculator;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // test no engine path
        calculator.add(4f, 6f);

        calculator.setEngine(new CalculationEngine() {
            @Override
            public float add(float a, float b) {
                return a + b;
            }

            @Override
            public float sub(float a, float b) {
                return a - b;
            }

            @Override
            public float mult(float a, float b) {
                return a * b;
            }

            @Override
            public float div(float a, float b) {
                return a / b;
            }
        });

        // test esempi
        calculator.add(5.0f, 4.0f);
        calculator.sub(10.0f, 3.0f);
        calculator.mult(5f, 3f);
        calculator.div(40f, 3f);

    }
}
