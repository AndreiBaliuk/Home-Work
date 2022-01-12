package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

  @Override
  public double division(double a, double b) {
    return super.division(a, b);
  }

  @Override
  public double increase(double c, double d) {
    return super.increase(c, d);
  }

  @Override
  public double substracrion(double e, double f) {
    return super.substracrion(e, f);
  }

  @Override
  public double addition(double g, double h) {
    return super.addition(g, h);
  }

  @Override
  public double exponentiation(double i, int k) {
    return Math.pow(i, k);
  }

  @Override
  public double module(double r) {
    return Math.abs(r);
  }

  @Override
  public double root(double s) {
    return Math.sqrt(s);
  }
}
