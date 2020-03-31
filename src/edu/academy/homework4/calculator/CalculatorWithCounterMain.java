package edu.academy.calculator;

import edu.academy.homework2.CalculatorWithOperator;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {

        CalculatorWithMath calculatorWithMath = new CalculatorWithMath();
        CalculatorWithCounter calculatorWithCounter = new CalculatorWithCounter(calculatorWithMath);

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = calculatorWithCounter.addition(calculatorWithCounter.addition(4.1,calculatorWithCounter.multiplication(15,7))
                ,calculatorWithCounter.power(calculatorWithCounter.division(28,5),2));

        System.out.println("The result is " + result + ", " + calculatorWithCounter.getCountOperation() + " operations were executed");

    }
}
