package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregatioInterface implements ICalculator {

  long j;

  @Override
  public double division(double a, double b) {
    j++;
    return a / b;
  }

  @Override
  public double increase(double c, double d) {
    j++;
    return c * d;
  }

  @Override
  public double substracrion(double e, double f) {
    j++;
    return e - f;
  }

  @Override
  public double addition(double g, double h) {
    j++;
    return g + h;
  }

  @Override
  public double exponentiation(double i, int k) {
    j++;
    return Math.pow(i, k);
  }

  @Override
  public double module(double r) {
    j++;
    return Math.abs(r);
  }

  @Override
  public double root(double s) {
    j++;
    return Math.sqrt(s);
  }

  public long getCountOperation() {
    return j;
  }
}
