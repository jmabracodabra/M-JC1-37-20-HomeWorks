package edu.academy.calculator;

public class CalculatorWithCounter implements ICalculator{

   private int count;
   private ICalculator calc;

   public CalculatorWithCounter(ICalculator calc){
       this.calc = calc;
   }

    public double division(double a, double b) {
        count++;
        return calc.division(a,b);
    }

    public double multiplication(double a, double b) {
        count++;
        return calc.multiplication(a,b);
    }

    public double subtraction(double a, double b) {
        count++;
        return calc.subtraction(a,b);
    }

    public double addition(double a, double b) {
        count++;
        return calc.addition(a,b);
    }

    public double power(double a, double b) {
        count++;
        return calc.power(a,b);
    }

    public double absolute(double a) {
        count++;
        return calc.absolute(a);
    }

    public double root(double a) {
        count++;
        return calc.root(a);
    }

    public int getCountOperation(){
       return count;
    }

}
