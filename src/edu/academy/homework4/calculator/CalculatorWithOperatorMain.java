package edu.academy.calculator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();

//        //4.1 + 15 * 7 + (28 / 5) ^ 2
//        double div = calc.division(28, 5);
//        double pow = calc.power(div, 2);
//        double multi = calc.multiplication(15, 7);
//        double sum = calc.addition(4.1, multi);
//        double result = calc.addition(pow, sum);

//        System.out.println(result);

        double r1 = calc.addition(calc.power(calc.division(28, 5), 2), calc.addition(4.1, calc.multiplication(15, 7)));
        System.out.println(r1);
        System.out.println(calc.root(27));
        System.out.println(Math.cbrt(27));

        System.out.println(r1 / 0); // infinity
        System.out.println(r1 / 0.0d); // infinity
    }
}
