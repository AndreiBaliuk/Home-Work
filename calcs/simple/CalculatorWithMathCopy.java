package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
  public double division(double a, double b) {

    return a / b;                                  // деление
  }

  public double increase(double c, double d) {
    return c * d;                                 // умножение
  }

  public double substracrion(double e, double f) {
    return e - f;                                  // вычитание
  }

  public double addition(double g, double h) {
    return g + h;                                 // сложение
  }

  public double exponentiation(double i, int k) {

    return Math.pow(i, k);                                 // возведение в степень
  }

  public double module(double r) {

    return Math.abs(r);                                   // модуль числа
  }

  public double root(double s) {

    return Math.sqrt(s);                                  // квадратный корень
  }

}
