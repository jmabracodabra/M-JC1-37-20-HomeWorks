package edu.academy.homework2;

public class CalculatorWithOperator {

    public double division(double a, double b) {
        double c = a / b;
        return c;
    }

    public double multiplication(double a, double b) {
        double d = a * b;
        return d;
    }

    public double subtraction(double a, double b) {
        double e = a - b;
        return e;
    }

    public double addition(double a, double b) {
        double f = a + b;
        return f;
    }

    public double power(double a, double b) {

        if (b == 0) {
            return 1;
        }

        double c = a;
        for (int i = 1; i < this.absolute(b); i++) {
            c = c * a;
        }
        if (b < 0) {
            return 1 / c;
        }
        return c;
    }

    public double absolute(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public double root(double a, double b) {
        double temp;
        double sqRoot = a / b;
        do {
            temp = sqRoot;
            sqRoot = (temp + (a / temp)) / b;
        } while ((temp - sqRoot) != 0);

        return sqRoot;

    }

}
