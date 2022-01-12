package homework3.calcs.simple;

import homework3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends implements
    ICalculator {
  private long countOperation2;

  @Override
  public double division(double a, double b) {
    countOperation2++;
    return super.division(a, b);
  }

  @Override
  public double increase(double c, double d) {
    countOperation2++;

    return super.increase(c, d);
  }

  @Override
  public double substracrion(double e, double f) {
    countOperation2++;

    return super.substracrion(e, f);
  }

  @Override
  public double addition(double g, double h) {
    countOperation2++;

    return super.addition(g, h);
  }

  @Override
  public double exponentiation(double i, int k) {
    countOperation2++;

    return super.exponentiation(i, k);
  }

  @Override
  public double module(double r) {
    countOperation2++;

    return super.module(r);
  }

  @Override
  public double root(double s) {
    countOperation2++;

    return super.root(s);
  }

  public long getCountOperation() {

    return countOperation2++;
  }
}
