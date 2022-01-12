package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
    do {
      i *= i;
    } while (k == 0);
    k++;
    return i;                                    // возведение в степень
  }

  public double module(double r) {
    if (r >= 0) {
      System.out.println(r);
    } else {
      System.out.println(r * -1);
    }
    return r;                                   // модуль числа
  }

  public double root(double s) {
    Math.sqrt(s);
    return s;                                  // квадратный корень
    }

  }

