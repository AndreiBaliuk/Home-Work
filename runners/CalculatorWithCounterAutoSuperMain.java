package homework3.runners;

import homework3.calcs.simple.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

  public static void main(String[] args) {
    CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

    //(4.1 + 15 * 7 + ((28.0 / 5) * (28.0 / 5)));
    double div = calculator.division(28, 5);
    double ex = calculator.exponentiation(div, 2);
    double inc = calculator.increase(15, 7);
    double add = calculator.addition(inc, ex);
    double add2 = calculator.addition(4.1, add);
    long count2 = calculator.getCountOperation();

    System.out.println(add2);  // 140.45999999999998
    System.out.println(count2);
  }

}
