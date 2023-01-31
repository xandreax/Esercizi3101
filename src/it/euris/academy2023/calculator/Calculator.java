package it.euris.academy2023.calculator;

public class Calculator {

    CalculationEngine engine;

    public Calculator() {
    }

    public Calculator(CalculationEngine engine) {
        this.engine = engine;
    }

    public void add(float a, float b) {
        if (checkEngine()) {
            float result = engine.add(a, b);
            System.out.println(a + " + " + b + " = " + result);
        } else
            printNoEngine();
    }

    public void sub(float a, float b) {
        if (checkEngine()) {
            float result = engine.sub(a, b);
            System.out.println(a + " - " + b + " = " + result);
        } else
            printNoEngine();
    }

    public void mult(float a, float b) {
        if (checkEngine()) {
            float result = engine.mult(a, b);
            System.out.println(a + " * " + b + " = " + result);
        } else
            printNoEngine();
    }

    public void div(float a, float b) {
        if (checkEngine()) {
            float result = engine.div(a, b);
            System.out.println(a + " / " + b + " = " + result);
        } else
            printNoEngine();
    }

    public void setEngine(CalculationEngine engine) {
        this.engine = engine;
    }

    private void printNoEngine() {
        System.out.println("The CalculatorEngine has not been set");
    }

    private boolean checkEngine() {
        return this.engine != null;
    }
}
