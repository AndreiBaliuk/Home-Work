package homework3.runners;

import homework3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

  public static void main(String[] args) {
    CalculatorWithCounterClassic calculator =new CalculatorWithCounterClassic();

    //(4.1 + 15 * 7 + ((28.0 / 5) * (28.0 / 5)));
    double div = calculator.division(28, 5);
    calculator.incrementCountOperation();
    double ex = calculator.exponentiation(div, 2);
    calculator.incrementCountOperation();
    double inc = calculator.increase(15, 7);
    calculator.incrementCountOperation();
    double add = calculator.addition(inc, ex);
    calculator.incrementCountOperation();
    double add2 = calculator.addition(4.1, add);
    calculator.incrementCountOperation();

    System.out.println(add2);   // 140.45999999999998
    System.out.println(calculator.getCounterOperation());
  }

}
