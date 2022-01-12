package homework3.calcs.additional;

import homework3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
  public long i;

  public void incrementCountOperation (){
     i++;
  }
  public long getCounterOperation (){
    return i;
  }

}
